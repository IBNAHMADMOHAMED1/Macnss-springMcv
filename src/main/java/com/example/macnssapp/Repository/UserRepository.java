package com.example.macnssapp.Repository;

import com.example.macnssapp.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {


}
