package com.rsosor.ec.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis 相關配置
 *
 * @author RsosoR
 * @date 2022/1/19
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.rsosor.ec.mapper, com.rsosor.ec.dao"})
public class MyBatisConfig {
}
