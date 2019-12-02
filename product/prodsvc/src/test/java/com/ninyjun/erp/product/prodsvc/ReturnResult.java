package com.ninyjun.erp.product.prodsvc;

import com.ninyjun.erp.common.httpresult.CodeMessage;
import com.ninyjun.erp.product.prodsvc.model.Product;

import java.util.List;

public class ReturnResult {

    private int code;
    private String msg;
    private List<Product> data;

    public ReturnResult() {

    }


    public ReturnResult(List<Product> data) {
        this.data = data;
        this.msg = "OK";
    }

    private ReturnResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private ReturnResult(CodeMessage codeMsg) {
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

    public List<Product> getData() {
        return data;
    }

    public void setData(List<Product> data) {
        this.data = data;
    }
}