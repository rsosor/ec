package com.rsosor.ec.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis 相關配置
 *
 * @author RsosoR
 * @date 2022/2/28
 */
@Configuration
@MapperScan({"com.rsosor.ec.mapper", "com.rsosor.ec.search.dao"})
public class MyBatisConfig {
}
