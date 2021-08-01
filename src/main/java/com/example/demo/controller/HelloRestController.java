package com.example.demo.controller;

import com.example.demo.entity.Hello;
import com.example.demo.entity.Member;
import com.example.demo.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

//@Controller @ResponseBody동시에 하는 shortcut
@RestController
@Slf4j
@RequiredArgsConstructor//DI_3에서 주석처리한 부분 자동으로
public class HelloRestController {

    /**DI_1. setter injection
    private MemberService memberService;
    @Autowired
    private void setMemberService(MemberService memberService){
        this.memberService = memberService;
    }**/

    /**DI_2. field injection
    @Autowired
    MemberService memberService;//추천 안하는 field injection//변경엔 닫혀있도록
    **/

    //DI_3. constructor injection
    final MemberService memberService;//더이상 수정 불가능하도록 final로, 변경은 불가능하게
    /**
    @Autowired
    public HelloRestController(MemberService memberService){
        this.memberService = memberService;
    }**/



    @GetMapping("/hello-string")
    public String helloString(String name){
        //return "hello
        return memberService.greet(name);
    }

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
