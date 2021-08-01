package com.example.demo.controller;

import com.example.demo.entity.Hello;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.HashMap;
import java.util.Map;

@Controller
@Slf4j
public class HelloController {

    @GetMapping("/hello-mvc")
    public String helloTemplate(String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }

    @PostConstruct
    public void postConstructor(){
        log.info("i am already constructed");
    }

    @PreDestroy
    public void preDestory(){
        log.info("ths case...?");
        log.info("I will be destroyed...");
    }
}
