package com.hhr.exception;

/**
 * 账户ID不存在 导致的 登陆失败异常
 */

public class NotExistException extends RuntimeException {

    public NotExistException(String message) {
        super(message);
    }

    public NotExistException(String message, Throwable cause) {
        super(message, cause);
    }

}
