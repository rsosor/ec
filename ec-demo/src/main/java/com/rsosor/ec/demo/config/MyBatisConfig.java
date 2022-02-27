package com.rsosor.ec.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis 相關配置
 *
 * @author RsosoR
 * @date 2022/2/26
 */
@Configuration
@MapperScan("com.rsosor.ec.mapper")
public class MyBatisConfig {
}
