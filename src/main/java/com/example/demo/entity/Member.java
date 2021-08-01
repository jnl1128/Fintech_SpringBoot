package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
//@Builder//빌더 패턴을 자동으로 생성해주는 역할, 이 객체를 build할 수 있는 역할
//@NoArgsConstructor
//@AllArgsConstructor
@Entity//table 자동생성되도록
public class Member {
    @Id
    @GeneratedValue
    Long seq;
    String id;
    String name;
    String org;
    Boolean active;
}
