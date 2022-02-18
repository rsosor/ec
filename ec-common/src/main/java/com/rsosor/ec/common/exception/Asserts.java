package com.rsosor.ec.common.exception;

import com.rsosor.ec.common.api.IErrorCode;

/**
 * 斷言處理類，用於拋出各種 API 異常
 *
 * @author RsosoR
 * @date 2022/2/16
 */
public class Asserts {

    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
