package com.ninyjun.erp.product.prodsvc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.ninyjun.erp.product.prodsvc.repository")
public class ProdsvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProdsvcApplication.class, args);
    }

}
