package com.example01.demo01;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collections;

@SpringBootTest
class Demo01ApplicationTests {

    @Test
    void contextLoads() {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"min","max","sum","avg");
        list.stream().forEach(s-> System.out.println(s));
    }

}
