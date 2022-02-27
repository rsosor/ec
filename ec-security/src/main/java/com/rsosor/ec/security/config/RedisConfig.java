package com.rsosor.ec.security.config;

import com.rsosor.ec.common.config.BaseRedisConfig;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 * Redis 配置類
 *
 * @author RsosoR
 * @date 2022/2/27
 */
@EnableCaching
@Configuration
public class RedisConfig extends BaseRedisConfig {
}
