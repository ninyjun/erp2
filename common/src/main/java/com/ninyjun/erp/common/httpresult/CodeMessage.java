package com.ninyjun.erp.common.httpresult;

public class CodeMessage {

    private int code;
    private String msg;

    //通用的错误码
    public static CodeMessage SUCCESS = new CodeMessage(0, "success");

    public static CodeMessage DATABASE_ERROR = new CodeMessage(900001, "数据库操作异常: %s");
    public static CodeMessage SERVER_ERROR = new CodeMessage(500100, "服务端异常");
    public static CodeMessage BIND_ERROR = new CodeMessage(500101, "参数校验异常：%s");
    public static CodeMessage ACCESS_LIMIT_REACHED= new CodeMessage(500104, "访问高峰期，请稍等！");


    //产品中心 100000
    public static CodeMessage PROD_NOT_EXIST = new CodeMessage(100000, "产品不存在: %s");
    public static CodeMessage PROD_CREATE_ERROR = new CodeMessage(100001, "产品创建失败！");

    //账户中心 200000
    public static CodeMessage ACCT_NOT_EXIST = new CodeMessage(200000, "账户不存在: %s");
    public static CodeMessage ACCT_CREATE_ERROR = new CodeMessage(200001, "账户创建失败！");

    //客户中心 300000
    public static CodeMessage CUST_NOT_EXIST = new CodeMessage(300000, "客户不存在: %s");
    public static CodeMessage CUST_CREATE_ERROR = new CodeMessage(300001, "客户创建失败！");


    //商品模块 5003XX

    //订单模块 5004XX


    private CodeMessage(int code, String msg) {
        this.code = code;
        this.msg = msg;
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





    /**
     * 返回带参数的错误码
     * @param args
     * @return
     */
    public CodeMessage fillArgs(Object... args) {
        int code = this.code;
        String message = String.format(this.msg, args);
        return new CodeMessage(code, message);
    }

    @Override
    public String toString() {
        return "CodeMessage [code=" + code + ", msg=" + msg + "]";
    }


}