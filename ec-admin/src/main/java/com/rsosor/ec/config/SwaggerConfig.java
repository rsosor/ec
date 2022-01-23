package com.rsosor.ec.config;

import com.rsosor.ec.common.config.BaseSwaggerConfig;
import com.rsosor.ec.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API 文檔相關配置
 *
 * @author RsosoR
 * @date 2022/1/23
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.rsosor.ec.controller")
                .title("ec 後台系統")
                .description("ec 後台相關接口文檔")
                .contactName("rsosor")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
