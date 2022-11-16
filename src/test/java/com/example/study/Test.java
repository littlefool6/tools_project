package com.example.study;

import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

@Slf4j
public class Test {

    @org.junit.Test
    public void test() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(UUID.randomUUID().toString().replace("-", ""));
        }
    }

    @org.junit.Test
    public void test1() {
        Integer total = 3600;
        int totalPage = total / 1000 + ((total % 1000 == 0) ? 0 : 1);
        System.out.println(totalPage);
    }
}
