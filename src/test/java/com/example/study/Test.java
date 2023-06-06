package com.example.study;

import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

@Slf4j
public class Test {

    @org.junit.Test
    public void test() {
        System.out.println(UUID.randomUUID().toString().replace("-", ""));
        System.out.println(UUID.randomUUID().toString().replace("-", ""));
    }
}