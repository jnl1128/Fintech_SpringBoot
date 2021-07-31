package com.example.demo.controller;

import com.example.demo.entity.Hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

//@Controller @ResponseBody동시에shortcut
@RestController
public class HelloRestController {

    @GetMapping("/hello-string")
    public String helloString(String name){ return String.format("Hello, %s", name);}

    @GetMapping("/hello-map")
    public Map<String, Object> helloMap(String name){
        Map<String, Object> m = new HashMap<>();
        m.put("name", name);
        return m;
    }

    //굳이 java에서 제공하는 object말고
    @GetMapping("/hello-object")
    public Hello helloObject(String name){
        Hello h = new Hello(name);
        return h;
    }

}
