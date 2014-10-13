package com.gmail.krvmax.dao;

import com.gmail.krvmax.entity.User;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Diland on 31.07.2014.
 */

@Transactional
public class UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public User getUserById(long id) {
        return entityManager.find(User.class, id);
    }


    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
