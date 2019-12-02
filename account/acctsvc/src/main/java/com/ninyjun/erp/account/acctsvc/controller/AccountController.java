package com.ninyjun.erp.account.acctsvc.controller;

import com.ninyjun.erp.account.acctsdk.model.AccountDTO;
import com.ninyjun.erp.account.acctsvc.service.AccountService;
import com.ninyjun.erp.common.httpresult.CodeMessage;
import com.ninyjun.erp.common.httpresult.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {
    @Autowired
    AccountService acctSvc;

    @GetMapping(value = "/v1/account/{acctid}", produces = "application/json;charset=utf-8")
    @ResponseBody
    public HttpResult<AccountDTO> getProduct(@PathVariable(value="acctid",required = true) Long acctid) {
        AccountDTO acct = null;
        try
        {
            acct = acctSvc.getAccountByAcctId(acctid);
            if (acct == null){
                return HttpResult.error(CodeMessage.ACCT_NOT_EXIST.fillArgs(acctid.toString()));
            }
        }catch(Exception ex) {
            HttpResult.error(CodeMessage.DATABASE_ERROR.fillArgs(ex.toString()));
        }

        return HttpResult.success(acct);
    }

}
