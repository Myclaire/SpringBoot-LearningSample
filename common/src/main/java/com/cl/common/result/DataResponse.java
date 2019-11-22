package com.cl.common.result;

import org.springframework.stereotype.Component;

/**
 * @Description 返回Rest风格的数据结构
 * @Author Chenglong
 * @Creat At 2019-11-22 14:15
 */
@Component
public class DataResponse {

    private boolean success;
    private String code;
    private String msg;
    private Object data;

    public DataResponse() {
    }

    public DataResponse(boolean success, String code, String msg, Object data) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public DataResponse(String code, Object data) {
        this.success = true;
        this.code = code;
        this.msg = "操作成功";
        this.data = data;
    }

    public DataResponse (Object data) {
        this.success = true;
        this.code = "0";
        this.msg = "操作成功";
        this.data = data;
    }

    public DataResponse(ExceptionMsg msg) {
        this.success = false;
        this.code = msg.getCode();
        this.msg = msg.getMsg();
        this.data = null;
    }

    public DataResponse success(Object data){
        DataResponse response = new DataResponse();
        response.setCode("0");
        response.setMsg("操作成功");
        response.setData(data);
        response.setSuccess(true);
        return response;
    }

    @Override
    public String toString() {
        return "DataResponse{" +
                "success=" + success +
                ", code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}