package com.example.study;

import cn.hutool.core.io.FileUtil;
import cn.hutool.json.JSONUtil;
import com.example.study.entity.*;
import com.example.study.util.KafkaUtils;
import com.example.study.util.poi.ExcelUtil;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.BufferedInputStream;
import java.util.List;

@Slf4j
@SpringBootTest
public class FiveInOneTest {

    @Autowired
    private KafkaUtils kafkaUtils;

    @Test
    public void AQFXFXDY001() throws Exception {
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//确成硅//安全风险分析单元表.xlsx");
        ExcelUtil<AQFXFXDY001> excelUtil = new ExcelUtil<>(AQFXFXDY001.class);
        List<AQFXFXDY001> messageList = excelUtil.importExcel(inputStream);
        String message = JSONUtil.toJsonStr(messageList);
        log.info("AQFXFXDY001---" + message);
        kafkaUtils.sendMessage("AQFXFXDY001", message);
    }

    @Test
    public void AQFXGKCS002() throws Exception {
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//确成硅//安全风险管控措施表.xlsx");
        ExcelUtil<AQFXGKCS002> excelUtil = new ExcelUtil<>(AQFXGKCS002.class);
        List<AQFXGKCS002> messageList = excelUtil.importExcel(inputStream);
//        messageList.removeIf(item -> !"26dbad16af3646ce89def14aae4411d1".equals(item.getRISKMEASURE_ID())
//                && !"8e07b398e6e6494f9b054b13b21055e6".equals(item.getRISKMEASURE_ID())
//                && !"4103d35db211449091bba85b7807cd77".equals(item.getRISKMEASURE_ID()));
        String message = JSONUtil.toJsonStr(messageList);
        log.info("AQFXGKCS002---" + message);
        kafkaUtils.sendMessage("AQFXGKCS002", message);
    }

    @Test
    public void AQFXSJ003() throws Exception {
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//确成硅//安全风险事件表.xlsx");
        ExcelUtil<AQFXSJ003> excelUtil = new ExcelUtil<>(AQFXSJ003.class);
        List<AQFXSJ003> messageList = excelUtil.importExcel(inputStream);
        String message = JSONUtil.toJsonStr(messageList);
        log.info("AQFXSJ003---" + message);
        kafkaUtils.sendMessage("AQFXSJ003", message);
    }

    @Test
    public void AQJCJL004() throws Exception {
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//确成硅//安全检查记录表.xlsx");
        ExcelUtil<AQJCJL004> excelUtil = new ExcelUtil<>(AQJCJL004.class);
        List<AQJCJL004> messageList = excelUtil.importExcel(inputStream);
        String message = JSONUtil.toJsonStr(messageList);
        log.info("AQJCJL004---" + message);
        kafkaUtils.sendMessage("AQJCJL004", message);
    }

    @Test
    public void AQSCZRCLKXX005() throws Exception {
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//确成硅//安全生产责任承诺卡信息表.xlsx");
        ExcelUtil<AQSCZRCLKXX005> excelUtil = new ExcelUtil<>(AQSCZRCLKXX005.class);
        List<AQSCZRCLKXX005> messageList = excelUtil.importExcel(inputStream);
        for (AQSCZRCLKXX005 item : messageList) {
//            if (item.getFJ() != null && !"".equals(item.getFJ())) {
//                item.setFJ("data:image/png;base64," + item.getFJ());
//            }
            List<AQSCZRCLKXX005> tempList = Lists.newArrayList();
            tempList.add(item);
            String tempMessage = JSONUtil.toJsonStr(tempList);
            log.info("AQSCZRCLKXX005---" + tempList);
            kafkaUtils.sendMessage("AQSCZRCLKXX005", tempMessage);
        }
//        String message = JSONUtil.toJsonStr(messageList);
//        log.info("AQSCZRCLKXX005---" + message);
//        kafkaUtils.sendMessage("AQSCZRCLKXX005", message);
    }

    @Test
    public void FXSST006() throws Exception {
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//确成硅//风险四色图信息表.xlsx");
        ExcelUtil<FXSST006> excelUtil = new ExcelUtil<>(FXSST006.class);
        List<FXSST006> messageList = excelUtil.importExcel(inputStream);
        String message = JSONUtil.toJsonStr(messageList);
        log.info("FXSST006---" + message);
        kafkaUtils.sendMessage("FXSST006", message);
    }

    @Test
    public void JCBWHXX007() throws Exception {
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//确成硅//检查表维护信息表.xlsx");
        ExcelUtil<JCBWHXX007> excelUtil = new ExcelUtil<>(JCBWHXX007.class);
        List<JCBWHXX007> messageList = excelUtil.importExcel(inputStream);
//        messageList.removeIf(item -> !"2dc11a72884a4c8d991682714337a8cf".equals(item.getID())
//                && !"30948ce2435b4e5cb80de847c41f5383".equals(item.getID())
//                && !"50309decfdde4587856b86ae911b05ae".equals(item.getID()));
        String message = JSONUtil.toJsonStr(messageList);
        log.info("JCBWHXX007---" + message);
        kafkaUtils.sendMessage("JCBWHXX007", message);
    }

    @Test
    public void QYFXFB008() throws Exception {
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//确成硅//企业安全风险分布信息表.xlsx");
        ExcelUtil<QYFXFB008> excelUtil = new ExcelUtil<>(QYFXFB008.class);
        List<QYFXFB008> messageList = excelUtil.importExcel(inputStream);
        String message = JSONUtil.toJsonStr(messageList);
        log.info("QYFXFB008---" + message);
        kafkaUtils.sendMessage("QYFXFB008", message);
    }

    @Test
    public void YHPCJL009() throws Exception {
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//金道生物//隐患排查记录表.xlsx");
        ExcelUtil<YHPCJL009> excelUtil = new ExcelUtil<>(YHPCJL009.class);
        List<YHPCJL009> messageList = excelUtil.importExcel(inputStream);
        String message = JSONUtil.toJsonStr(messageList);
        log.info("YHPCJL009---" + message);
        kafkaUtils.sendMessage("YHPCJL009", message);
    }

    @Test
    public void YHPCREXX010() throws Exception {
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//金道生物//隐患排查任务信息表.xlsx");
        ExcelUtil<YHPCREXX010> excelUtil = new ExcelUtil<>(YHPCREXX010.class);
        List<YHPCREXX010> messageList = excelUtil.importExcel(inputStream);
        for (YHPCREXX010 item : messageList) {
            String troubleshoot_content = item.getTROUBLESHOOT_CONTENT();
            if (troubleshoot_content != null && !"".equals(troubleshoot_content)) {
                item.setTROUBLESHOOT_CONTENT(troubleshoot_content.trim());
            }
        }
        String message = JSONUtil.toJsonStr(messageList);
        log.info("YHPCREXX010---" + message);
        kafkaUtils.sendMessage("YHPCREXX010", message);
    }

    @Test
    public void YHZLXX011() throws Exception {
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//确成硅//隐患治理信息表.xlsx");
        ExcelUtil<YHZLXX011> excelUtil = new ExcelUtil<>(YHZLXX011.class);
        List<YHZLXX011> messageList = excelUtil.importExcel(inputStream);
        String message = JSONUtil.toJsonStr(messageList);
        log.info("YHZLXX011---" + message);
        kafkaUtils.sendMessage("YHZLXX011", message);
    }

    @Test
    public void YJCZKXX012() throws Exception {
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//确成硅//应急处置卡信息表.xlsx");
        ExcelUtil<YJCZKXX012> excelUtil = new ExcelUtil<>(YJCZKXX012.class);
        List<YJCZKXX012> messageList = excelUtil.importExcel(inputStream);
        String message = JSONUtil.toJsonStr(messageList);
        log.info("YJCZKXX012---" + message);
        kafkaUtils.sendMessage("YJCZKXX012", message);
    }

    @Test
    public void ZYCSWXYS013() throws Exception {
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//确成硅//危害特性应知卡信息表.xlsx");
        ExcelUtil<ZYCSWXYS013> excelUtil = new ExcelUtil<>(ZYCSWXYS013.class);
        List<ZYCSWXYS013> messageList = excelUtil.importExcel(inputStream);
//        messageList.removeIf(item -> !"fd7c3d991027cf1fb8f7a3900803527a".equals(item.getID()));
        for (ZYCSWXYS013 item : messageList) {
            List<ZYCSWXYS013> tempList = Lists.newArrayList();
            tempList.add(item);
            String tempMessage = JSONUtil.toJsonStr(tempList);
            log.info("ZYCSWXYS013---" + tempMessage);
            kafkaUtils.sendMessage("ZYCSWXYS013", tempMessage);
        }
//        String message = JSONUtil.toJsonStr(messageList);
//        log.info("ZYCSWXYS013---" + message);
//        kafkaUtils.sendMessage("ZYCSWXYS013", message);
    }
}
