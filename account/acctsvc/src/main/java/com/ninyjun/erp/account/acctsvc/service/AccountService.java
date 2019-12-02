package com.ninyjun.erp.account.acctsvc.service;

import com.ninyjun.erp.account.acctsdk.model.AccountDTO;

public interface AccountService {
    AccountDTO getAccountByAcctId(Long acctId);
}
