package com.ninyjun.erp.account.acctbalancesvc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.ninyjun.erp.account.acctbalance.repository")
public class AcctbalancesvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(AcctbalancesvcApplication.class, args);
    }

}
