package com.ninyjun.erp.customer.custsdk.api;

import com.ninyjun.erp.common.httpresult.HttpResult;
import com.ninyjun.erp.common.svcclient.SvcClientBase;
import com.ninyjun.erp.customer.custsdk.model.CustomerDTO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;


public class CustSvcClient extends SvcClientBase {


    public CustSvcClient() {
        this.setHttpSvc("custsvc","/");
    }

    public CustSvcClient(String svcName) {
        this.setHttpSvc(svcName,"/");
    }

    public CustomerDTO getByCustId(Long custId) {
        setUrl("/v1/customer/" + custId.toString());

        //方法1:
        //String acct1  = restTemp.getForObject(this.getApiUrl() + acctId.toString()
        //        ,String.class);
        //HttpResult<Account>  resultAccount = JSON.parseObject(acct1,new HttpResult<Account>().getClass());


        //方法2：报错
       // HttpResult<Account> acct  = restTemp.getForObject(this.getApiUrl() + acctId.toString()
        //        ,new HttpResult.class);


        //方法3：方法也行
        HttpResult<CustomerDTO> response = restTemp.exchange(this.getApiUrl(),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference< HttpResult<CustomerDTO> >() {}).getBody();


        return response.getData();
    }
}
