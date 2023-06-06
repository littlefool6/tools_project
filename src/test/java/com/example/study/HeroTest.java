package com.example.study;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class HeroTest {

    @org.junit.Test
    public void test() {
        List<String> personList = new ArrayList<>();
        personList.add("阿龙");
        personList.add("涛哥");
        personList.add("袁总");
        personList.add("轩哥");
        personList.add("小辉");

        List<String> roadList = new ArrayList<>();
        roadList.add("对抗路");
        roadList.add("中路");
        roadList.add("发育路");
        roadList.add("游走");
        roadList.add("打野");

        int staffCount = personList.size();
        Random random = new Random();

        int staffCount1 = staffCount;
        List<String> staffList1 = new ArrayList<>();
        staffList1.addAll(personList);

        for (String s : roadList) {
            int nextInt = random.nextInt(staffCount1);
            System.out.println(s + "--->" + personList.get(nextInt));
            staffCount1--;
            personList.remove(nextInt);
            if (staffCount1 == 0) {
                staffCount1 = staffCount;
                personList.addAll(staffList1);
            }
        }

        // 对抗路
        List<String> topList = new ArrayList<>();
        topList.add("亚瑟");
        topList.add("吕布");
        topList.add("项羽");
        topList.add("夏侯淳");
        topList.add("李信");
        topList.add("铠");
        topList.add("夏洛特");
        topList.add("曜");
        topList.add("孙策");
        topList.add("程咬金");
        topList.add("花木兰");
        topList.add("廉颇");
        topList.add("钟无艳");
        topList.add("赵怀真");
        topList.add("狂铁");
        topList.add("芈月");
        topList.add("宫本武藏");
        topList.add("老夫子");
        topList.add("关羽");
        topList.add("马超");
        topList.add("苏烈");
        topList.add("白起");
        topList.add("元歌");
        topList.add("猪八戒");
        topList.add("司空震");
        topList.add("橘右京");
        topList.add("刘邦");
        topList.add("达摩");
        topList.add("哪吒");
        topList.add("杨戬");
        topList.add("盘古");
        topList.add("嫦娥");
        topList.add("梦奇");
        topList.add("雅典娜");
        topList.add("曹操");
        topList.add("蒙恬");

        // 中路
        List<String> midList = new ArrayList<>();
        midList.add("安琪拉");
        midList.add("妲己");
        midList.add("小乔");
        midList.add("甄姬");
        midList.add("貂蝉");
        midList.add("墨子");
        midList.add("姜子牙");
        midList.add("米莱狄");
        midList.add("金蝉");
        midList.add("王昭君");
        midList.add("海月");
        midList.add("诸葛亮");
        midList.add("干将莫邪");
        midList.add("张良");
        midList.add("不知火舞");
        midList.add("上官婉儿");
        midList.add("扁鹊");
        midList.add("高渐离");
        midList.add("嬴政");
        midList.add("杨玉环");
        midList.add("元歌");
        midList.add("周瑜");
        midList.add("司马懿");
        midList.add("奕星");
        midList.add("沈梦溪");
        midList.add("女娲");
        midList.add("武则天");
        midList.add("西施");
        midList.add("嫦娥");
        midList.add("梦奇");

        // 发育路
        List<String> adcList = new ArrayList<>();
        adcList.add("百里守约");
        adcList.add("后羿");
        adcList.add("马可波罗");
        adcList.add("鲁班七号");
        adcList.add("孙尚香");
        adcList.add("黄忠");
        adcList.add("李元芳");
        adcList.add("伽罗");
        adcList.add("虞姬");
        adcList.add("狄仁杰");
        adcList.add("莱西奥");
        adcList.add("蒙犽");
        adcList.add("公孙离");
        adcList.add("艾琳");
        adcList.add("戈娅");
        adcList.add("成吉思汗");

        // 游走
        List<String> supList = new ArrayList<>();
        supList.add("瑶");
        supList.add("东皇太一");
        supList.add("庄周");
        supList.add("钟馗");
        supList.add("蔡文姬");
        supList.add("盾山");
        supList.add("明世隐");
        supList.add("项羽");
        supList.add("墨子");
        supList.add("孙膑");
        supList.add("夏侯淳");
        supList.add("姜子牙");
        supList.add("刘禅");
        supList.add("张飞");
        supList.add("张良");
        supList.add("廉颇");
        supList.add("牛魔");
        supList.add("大乔");
        supList.add("鬼谷子");
        supList.add("关羽");
        supList.add("苏烈");
        supList.add("白起");
        supList.add("桑启");
        supList.add("张玉环");
        supList.add("鲁班大师");
        supList.add("刘邦");
        supList.add("太乙真人");

        // 打野
        List<String> jugList = new ArrayList<>();
        jugList.add("孙悟空");
        jugList.add("亚瑟");
        jugList.add("李元芳");
        jugList.add("典韦");
        jugList.add("李信");
        jugList.add("铠");
        jugList.add("兰陵王");
        jugList.add("曜");
        jugList.add("韩信");
        jugList.add("程咬金");
        jugList.add("赵云");
        jugList.add("刘备");
        jugList.add("澜");
        jugList.add("阿珂");
        jugList.add("钟无艳");
        jugList.add("李白");
        jugList.add("芈月");
        jugList.add("宫本武藏");
        jugList.add("娜可露露");
        jugList.add("云樱");
        jugList.add("猪八戒");
        jugList.add("露娜");
        jugList.add("司马懿");
        jugList.add("镜");
        jugList.add("橘右京");
        jugList.add("达摩");
        jugList.add("杨戬");
        jugList.add("盘古");
        jugList.add("百里玄策");
        jugList.add("阿古朵");
        jugList.add("雅典娜");
        jugList.add("曹操");
        jugList.add("云中君");
        jugList.add("裴擒虎");
        jugList.add("暃");

        System.out.println("------------------------");
        // 对抗路
        System.out.println("对抗路---" + randomHero(topList, 3));
        // 中路
        System.out.println("中路---" + randomHero(midList, 3));
        // 发育路
        System.out.println("发育路---" + randomHero(adcList, 3));
        // 游走
        System.out.println("游走---" + randomHero(supList, 3));
        // 打野
        System.out.println("打野---" + randomHero(jugList, 3));
    }

    public String randomHero(List<String> heroList, int num) {
        Random random = new Random();
        int size = heroList.size();
        Set<String> totals = new HashSet<>();
        while (totals.size() < num) {
            totals.add(heroList.get(random.nextInt(size)));
        }
        List<String> resultList = new ArrayList<>(totals);
        return String.join(",", resultList);
    }
}