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
        String testStr = "生产一部槽罐区分析单元：                                                                                                                                                                                                                                                                                  储罐罐体、地面防腐完好；基础、围堰完好牢固；储罐仪表测量准确并校验合格；\n" +
                "日常操作、巡检防护用品戴规范；岗位特种作业人员持证作业；\n" +
                "受限空间、职业危害告知、上下楼梯扶手、管道指示标识及介质标识等清晰、齐全完好；\n" +
                "消防器材、应急设施、物资、用品齐全、完好，点检记录规范；\n" +
                "各储罐、管道、阀门、设备、装置完好有效、无跑冒滴漏现象；\n" +
                "防静电接地完好，电气接线保护到位；操作箱完好、电气控制元件无积灰，无短路、漏电；\n" +
                "特殊作业场所警戒及应急措施到位、作业票完成审批、监护人员在位、防护用品穿戴规范。";
        System.out.println(testStr.trim());
        System.out.println(testStr.replace(" ", ""));
    }
}
