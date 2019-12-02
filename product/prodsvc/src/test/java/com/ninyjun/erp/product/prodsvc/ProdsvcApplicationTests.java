package com.ninyjun.erp.product.prodsvc;

import com.alibaba.fastjson.JSONArray;
import com.ninyjun.erp.common.httpresult.HttpResult;
import com.ninyjun.erp.product.prodsvc.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ProdsvcApplicationTests {

    @Autowired
    RestTemplate restTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    void callProd() {


        // HttpResult<List<Product> >().getClass();

        //校验：客户资料，账户资料

        HttpResult<List<Product> >  lsP  = restTemplate.getForObject("http://localhost:8080/v1/products?pym=d&limit=123"
                ,new HttpResult<List<Product> >().getClass());

    //   HttpResult<List<Product> >  lst = (HttpResult<List<Product>>) JSONArray.parse(data);
        JSONArray.toJSON(lsP).toString();

        System.out.println(JSONArray.toJSON(lsP).toString());
    }


}
