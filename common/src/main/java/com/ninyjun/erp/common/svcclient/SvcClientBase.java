package com.ninyjun.erp.common.svcclient;


import org.springframework.web.client.RestTemplate;

public abstract class SvcClientBase {

    protected RestTemplate restTemp = new RestTemplate();

    public String getSvcName() {
        return svcName;
    }

    public void setSvcName(String svcName) {
        this.svcName = svcName;
    }


    public void setHttpSvc(String svc,String url,int port,String protocal){
        this.setSvcName(svc);
        this.setUrl(url);
        this.setPort(port);
        this.setProtocol(protocal);
    }

    public void setHttpSvc(String svc,String url,int port){
        setHttpSvc(svc,url,port,"http://");
    }

    public void setHttpSvc(String svc,String url){
        setHttpSvc(svc,url,8080,"http://");
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    private String protocol;
    private String svcName;
    private int port = 8080;
    private String url;

    public String getApiUrl() {

        return protocol + svcName + ":" + new Integer(port).toString() +  url;
    }


}
