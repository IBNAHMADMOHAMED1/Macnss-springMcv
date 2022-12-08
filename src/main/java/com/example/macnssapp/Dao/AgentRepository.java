package com.example.macnssapp.Dao;


import ma.macnss.entities.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface AgentRepository extends JpaRepository<Agent,Long> {
    Optional<Agent> findAgentByEmail(String email);

}
