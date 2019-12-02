package com.ninyjun.erp.order.chargesvc.controller;

import com.ninyjun.erp.account.acctsdk.api.AcctSvcClient;
import com.ninyjun.erp.account.acctsdk.model.AccountDTO;
import com.ninyjun.erp.common.httpresult.CodeMessage;
import com.ninyjun.erp.common.httpresult.HttpResult;

import com.ninyjun.erp.customer.custsdk.api.CustSvcClient;
import com.ninyjun.erp.customer.custsdk.model.CustomerDTO;
import com.ninyjun.erp.order.chargesvc.service.ChargeService;

import com.ninyjun.erp.order.ordersdk.model.ChargeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ChargeController {

    private AcctSvcClient acctSvcClient = new AcctSvcClient();
    private CustSvcClient custSvcClient = new CustSvcClient();

    @Autowired
    private ChargeService chargeSvc;

    @PostMapping("/v1/charge")
    @ResponseBody
    public HttpResult<ChargeDTO> createProduct(@RequestBody ChargeDTO charge) {

        //校验：客户资料，账户资料
        AccountDTO acctDTO = acctSvcClient.getByAcctId(charge.getCharge().getAcctId());
        if (acctDTO.getAccount() == null)
            ; //
        CustomerDTO custDTO = custSvcClient.getByCustId(charge.getCharge().getCustId());
        if (custDTO.getCustomer() == null)
            ;//

        try
        {
            chargeSvc.charge(charge);

        }catch(Exception ex){
            HttpResult.error(CodeMessage.DATABASE_ERROR.fillArgs(ex.toString()));
        }

        return HttpResult.success(charge);
    }

}
