package com.rsosor.ec.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * 全局跨域配置
 *
 * @author RsosoR
 * @date 2022/1/30
 */
@Configuration
public class GlobalCorsConfig {

    /**
     * 允許跨域調用的過濾器
     */
    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();
        // 允許所有域名進行跨域調用
        config.addAllowedOrigin("*");
        // 允許跨越發送 cookie
        config.setAllowCredentials(true);
        // 放行全部原始頭訊息
        config.addAllowedHeader("*");
        // 允許所有請求方法跨域調用
        config.addAllowedMethod("*");

        // 添加映射路徑
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        // 返回新的 CorsFilter
        return new CorsFilter(source);
    }
}
