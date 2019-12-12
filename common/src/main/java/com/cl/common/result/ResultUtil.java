package com.cl.common.result;

import java.util.List;
import java.util.Map;
/**
 * @Description util for result
 * @Author Chenglong
 * @Creat At 2019-12-11 18:50
 */
public class ResultUtil {

    public static DataResponse success(List<Map<String, String>> data) {
        return new DataResponse(0, "success", data);
    }

    public static DataResponse success(Object data) {
        return new DataResponse(0, "success", data);
    }

    public static DataResponse success() {
        return success(null);
    }

    public static DataResponse error(Integer code, String msg) {
        DataResponse response = new DataResponse();
        response.setErrNo(code);
        response.setErrMsg(msg);
        return response;
    }
}

