package com.hhr.exception;

/**
 * 账户ID与账户密码不匹配 导致的 登陆失败异常
 */

public class FailException extends RuntimeException {

    public FailException(String message) {
        super(message);
    }

    public FailException(String message, Throwable cause) {
        super(message, cause);
    }

}
