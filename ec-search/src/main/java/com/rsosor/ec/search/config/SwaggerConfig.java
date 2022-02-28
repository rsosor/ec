package com.rsosor.ec.search.config;

import com.rsosor.ec.common.config.BaseSwaggerConfig;
import com.rsosor.ec.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API 文檔相關配置
 *
 * @author RsosoR
 * @date 2022/2/28
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.rsosor.ec.search.controller")
                .title("ec 搜索系統")
                .description("ec 搜索相關介面文檔")
                .contactName("rsosor")
                .version("0.0.1")
                .enableSecurity(false)
                .build();
    }
}
