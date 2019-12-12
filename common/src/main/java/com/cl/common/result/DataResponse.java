package com.cl.common.result;

import java.util.List;
import java.util.Map;

/**
 * @Description return the rest-style data structures
 * @Author Chenglong
 * @Creat At 2019-12-11 14:15
 */
public class DataResponse {

    private int errNo;
    private String errMsg;
    private Object data;

    public DataResponse() {
    }

    public DataResponse(int errNo, String errMsg, List<Map<String, String>> data) {
        this.errNo = errNo;
        this.errMsg = errMsg;
        this.data = data;
    }

    public DataResponse(int errNo, String errMsg, Object data) {
        this.errNo = errNo;
        this.errMsg = errMsg;
        this.data = data;
    }

    public int getErrNo() {
        return errNo;
    }

    public void setErrNo(int errNo) {
        this.errNo = errNo;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setData(List<Map<String, String>> data) {
        this.data = data;
    }
}