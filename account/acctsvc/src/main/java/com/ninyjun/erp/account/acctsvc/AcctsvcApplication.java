package com.ninyjun.erp.account.acctsvc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.ninyjun.erp.account.acctsvc.repository")
public class AcctsvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(AcctsvcApplication.class, args);
    }

}
