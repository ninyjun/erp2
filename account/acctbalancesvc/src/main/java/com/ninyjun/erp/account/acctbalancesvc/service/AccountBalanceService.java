package com.ninyjun.erp.account.acctbalancesvc.service;

import com.ninyjun.erp.account.acctsdk.model.AccountBalanceDTO;

import java.util.List;


public interface AccountBalanceService {
    List<AccountBalanceDTO> getByAcctId(Long acctId);
}
