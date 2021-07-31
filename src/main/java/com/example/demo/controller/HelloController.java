package com.example.demo.controller;

import com.example.demo.entity.Hello;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller

public class HelloController {

    @GetMapping("/hello-mvc")
    public String helloTemplate(String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }

}
