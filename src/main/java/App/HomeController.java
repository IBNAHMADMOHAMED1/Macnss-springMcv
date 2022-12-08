package App;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.macnss.entities.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller @AllArgsConstructor
public class HomeController {
    private EntityManager entityManager;

    @RequestMapping("/home")
    @Transactional
    public String home(){
        Admin admin = new Admin();
        admin.setEmail("amine@amine.com");
        admin.setPassword("hello");
        this.entityManager.persist(admin);
        return "home";
    }

    @RequestMapping("/fr/user")
    public String clientHome(){
        return "client";
    }


}
