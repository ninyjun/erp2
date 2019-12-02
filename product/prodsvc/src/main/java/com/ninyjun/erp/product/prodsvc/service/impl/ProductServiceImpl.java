package com.ninyjun.erp.product.prodsvc.service.impl;

import com.ninyjun.erp.product.prodsvc.model.Product;
import com.ninyjun.erp.product.prodsvc.repository.ProductMapper;
import com.ninyjun.erp.product.prodsvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper prodRepo;

    @Override
    public List<Product> getProductByMatcher(String pym,Integer limit) {
        limit = (limit < 1 ? 100 :limit);
        limit = (limit > 1000 ? 1000 :limit);
        return prodRepo.selectMatchPym(pym+"%",limit);
    }

    @Override
    public Product getProductByCode(Integer code) {
        return prodRepo.selectByPrimaryKey(code);
    }

    @Transactional( rollbackFor = Exception.class, timeout = 5000)
    public int createProduct(List<Product> prods){
        for (Product prod : prods){
            prodRepo.insert(prod);
        }
        return prods.size();
    }
}
