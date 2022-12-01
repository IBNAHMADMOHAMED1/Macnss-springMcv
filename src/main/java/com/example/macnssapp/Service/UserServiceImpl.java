package com.example.macnssapp.Service;

import com.example.macnssapp.Entity.User;
import com.example.macnssapp.Repository.UserRepository;
import com.example.macnssapp.Repository.UserRepositoryImpl;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public User register(User user) {
        // TODO Auto-generated method stub
        return userRepository.save(user);
    }
}
