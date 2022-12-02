package com.example.macnssapp.Repository;

import com.example.macnssapp.Entity.User;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;



@Component
@Repository
public class UserRepositoryImpl implements UserRepository {


    private EntityManager em;

    @Override
    @Transactional
    public User save(User user) {
        em.persist(user);
        em.flush();
        return  user;
    }
}
