package com.rsosor.ec.security.annotation;

import java.lang.annotation.*;

/**
 * 自定義注解，有該注解的緩存方法會拋出異常
 *
 * @author RsosoR
 * @date 2022/2/28
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CacheException {
}
