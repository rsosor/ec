package com.rsosor.ec.common.api;

/**
 * 常用 API 返回對象
 *
 * @author RsosoR
 * @date 2022/1/15
 */
public enum ResultCode implements IErrorCode {

    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失敗"),
    VALIDATE_FAILED(404, "參數檢驗失敗"),
    UNAUTHORIZED(401, "暫未登錄或 token 已經過期"),
    FORBIDDEN(403, "沒有相關權限");

    private long code;

    private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
