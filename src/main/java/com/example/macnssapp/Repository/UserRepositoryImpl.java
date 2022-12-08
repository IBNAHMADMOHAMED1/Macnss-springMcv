package com.example.macnssapp.Repository;

import com.example.macnssapp.Entity.User;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;



@Component
@Repository
public abstract class UserRepositoryImpl implements JpaRepository<User, Long> {

    private EntityManager em;

    @Transactional
    public User save(User user) {
        em.persist(user);
        em.flush();
        return  user;
    }

    @Transactional
    @Override
    public User getOne(Long id) {
        return em.find(User.class, id);
    }


}
