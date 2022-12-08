package com.example.macnssapp.Service;



import com.example.macnssapp.Entity.User;
import com.example.macnssapp.Repository.UserRepository;
import com.example.macnssapp.Repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class UserServiceImpl  {


    UserRepositoryImpl userRepository;

    public User findByUsername(Long id){
        return userRepository.getOne(id);
    }

}
