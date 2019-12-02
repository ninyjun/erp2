package com.ninyjun.erp.order.chargesvc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan(basePackages = "com.ninyjun.erp.order.chargesvc.repository")
@EnableFeignClients
public class ChargesvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChargesvcApplication.class, args);
    }

}
