package com.ninyjun.erp.account.acctsvc.service.impl;

import com.ninyjun.erp.account.acctsdk.model.Account;
import com.ninyjun.erp.account.acctsdk.model.AccountBankAcctno;
import com.ninyjun.erp.account.acctsdk.model.AccountDTO;
import com.ninyjun.erp.account.acctsdk.model.AccountExtra;
import com.ninyjun.erp.account.acctsvc.repository.AccountBankAcctnoMapper;
import com.ninyjun.erp.account.acctsvc.repository.AccountExtraMapper;
import com.ninyjun.erp.account.acctsvc.repository.AccountMapper;
import com.ninyjun.erp.account.acctsvc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper acctRepo;


    @Autowired
    private AccountExtraMapper acctExtraRepo;


    @Autowired
    private AccountBankAcctnoMapper acctBankAcctnoRepo;

    @Override
    public AccountDTO getAccountByAcctId(Long acctId) {

        Account acct = acctRepo.selectByPrimaryKey(acctId);
        List<AccountExtra> acctExtras = acctExtraRepo.selectByAcctId(acctId);
        List<AccountBankAcctno> acctBanks = acctBankAcctnoRepo.selectByAcctId(acctId);

        return new AccountDTO(acct,acctExtras,acctBanks);
    }
}
