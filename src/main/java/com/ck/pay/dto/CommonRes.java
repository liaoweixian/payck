package com.ck.pay.dto;

public class CommonRes<V> {

    private int code;
    private String msg;
    private V data;

    public static CommonRes data() {

        CommonRes<Object> commonRes = new CommonRes<>();
        commonRes.setCode(200);
        commonRes.setMsg("操作成功");
        commonRes.setData(null);
        return commonRes;
    }

    public CommonRes(int code, String msg, V data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public CommonRes() {
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

    public V getData() {
        return data;
    }

    public void setData(V data) {
        this.data = data;
    }
}
