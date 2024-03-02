package com.yusufsezer.ejb;

import com.yusufsezer.contract.AbstractService;
import com.yusufsezer.entity.Address;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class AddressService extends AbstractService<Address> {

    @PersistenceContext
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AddressService() {
        super(Address.class);
    }

}
