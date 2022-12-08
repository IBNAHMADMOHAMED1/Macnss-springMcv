package com.example.macnssapp.Service;

import com.example.macnssapp.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
@Service
public interface UserService extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
