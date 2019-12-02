/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package cn.ccsn.api.exception;


/**
 * 
 * @author runzhi
 */
public class CcsnApiException extends Exception {

    private static final long serialVersionUID = -238091758285157331L;

    private String            errCode;
    private String            errMsg;

    public CcsnApiException() {
        super();
    }

    public CcsnApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public CcsnApiException(String message) {
        super(message);
    }

    public CcsnApiException(Throwable cause) {
        super(cause);
    }

    public CcsnApiException(String errCode, String errMsg) {
        super(errCode + ":" + errMsg);
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public String getErrCode() {
        return this.errCode;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

}