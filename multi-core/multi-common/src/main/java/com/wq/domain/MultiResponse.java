package com.wq.domain;

public class MultiResponse<T> {
    private static String SUCCESS="0";
    private static String FAIL="-1";
    private static String ERROR="500";
    public String code;
    public String message;
    public T data;

    public MultiResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public MultiResponse(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static MultiResponse success(){
        return new MultiResponse(SUCCESS,"请求成功",null);
    }
    public static MultiResponse success(Object data){
        return new MultiResponse(SUCCESS,"请求成功",data);
    }
    public static MultiResponse fail(String message){
        return new MultiResponse(FAIL,message);
    }
}
