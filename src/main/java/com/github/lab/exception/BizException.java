package com.github.lab.exception;

import lombok.Getter;

/**
 * @author zhaojiejun
 * @date 2021/4/14 9:55 下午
 **/
@Getter
public class BizException extends RuntimeException{
    /**
     * 错误码
     */
    protected String errorCode;
    /**
     * 错误信息
     */
    protected String errorMsg;

    public BizException() {
        super();
    }

    public BizException(String errorCode, String errorMsg) {
        super(errorCode);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
}
