package com.example.study.exception.file;

/**
 * @author 大王
 * @Description:公共异常类
 * @Copyright 晶安智慧
 * @date 2019年7月26日 上午10:26:32
 * =================Modify Record=================
 * @Modifier    @date			 @Content
 * 大王     2019年7月26日 上午10:26:32	新建
 */
public class BusinessException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 7273352196413714727L;

    // 异常编码
    private String errorCode;

    // 异常信息
    private String errorMessage;

    public BusinessException() {
        super();
    }

    public BusinessException(String message) {
        super(message);
        errorMessage = message;
    }

    public BusinessException(String format, Object... args) {
        this(String.format(format, args));
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
        errorMessage = message;
    }

    public BusinessException(String errorCode, String errorMessage, Throwable cause) {
        super(errorMessage, cause);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorcode() {
        return errorCode;
    }

    public String getErrormessage() {
        return errorMessage;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}