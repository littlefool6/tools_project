package com.example.study;

import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

@Slf4j
public class Test {

    @org.junit.Test
    public void test() {
        for (int i = 0; i < 50; i++) {
            System.out.println(UUID.randomUUID().toString().replace("-", ""));

        }
    }
}