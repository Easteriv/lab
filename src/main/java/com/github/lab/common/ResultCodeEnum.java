package com.github.lab.common;

/**
 * @author zhaojiejun
 * @version V1.0
 * @date 2020/6/7 12:59 上午
 * @description 自定义错误码
 **/
public enum ResultCodeEnum {
    /**
     * 系统异常
     */
    OK("00000", "success"),
    FAIL("00001", "system error"),
    DATA_IS_NOT_EXIST("00001", "数据不存在");

    private final String errorCode;
    private final String errorMsg;

    ResultCodeEnum(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }


    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
