package com.hhr.exception;

/**
 * 系统未知原因 导致的 注册、登陆、数据同步失败异常
 */

public class ErrorException extends RuntimeException {

    public ErrorException(String message) {
        super(message);
    }

    public ErrorException(String message, Throwable cause) {
        super(message, cause);
    }

}
