package com.example.demo.entity;

import lombok.Data;

@Data
public class Hello {
    final String name;
    //final 붙여준 이유는 name을 requiredArg로 인식시키기 위해
    //final 안쓰고 @NotNull 어노테에션 붙여줘도 되는데 final이 더 직관적이고 명확하다
}
