package com.ninyjun.erp.account.acctbalancesvc.service.impl;

import com.ninyjun.erp.account.acctbalancesvc.repository.AccountBalanceExtraMapper;
import com.ninyjun.erp.account.acctbalancesvc.repository.AccountBalanceMapper;
import com.ninyjun.erp.account.acctbalancesvc.service.AccountBalanceService;
import com.ninyjun.erp.account.acctsdk.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountBalanceServiceImpl implements AccountBalanceService {

    @Autowired
    private AccountBalanceMapper acctBalanceRepo;


    @Autowired
    private AccountBalanceExtraMapper acctBalanceExtraRepo;



    @Override
    public List<AccountBalanceDTO> getByAcctId(Long acctId) {

        List<AccountBalance> abs = acctBalanceRepo.selectByAcctId(acctId);

        List<AccountBalanceDTO> dtoList = new ArrayList<>();

        for (AccountBalance ab : abs){
            List<AccountBalanceExtra> extras
                    = acctBalanceExtraRepo.selectByAcctBalanceId(ab.getAcctBalanceId());

            AccountBalanceDTO dto = new AccountBalanceDTO();
            dto.setAcctBalance(ab);
            if (extras != null)
                dto.setAcctBalanceExtras(extras);

            dtoList.add(dto);
        }


        return dtoList;
    }
}
