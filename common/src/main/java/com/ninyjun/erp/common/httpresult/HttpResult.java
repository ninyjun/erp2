package com.ninyjun.erp.common.httpresult;

public class HttpResult<T> {

    private int code;
    private String msg;
    private T data;
    public HttpResult() {

    }



    /**
     * 成功时候的调用
     */
    public static <T> HttpResult<T> success(T data) {
        return new HttpResult<T>(data);
    }

    /**
     * 失败时候的调用
     */
    public static <T> HttpResult<T> error(int errCode, String msg) {
        return new HttpResult<T>(errCode, msg);
    }

    public static  <T> HttpResult<T> error(CodeMessage codeMsg){
        return new HttpResult<T>(codeMsg);
    }


    public HttpResult(T data) {
        this.data = data;
        this.msg = "OK";
    }

    private HttpResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private HttpResult(CodeMessage codeMsg) {
        if(codeMsg != null) {
            this.code = codeMsg.getCode();
            this.msg = codeMsg.getMsg();
        }
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}