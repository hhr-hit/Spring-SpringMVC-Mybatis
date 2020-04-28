package com.hhr.exception;

/**
 * 账户ID已存在 导致的 注册失败异常
 */

public class ExistException extends RuntimeException {

    public ExistException(String message) {
        super(message);
    }

    public ExistException(String message, Throwable cause) {
        super(message, cause);
    }

}
