package com.yusufsezer.bean;

import com.yusufsezer.ejb.ProductService;
import com.yusufsezer.entity.Product;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Named;
import java.util.List;

@Named
@Dependent
public class ProductBean {

    private List<Product> products;

    @EJB
    private ProductService productService;

    @PostConstruct
    public void init() {
        products = productService.findAll();
    }

    public List<Product> getProducts() {
        return products;
    }

}
