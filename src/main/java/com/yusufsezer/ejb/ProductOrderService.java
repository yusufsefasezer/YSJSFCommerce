package com.yusufsezer.ejb;

import com.yusufsezer.contract.AbstractService;
import com.yusufsezer.entity.ProductOrder;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class ProductOrderService extends AbstractService<ProductOrder> {

    @PersistenceContext
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductOrderService() {
        super(ProductOrder.class);
    }

}
