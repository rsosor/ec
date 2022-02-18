package com.rsosor.ec.security.util;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * JwtToken 生成的工具類
 * JWT token 的格式: header.payload.signature
 * header 的格式(算法、token 的類型): {"alg": "HS512", "typ": "JWT"}
 * payload 的格式(用戶名、創建時間、生成時間): {"sub": "wang", "created": 1489079981393, "exp": 1489684781}
 * signature 的生成算法: HMACSHA512(base64UrlEncode(header) + "." + base64UrlEncode(payload), secret)
 *
 * @author RsosoR
 * @date 2022/2/14
 */
public class JwtTokenUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(JwtTokenUtil.class);
    private static final String CLAIN_KEY_USERNAME = "sub";
    private static final String CLAIN_KEY_CREATED = "created";

    @Value("${jwt.secret}")
    private String secret;
    @Value("${jwt.expiration}")
    private Long expiration;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    /**
     * 根據負責生成 JWT 的 token
     */
    private String generateToken(Map<String, Object> claims) {
        return Jwts.builder()
                .setClaims(claims)
                .setExpiration(generateExpirationDate())
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }

    /**
     * 從 token 中獲取 JWT 中的負載
     */
    private Claims getClaimsFromToken(String token) {
        Claims claims = null;
        try {
            claims = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();
        } catch (Exception e) {
            LOGGER.info("JWT 格式驗證失敗:{}", token);
        }
        return claims;
    }

    /**
     * 生成 token 的過期時間
     */
    private Date generateExpirationDate() {
        return new Date(System.currentTimeMillis() + expiration * 1000);
    }

    /**
     * 從 token 中獲取登錄用戶名
     */
    public String getUserNameFromToken(String token) {
        String username;
        try {
            Claims claims = getClaimsFromToken(token);
            username = claims.getSubject();
        } catch (Exception e) {
            username = null;
        }
        return username;
    }

    /**
     * 驗證 token 是否還有效
     * @param token 客戶端傳入的 token
     * @param userDetails 從數據庫中查詢出來的用戶訊息
     * @return
     */
    public boolean validateToken(String token, UserDetails userDetails) {
        String username = getUserNameFromToken(token);
        return username.equals(userDetails.getUsername()) && !isTokenExpired(token);
    }

    /**
     * 判斷 token 是否已經失效
     */
    private boolean isTokenExpired(String token) {
        Date expiredDate = getExpiredDateFromToken(token);
        return expiredDate.before(new Date());
    }

    /**
     * 從 token 中獲取過期時間
     */
    private Date getExpiredDateFromToken(String token) {
        Claims claims = getClaimsFromToken(token);
        return claims.getExpiration();
    }

    /**
     * 根據用戶訊息生成 token
     */
    public String generateToken(UserDetails userDetails) {
        Map<String, Object> claims = new HashMap<>();
        claims.put(CLAIN_KEY_USERNAME, userDetails.getUsername());
        claims.put(CLAIN_KEY_CREATED, new Date());
        return generateToken(claims);
    }

    /**
     * 當原來的 token 沒過期時是可以刷新的
     * @param oldToken 帶 tokenHead 的 token
     * @return
     */
    public String refreshHeadToken(String oldToken) {
        if (StrUtil.isEmpty(oldToken)) {
            return null;
        }
        String token = oldToken.substring(tokenHead.length());
        if (StrUtil.isEmpty(token)) {
            return null;
        }
        // token 驗證不通過
        Claims claims = getClaimsFromToken(token);
        if (claims == null) {
            return null;
        }
        // 如果 token 已經過期，不支持刷新
        if (isTokenExpired(token)) {
            return null;
        }
        // 如果 token 在 30 分鐘之內剛刷新過，返回原 token
        if (tokenRefreshJustBefore(token, 30 * 60)) {
            return token;
        } else {
            claims.put(CLAIN_KEY_CREATED, new Date());
            return generateToken(claims);
        }
    }

    /**
     * 判斷 token 在指定時間內是否剛剛刷新過
     * @param token 原 token
     * @param time 指定時間(秒)
     * @return
     */
    private boolean tokenRefreshJustBefore(String token, int time) {
        Claims claims = getClaimsFromToken(token);
        Date created = claims.get(CLAIN_KEY_CREATED, Date.class);
        Date refreshDate = new Date();
        // 刷新時間在創建時間的指定時間內
        if (refreshDate.after(created) && refreshDate.before(DateUtil.offsetSecond(created, time))) {
            return true;
        }
        return false;
    }
}
