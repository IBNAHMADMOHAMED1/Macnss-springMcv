package com.example.macnssapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddContoller {

    @RequestMapping("/add")
    public String add(){
        return "hello";
    }
}
