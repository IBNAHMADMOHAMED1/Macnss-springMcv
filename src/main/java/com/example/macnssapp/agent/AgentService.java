package com.example.macnssapp.agent;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import ma.macnss.Dao.AgentRepository;
import ma.macnss.entities.Agent;
import ma.macnss.sercurity.Email;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Data @AllArgsConstructor
public class AgentService {
    AgentRepository agentRepository;

    @Transactional
    public boolean checkAgent(String email){
        Optional<Agent> agent = agentRepository.findAgentByEmail(email);
        if(!agent.isEmpty()){
            Agent agentNew = (Agent) agent.get();
            int num = (int) ((Math.random() * (9999 - 1111)) + 1111);
            agentNew.setPassword(String.valueOf(num));
            agentRepository.save(agentNew);
            Email.send(email, "Macnss verification", "This code "+num+" is valid only for 5 min");
            return true;
        }
        return false;
    }

    @Transactional
    public boolean login(String email, String password, HttpServletRequest request){
        Optional<Agent> agent = agentRepository.findAgentByEmail(email);
        if(agent.isPresent()){
            if(agent.get().getEmail().equals(email) && agent.get().getPassword().equals(password)){
                request.getSession().setAttribute("id",agent.get().getId());
                System.out.println("--------------------------------------------------------------------------");
                System.out.println("good");
                return true;
            }
        }
        return false;
    }

}
