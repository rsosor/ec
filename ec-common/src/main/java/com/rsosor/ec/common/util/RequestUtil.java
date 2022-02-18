package com.rsosor.ec.common.util;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 請求工具類
 *
 * @author RsosoR
 * @date 2022/2/16
 */
public class RequestUtil {

    /**
     * 獲取請求真實 IP 地址
     */
    public static String getRequestIp(HttpServletRequest request) {
        // 通過 HTTP 代理伺服器轉發時添加
        String ipAddress = request.getHeader("x-forwarded-for");
        if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("Proxy-Client-IP");
        }
        if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ipAddress == null || ipAddress.length() == 0 || "known".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getRemoteAddr();
            // 從本地訪問時根據網卡取本機配置的 IP
            if (ipAddress.equals("127.0.0.1") || ipAddress.equals("0:0:0:0:0:0:0:1")) {
                InetAddress inetAddress = null;
                try {
                    inetAddress = InetAddress.getLocalHost();
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }
                ipAddress = inetAddress.getHostAddress();
            }
        }
        // 通過多個代理轉發的情況，第一個 IP 為客戶端真實 IP，多個 IP 會按照 ',' 分割
        if (ipAddress != null && ipAddress.length() > 15) {
            if (ipAddress.indexOf(",") > 0) {
                ipAddress = ipAddress.substring(0, ipAddress.indexOf(","));
            }
        }
        return ipAddress;
    }
}
