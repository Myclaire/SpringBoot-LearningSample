package com.cl.common.result;

/**
 * @Description 统一异常类
 * @Author Chenglong
 * @Creat At 2019-11-22 14:51
 */
public enum ExceptionMsg {
    SUCCESS("0", "操作成功"),
    FAILED("-1", "系统繁忙，请稍后再试");

    private String code;

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private String msg;

    ExceptionMsg(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
