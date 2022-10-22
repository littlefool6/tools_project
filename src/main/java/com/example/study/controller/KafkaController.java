package com.example.study.controller;

import cn.hutool.core.io.FileUtil;
import cn.hutool.json.JSONUtil;
import com.example.study.entity.*;
import com.example.study.model.vo.ResponseVo;
import com.example.study.util.BuildResponseUtils;
import com.example.study.util.KafkaUtils;
import com.example.study.util.poi.ExcelUtil;
import com.google.common.collect.Lists;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * kafka控制器
 *
 * @author 154594742@qq.com
 * @date 2021/3/2 15:01
 */

@RestController
@Api(tags = "Kafka控制器")
@Slf4j
public class KafkaController {

    @Autowired
    private KafkaUtils kafkaUtils;

    /**
     * 新增topic (支持批量，这里就单个作为演示)
     *
     * @param topic topic
     * @return ResponseVo
     */
    @ApiOperation("新增topic")
    @PostMapping("kafka")
    public ResponseVo<?> add(String topic) {
        NewTopic newTopic = new NewTopic(topic, 3, (short) 1);
        kafkaUtils.createTopic(Lists.newArrayList(newTopic));
        return BuildResponseUtils.success();
    }

    /**
     * 查询topic信息 (支持批量，这里就单个作为演示)
     *
     * @param topic 自增主键
     * @return ResponseVo
     */
    @ApiOperation("查询topic信息")
    @GetMapping("kafka/{topic}")
    public ResponseVo<String> getBytTopic(@PathVariable String topic) {
        return BuildResponseUtils.buildResponse(kafkaUtils.getTopicInfo(Lists.newArrayList(topic)));
    }

    /**
     * 删除topic (支持批量，这里就单个作为演示)
     * (注意：如果topic正在被监听会给人感觉删除不掉（但其实是删除掉后又会被创建）)
     *
     * @param topic topic
     * @return ResponseVo
     */
    @ApiOperation("删除topic")
    @DeleteMapping("kafka/{topic}")
    public ResponseVo<?> delete(@PathVariable String topic) {
        kafkaUtils.deleteTopic(Lists.newArrayList(topic));
        return BuildResponseUtils.success();
    }

    /**
     * 查询所有topic
     *
     * @return ResponseVo
     */
    @ApiOperation("查询所有topic")
    @GetMapping("kafka/allTopic")
    public ResponseVo<List<String>> getAllTopic() {
        return BuildResponseUtils.buildResponse(kafkaUtils.getAllTopic());
    }

    /**
     * 生产者往topic中发送消息demo
     *
     * @param topic
     * @param message
     * @return
     */
    @ApiOperation("往topic发送消息")
    @PostMapping("kafka/message")
    public ResponseVo<?> sendMessage(String topic, String message) {
        kafkaUtils.sendMessage(topic, message);
        return BuildResponseUtils.success();
    }

    /**
     * 生产者往topic中发送消息（POST请求，body接收）
     *
     * @return
     */
    @ApiOperation("往topic发送消息（POST请求，body接收）")
    @PostMapping("kafka/sendMessageWithBody")
    public ResponseVo<?> sendMessageWithBody(@RequestBody KafkaMessageDto kafkaMessageDto) {
        String topic = kafkaMessageDto.getTopic();
        String message = kafkaMessageDto.getMessage();
        kafkaUtils.sendMessage(topic, message);
        return BuildResponseUtils.success();
    }

    @ApiOperation("往topic发送AQSCZRCLKXX005")
    @PostMapping("kafka/sendMessageAQSCZRCLKXX005")
    public ResponseVo<?> sendMessageAQSCZRCLKXX005(@RequestBody AQSCZRCLKXX005 aqsczrclkxx005) {
        List<AQSCZRCLKXX005> messageList = Lists.newArrayList();
        messageList.add(aqsczrclkxx005);
        String message = JSONUtil.toJsonStr(messageList);
        kafkaUtils.sendMessage("AQSCZRCLKXX005", message);
        return BuildResponseUtils.success();
    }

    /**
     * 消费者示例demo
     * <p>
     * 基于注解监听多个topic，消费topic中消息
     * （注意：如果监听的topic不存在则会自动创建）
     */
    @KafkaListener(topics = {"topic1", "topic2", "topic3"})
    public void consume(String message) {
        log.info("receive msg: " + message);
    }



    @ApiOperation("往topic发送AQFXGKCS002List")
    @PostMapping("kafka/sendMessageAQFXGKCS002List")
    public ResponseVo<?> sendMessageAQFXGKCS002List(@RequestBody List<AQFXGKCS002> messageList) {
        String message = JSONUtil.toJsonStr(messageList);
        kafkaUtils.sendMessage("AQFXGKCS002", message);
        return BuildResponseUtils.success();
    }

    @ApiOperation("往topic发送AQFXSJ003List")
    @PostMapping("kafka/sendMessageAQFXSJ003List")
    public ResponseVo<?> sendMessageAQFXSJ003List(@RequestBody List<AQFXSJ003> messageList) {
        String message = JSONUtil.toJsonStr(messageList);
        kafkaUtils.sendMessage("AQFXSJ003", message);
        return BuildResponseUtils.success();
    }

    @ApiOperation("往topic发送AQJCJL004List")
    @PostMapping("kafka/sendMessageAQJCJL004List")
    public ResponseVo<?> sendMessageAQJCJL004List(@RequestBody List<AQJCJL004> messageList) {
        String message = JSONUtil.toJsonStr(messageList);
        kafkaUtils.sendMessage("AQJCJL004", message);
        return BuildResponseUtils.success();
    }

    @ApiOperation("往topic发送AQSCZRCLKXX005List")
    @PostMapping("kafka/sendMessageAQSCZRCLKXX005List")
    public ResponseVo<?> sendMessageAQSCZRCLKXX005List(@RequestBody List<AQSCZRCLKXX005> messageList) {
        String message = JSONUtil.toJsonStr(messageList);
        kafkaUtils.sendMessage("AQSCZRCLKXX005", message);
        return BuildResponseUtils.success();
    }

    @ApiOperation("往topic发送FXSST006List")
    @PostMapping("kafka/sendMessageFXSST006List")
    public ResponseVo<?> sendMessageFXSST006List(@RequestBody List<FXSST006> messageList) {
        String message = JSONUtil.toJsonStr(messageList);
        kafkaUtils.sendMessage("FXSST006", message);
        return BuildResponseUtils.success();
    }

    @ApiOperation("往topic发送JCBWHXX007List")
    @PostMapping("kafka/sendMessageJCBWHXX007List")
    public ResponseVo<?> sendMessageJCBWHXX007List(@RequestBody List<JCBWHXX007> messageList) {
        String message = JSONUtil.toJsonStr(messageList);
        kafkaUtils.sendMessage("JCBWHXX007", message);
        return BuildResponseUtils.success();
    }

    @ApiOperation("往topic发送QYFXFB008List")
    @PostMapping("kafka/sendMessageQYFXFB008List")
    public ResponseVo<?> sendMessageQYFXFB008List(@RequestBody List<QYFXFB008> messageList) {
        String message = JSONUtil.toJsonStr(messageList);
        kafkaUtils.sendMessage("QYFXFB008", message);
        return BuildResponseUtils.success();
    }

    @ApiOperation("往topic发送YHPCJL009List")
    @PostMapping("kafka/sendMessageYHPCJL009List")
    public ResponseVo<?> sendMessageYHPCJL009List(@RequestBody List<YHPCJL009> messageList) {
        String message = JSONUtil.toJsonStr(messageList);
        kafkaUtils.sendMessage("YHPCJL009", message);
        return BuildResponseUtils.success();
    }

    @ApiOperation("往topic发送YHPCREXX010List")
    @PostMapping("kafka/sendMessageYHPCREXX010List")
    public ResponseVo<?> sendMessageYHPCREXX010List(@RequestBody List<YHPCREXX010> messageList) {
        String message = JSONUtil.toJsonStr(messageList);
        kafkaUtils.sendMessage("YHPCREXX010", message);
        return BuildResponseUtils.success();
    }

    @ApiOperation("往topic发送YHZLXX011List")
    @PostMapping("kafka/sendMessageYHZLXX011List")
    public ResponseVo<?> sendMessageYHZLXX011List(@RequestBody List<YHZLXX011> messageList) {
        String message = JSONUtil.toJsonStr(messageList);
        kafkaUtils.sendMessage("YHZLXX011", message);
        return BuildResponseUtils.success();
    }

    @ApiOperation("往topic发送YJCZKXX012List")
    @PostMapping("kafka/sendMessageYJCZKXX012List")
    public ResponseVo<?> sendMessageYJCZKXX012List(@RequestBody List<YJCZKXX012> messageList) {
        String message = JSONUtil.toJsonStr(messageList);
        kafkaUtils.sendMessage("YJCZKXX012", message);
        return BuildResponseUtils.success();
    }

    @ApiOperation("往topic发送ZYCSWXYS013List")
    @PostMapping("kafka/sendMessageZYCSWXYS013List")
    public ResponseVo<?> sendMessageZYCSWXYS013List(@RequestBody List<ZYCSWXYS013> messageList) {
        String message = JSONUtil.toJsonStr(messageList);
        kafkaUtils.sendMessage("ZYCSWXYS013", message);
        return BuildResponseUtils.success();
    }

    /**
     * @MethodName sendMessageYHPCJL009
     * @Description 隐患排查记录表
     * @Param [file]
     * @Return com.example.study.model.vo.ResponseVo<?>
     * @Author zlguo
     * @Date 2022/10/12
    **/
    @ApiOperation("sendMessageYHPCJL009")
    @PostMapping("kafka/sendMessageYHPCJL009")
    public ResponseVo<?> sendMessageYHPCJL009(@RequestParam MultipartFile file) throws Exception {
        InputStream inputStream = file.getInputStream();
        ExcelUtil<YHPCJL009> excelUtil = new ExcelUtil<>(YHPCJL009.class);
        List<YHPCJL009> messageList = excelUtil.importExcel(inputStream);
        String message = JSONUtil.toJsonStr(messageList);
        log.info("YHPCJL009---" + message);
        kafkaUtils.sendMessage("YHPCJL009", message);
        return BuildResponseUtils.success();
    }

    /**
     * @MethodName sendMessageYHPCREXX010
     * @Description 隐患排查任务信息表
     * @Param [file]
     * @Return com.example.study.model.vo.ResponseVo<?>
     * @Author zlguo
     * @Date 2022/10/12
    **/
    @ApiOperation("sendMessageYHPCREXX010")
    @PostMapping("kafka/sendMessageYHPCREXX010")
    public ResponseVo<?> sendMessageYHPCREXX010(@RequestParam MultipartFile file) throws Exception {
        InputStream inputStream = file.getInputStream();
        ExcelUtil<YHPCREXX010> excelUtil = new ExcelUtil<>(YHPCREXX010.class);
        List<YHPCREXX010> messageList = excelUtil.importExcel(inputStream);
        String message = JSONUtil.toJsonStr(messageList);
        log.info("YHPCREXX010---" + message);
        kafkaUtils.sendMessage("YHPCREXX010", message);
        return BuildResponseUtils.success();
    }


}
