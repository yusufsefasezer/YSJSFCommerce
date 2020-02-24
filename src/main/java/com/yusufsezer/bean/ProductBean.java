package com.yusufsezer.bean;

import com.yusufsezer.ejb.ProductService;
import com.yusufsezer.entity.Product;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.Dependent;
import javax.inject.Named;

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
