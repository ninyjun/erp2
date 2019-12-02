package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class DemoApplication implements CommandLineRunner {
    @Autowired
    PlayConfig pc;

    @Autowired
    private Environment env;
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

       // PlayConfig pc = new PlayConfig();
       // System.out.println(pc.getWorkerConfig().toString());
    }


/*
    @GetMapping(value = "/worker", produces = "application/json;charset=utf-8")
    @ResponseBody
    public String getProduct() {
        //   pc = new PlayConfig();
        return  pc.toString();
    }*/

    @Override
    public void run(String... args) throws Exception {
        System.out.println(pc.toString());
    }
}
