package com.yusufsezer.ejb;

import com.yusufsezer.contract.AbstractService;
import com.yusufsezer.entity.Product;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class ProductService extends AbstractService<Product> {

    @PersistenceContext
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductService() {
        super(Product.class);
    }

}
