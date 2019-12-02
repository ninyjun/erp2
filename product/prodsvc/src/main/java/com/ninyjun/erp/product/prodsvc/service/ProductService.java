package com.ninyjun.erp.product.prodsvc.service;


import com.ninyjun.erp.product.prodsvc.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProductByMatcher(String pym,Integer limit);


    Product getProductByCode(Integer code);

     int createProduct(List<Product> prods);
}