package com.example.macnssapp.Controller;

import com.example.macnssapp.Entity.User;
import com.example.macnssapp.Service.UserService;
import com.example.macnssapp.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class RegisterController {


    @Autowired
    UserServiceImpl userServiceImpl;


    @GetMapping("/register")
    public String index(){
        return "register";
    }


    @PostMapping("/register")
    public String register(@Validated @ModelAttribute("user") User user, BindingResult result){
        if(result.hasErrors()){
            return "register";
        }
      //  userService.register(user);
        userServiceImpl.findByUsername(1L);

        return "redirect:/";
    }


}
