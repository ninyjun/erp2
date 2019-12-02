package com.example.demo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest
class DemoApplicationTests {
@Autowired
WorkerConfig config;
    @Test
    void contextLoads() {
    }


    @Test
    void getValue(){
        System.out.println(env.toString());
        PlayConfig pc = new PlayConfig();
        System.out.println(pc.getWorkerConfig().toString());
        int i = 0;
    }
    @Autowired
    private Environment env;
}
