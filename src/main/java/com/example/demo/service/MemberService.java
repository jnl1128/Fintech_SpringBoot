package com.example.demo.service;

import org.springframework.stereotype.Service;

//dependency injection하기 위해
//어노테이션 적어주는 것
@Service
public class MemberService {
    public String greet(String name){
        return String.format("Welcome, %s", name);
    }
}
