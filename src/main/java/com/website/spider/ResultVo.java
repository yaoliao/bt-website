package com.website.spider;

import java.io.Serializable;

/**
 * @author 小新
 * @date 2018/7/19
 */

public class ResultVo implements Serializable {
    private static final long serialVersionUID = -4645596430845624124L;

    private String code;
    private String msg;
    private Boolean success;
    private String traceId;

    private DataVo data;

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

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public DataVo getData() {
        return data;
    }

    public void setData(DataVo data) {
        this.data = data;
    }
}
