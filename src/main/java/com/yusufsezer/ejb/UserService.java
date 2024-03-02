package com.yusufsezer.ejb;

import com.yusufsezer.contract.AbstractService;
import com.yusufsezer.entity.User;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class UserService extends AbstractService<User> {

    @PersistenceContext
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserService() {
        super(User.class);
    }

}
