package com.rsosor.ec.demo.config;

import com.rsosor.ec.common.config.BaseSwaggerConfig;
import com.rsosor.ec.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API 文檔相關配置
 *
 * @author RsosoR
 * @date 2022/2/26
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.rsosor.ec.demo.controller")
                .title("ec-demo 系統")
                .description("SpringBoot 版本中的一些示例")
                .contactName("rsosor")
                .version("0.0.1")
                .enableSecurity(true)
                .build();
    }
}
