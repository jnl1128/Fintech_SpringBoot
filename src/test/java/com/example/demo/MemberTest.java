package com.example.demo;

import com.example.demo.entity.Member;
import com.example.demo.repository.MemberRepository;
import com.example.demo.service.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional//테스트 케이스에 적용시, 테스트 끝난 후 항상 롤백함.
public class MemberTest {

    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepository memberRepository;

    @Test
    public void join() throws Exception{
        //given
        Member member = new Member();
        member.setName("nana");
        member.setId("hybrid");
        member.setOrg("koscom");
        member.setActive(true);

        //when
        Member storedMember = memberService.addUser(member);

        //then
        Assertions.assertThat(storedMember).isEqualTo(member);
    }}
