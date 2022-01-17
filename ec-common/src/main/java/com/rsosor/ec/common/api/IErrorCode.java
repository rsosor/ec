package com.rsosor.ec.common.api;

/**
 * 常用 API 返回對象接口
 *
 * @author RsosoR
 * @date 2022/1/15
 */
public interface IErrorCode {

    /**
     * 返回碼
     */
    long getCode();

    /**
     * 返回信息
     */
    String getMessage();
}
