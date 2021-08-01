package com.example.demo.repository;

import com.example.demo.entity.Member;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends PagingAndSortingRepository<Member, Long> {

}
//자동으로 memberRepository에서 member따와서 members로 mapping