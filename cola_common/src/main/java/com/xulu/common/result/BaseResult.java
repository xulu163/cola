package com.xulu.common.result;

import java.io.Serializable;

/**
 * @author xulu
 * @date 2018/8/27
 * @link https://github.com/xulu163
 */
public class BaseResult<T> implements Serializable{

    private T data;

    private int code;

    private String msg;

    public BaseResult(T data, int code, String msg){
        super();
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
