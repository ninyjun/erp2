package com.ninyjun.erp.customer.custsvc.controller;

import com.ninyjun.erp.common.httpresult.CodeMessage;
import com.ninyjun.erp.common.httpresult.HttpResult;
import com.ninyjun.erp.customer.custsdk.model.CustomerDTO;
import com.ninyjun.erp.customer.custsvc.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class CustomerController {

    @Autowired
    CustomerService custSvc;

    @GetMapping(value = "/v1/customer/{custid}", produces = "application/json;charset=utf-8")
    @ResponseBody
    public HttpResult<CustomerDTO> getProduct(@PathVariable(value="custid",required = true) Long custId) {
        CustomerDTO cust = null;
        try
        {
            cust = custSvc.getByCustId(custId);
            if (cust == null){
                return HttpResult.error(CodeMessage.CUST_NOT_EXIST.fillArgs(custId.toString()));
            }
        }catch(Exception ex) {
            HttpResult.error(CodeMessage.DATABASE_ERROR.fillArgs(ex.toString()));
        }

        return HttpResult.success(cust);
    }

}
