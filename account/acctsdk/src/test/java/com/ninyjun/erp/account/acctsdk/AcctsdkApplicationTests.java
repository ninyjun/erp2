package com.ninyjun.erp.account.acctsdk;



import com.ninyjun.erp.account.acctsdk.api.AcctBalanceSvcClient;
import com.ninyjun.erp.account.acctsdk.api.AcctSvcClient;
import com.ninyjun.erp.account.acctsdk.model.Account;
import com.ninyjun.erp.account.acctsdk.model.AccountBalanceDTO;
import com.ninyjun.erp.account.acctsdk.model.AccountDTO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class AcctsdkApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void getAccountByAcctId() {
        AcctSvcClient clnt = new AcctSvcClient("localhost");

        AccountDTO acct = clnt.getByAcctId(123L);

        System.out.println(acct.toString());

        acct = clnt.getByAcctId(125L);

        System.out.println(acct.toString());

    }

    @Test
    void getAccountBalanceByAcctId() {
        AcctBalanceSvcClient clnt = new AcctBalanceSvcClient("localhost");

        List<AccountBalanceDTO> acct = clnt.getByAcctId(123L);

        System.out.println(acct.toString());

        acct = clnt.getByAcctId(125L);

        System.out.println(acct.toString());
    }

}
