package com.ninyjun.erp.product.prodsvc.controller;

import com.ninyjun.erp.common.httpresult.CodeMessage;
import com.ninyjun.erp.common.httpresult.HttpResult;
import com.ninyjun.erp.product.prodsvc.model.Product;
import com.ninyjun.erp.product.prodsvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService prodSvc;

   // http://localhost:8080/v1/products?pym=abc&limit=123
    @GetMapping(value = "/v1/products", produces = "application/json;charset=utf-8")
    //@GetMapping("/v1/products"),以上解决中文乱码
    @ResponseBody
    public HttpResult<List<Product> > getProducts(@RequestParam(value="pym",required = true) String  pym
                                    , @RequestParam(value="limit") Integer  limit) {
        List<Product> prods = null;
        try
        {
           prods = prodSvc.getProductByMatcher(pym,limit);
           if (prods == null){
               return HttpResult.error(CodeMessage.PROD_NOT_EXIST);
           }

        }catch (Exception ex){
            HttpResult.error(CodeMessage.DATABASE_ERROR.fillArgs(ex.toString()));
        }


        return  HttpResult.success(prods);

    }

    @GetMapping("/v1/product/{productcode}")
    @ResponseBody
    public HttpResult<Product> getProduct(@PathVariable(value="productcode",required = true) Integer productcode) {
        Product prod = null;
        try
        {
            prod = prodSvc.getProductByCode(productcode);
            if (prod == null){
                return HttpResult.error(CodeMessage.PROD_NOT_EXIST.fillArgs(productcode.toString()));
            }
        }catch(Exception ex) {
            HttpResult.error(CodeMessage.DATABASE_ERROR.fillArgs(ex.toString()));
        }

        return HttpResult.success(prod);
    }


    @PostMapping("/v1/products")
    @ResponseBody
    public HttpResult<List<Product>> createProduct(@RequestBody List<Product> prods) {
        try
        {
            prodSvc.createProduct(prods);
        }catch(Exception ex){
            HttpResult.error(CodeMessage.DATABASE_ERROR.fillArgs(ex.toString()));
        }

        return HttpResult.success(prods);
    }

}
