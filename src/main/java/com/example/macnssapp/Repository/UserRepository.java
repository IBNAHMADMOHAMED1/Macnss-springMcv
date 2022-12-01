package com.example.macnssapp.Repository;

import com.example.macnssapp.Entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

public interface UserRepository {
   User save(User user);

}
