package com.example.study.service;

import cn.hutool.core.io.FileUtil;
import cn.hutool.json.JSONUtil;
import com.example.study.constant.FiveInOneReportConstant;
import com.example.study.entity.fiveInOneReport.*;
import com.example.study.util.AESUtil;
import com.example.study.util.poi.ExcelUtil;
import com.google.common.collect.Maps;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.CharsetUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.BufferedInputStream;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @ClassName FiveInOneReportService
 * @Description 五位一体化工省平台推送Service
 * @Author zlguo
 * @Date 2022/11/8
 **/
@Service
@Slf4j
public class FiveInOneReportService {

    public void aesAndReportData(ChannelHandlerContext ctx, Map<String, Object> reportMap, String dataStr) {
        try {
            String aesStr = AESUtil.encrypt(dataStr);
            reportMap.put("data", aesStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("DATA_ID:" + reportMap.get("dataId") + ";对应数据：" + dataStr);
        ctx.write(Unpooled.copiedBuffer(JSONUtil.toJsonStr(reportMap) + FiveInOneReportConstant.DELIMITER_SYMBOL, CharsetUtil.UTF_8));
    }

    // 气体泄漏监测点信息表
    public void reportWC_ENT_LEAKPOINT(ChannelHandlerContext ctx) throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("appId", FiveInOneReportConstant.APP_ID);
        reportMap.put("serviceId", FiveInOneReportConstant.WC_ENT_LEAKPOINT_SERVICE_ID);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        reportMap.put("districtCode", "3201");
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//20221114//高优先级//1、气体泄漏监测点信息表.xlsx");
        ExcelUtil<WC_ENT_LEAKPOINT> excelUtil = new ExcelUtil<>(WC_ENT_LEAKPOINT.class);
        List<WC_ENT_LEAKPOINT> dataList = excelUtil.importExcel(inputStream);
        if (!dataList.isEmpty()) {
            aesAndReportData(ctx, reportMap, JSONUtil.toJsonStr(dataList));
        }
    }

    // 企业承诺作业票详情表
    public void reportWC_ENT_QYCN(ChannelHandlerContext ctx) throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("appId", FiveInOneReportConstant.APP_ID);
        reportMap.put("serviceId", FiveInOneReportConstant.WC_ENT_QYCN_SERVICE_ID);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        reportMap.put("districtCode", "3201");
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//20221114//高优先级//5、企业承诺作业票详情表.xlsx");
        ExcelUtil<WC_ENT_QYCN> excelUtil = new ExcelUtil<>(WC_ENT_QYCN.class);
        List<WC_ENT_QYCN> dataList = excelUtil.importExcel(inputStream);
        if (!dataList.isEmpty()) {
            aesAndReportData(ctx, reportMap, JSONUtil.toJsonStr(dataList));
        }
    }

    // 设备停用历史信息表
    public void reportWC_PROD_HIS(ChannelHandlerContext ctx) throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("appId", FiveInOneReportConstant.APP_ID);
        reportMap.put("serviceId", FiveInOneReportConstant.WC_PROD_HIS_SERVICE_ID);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        reportMap.put("districtCode", "3201");
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//20221114//高优先级//7、设备停用历史信息表.xlsx");
        ExcelUtil<WC_PROD_HIS> excelUtil = new ExcelUtil<>(WC_PROD_HIS.class);
        List<WC_PROD_HIS> dataList = excelUtil.importExcel(inputStream);
        if (!dataList.isEmpty()) {
            aesAndReportData(ctx, reportMap, JSONUtil.toJsonStr(dataList));
        }
    }

    // 设备介质基础信息表
    public void reportWC_ENT_SBJZ(ChannelHandlerContext ctx) throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("appId", FiveInOneReportConstant.APP_ID);
        reportMap.put("serviceId", FiveInOneReportConstant.WC_ENT_SBJZ_SERVICE_ID);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        reportMap.put("districtCode", "3201");
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//20221114//高优先级//8、设备介质基础信息表.xlsx");
        ExcelUtil<WC_ENT_SBJZ> excelUtil = new ExcelUtil<>(WC_ENT_SBJZ.class);
        List<WC_ENT_SBJZ> dataList = excelUtil.importExcel(inputStream);
        if (!dataList.isEmpty()) {
            aesAndReportData(ctx, reportMap, JSONUtil.toJsonStr(dataList));
        }
    }

    // 下载重大危险源预警结果表
    public void downloadWC_WARN_RESULT(ChannelHandlerContext ctx) {
        Map<String, Object> paramMap = Maps.newHashMap();
        paramMap.put("appId", FiveInOneReportConstant.APP_ID);
        paramMap.put("serviceId", FiveInOneReportConstant.C_DANGRSC_WARN_RESULT_SERVICE_ID);
        paramMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        paramMap.put("districtCode", "3201");
        paramMap.put("companyCode", "320210480");
        paramMap.put("startTime", "20221111090000");
        paramMap.put("endTime", "20221111090000");
        ctx.writeAndFlush(Unpooled.copiedBuffer(JSONUtil.toJsonStr(paramMap) + FiveInOneReportConstant.DELIMITER_SYMBOL, CharsetUtil.UTF_8));
    }

    // 企业装置运行状态表
    public void reportWC_ENT_PROMISE(ChannelHandlerContext ctx) throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("appId", FiveInOneReportConstant.APP_ID);
        reportMap.put("serviceId", FiveInOneReportConstant.WC_ENT_PROMISE_SERVICE_ID);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        reportMap.put("districtCode", "3201");
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//20221114//高优先级//4、企业装置运行状态表.xlsx");
        ExcelUtil<WC_ENT_PROMISE> excelUtil = new ExcelUtil<>(WC_ENT_PROMISE.class);
        List<WC_ENT_PROMISE> dataList = excelUtil.importExcel(inputStream);
        if (!dataList.isEmpty()) {
            aesAndReportData(ctx, reportMap, JSONUtil.toJsonStr(dataList));
        }
    }

    // 传感器信息表
    public void reportWC_ENT_CGQ(ChannelHandlerContext ctx) throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("appId", FiveInOneReportConstant.APP_ID);
        reportMap.put("serviceId", FiveInOneReportConstant.WC_ENT_CGQ_SERVICE_ID);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        reportMap.put("districtCode", "3201");
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//20221114//高优先级//9、传感器信息表.xlsx");
        ExcelUtil<WC_ENT_CGQ> excelUtil = new ExcelUtil<>(WC_ENT_CGQ.class);
        List<WC_ENT_CGQ> dataList = excelUtil.importExcel(inputStream);
        if (!dataList.isEmpty()) {
            aesAndReportData(ctx, reportMap, JSONUtil.toJsonStr(dataList));
        }
    }

    // 企业承诺详情表
    public void reportWC_ENT_TASK(ChannelHandlerContext ctx) throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("appId", FiveInOneReportConstant.APP_ID);
        reportMap.put("serviceId", FiveInOneReportConstant.WC_ENT_TASK_SERVICE_ID);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        reportMap.put("districtCode", "3201");
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//20221114//高优先级//10、企业承诺详情表.xlsx");
        ExcelUtil<WC_ENT_TASK> excelUtil = new ExcelUtil<>(WC_ENT_TASK.class);
        List<WC_ENT_TASK> dataList = excelUtil.importExcel(inputStream);
        if (!dataList.isEmpty()) {
            aesAndReportData(ctx, reportMap, JSONUtil.toJsonStr(dataList));
        }
    }

    // 安全目标指标
    public void reportWC_ENT_SAFE_TARGET(ChannelHandlerContext ctx) throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("appId", FiveInOneReportConstant.APP_ID);
        reportMap.put("serviceId", FiveInOneReportConstant.WC_ENT_SAFE_TARGET_SERVICE_ID);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        reportMap.put("districtCode", "3201");
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//20221114//中优先级//2、安全指标.xlsx");
        ExcelUtil<WC_ENT_SAFE_TARGET> excelUtil = new ExcelUtil<>(WC_ENT_SAFE_TARGET.class);
        List<WC_ENT_SAFE_TARGET> dataList = excelUtil.importExcel(inputStream);
        if (!dataList.isEmpty()) {
            aesAndReportData(ctx, reportMap, JSONUtil.toJsonStr(dataList));
        }
    }

    // 安全目标指标分解
    public void reportWC_ENT_TARGET_RESOLVE(ChannelHandlerContext ctx) throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("appId", FiveInOneReportConstant.APP_ID);
        reportMap.put("serviceId", FiveInOneReportConstant.WC_ENT_TARGET_RESOLVE_SERVICE_ID);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        reportMap.put("districtCode", "3201");
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//20221114//中优先级//3、目标分解.xlsx");
        ExcelUtil<WC_ENT_TARGET_RESOLVE> excelUtil = new ExcelUtil<>(WC_ENT_TARGET_RESOLVE.class);
        List<WC_ENT_TARGET_RESOLVE> dataList = excelUtil.importExcel(inputStream);
        if (!dataList.isEmpty()) {
            aesAndReportData(ctx, reportMap, JSONUtil.toJsonStr(dataList));
        }
    }

    // 安全目标考核
    public void reportWC_ENT_TARGET_EAXM(ChannelHandlerContext ctx) throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("appId", FiveInOneReportConstant.APP_ID);
        reportMap.put("serviceId", FiveInOneReportConstant.WC_ENT_TARGET_EAXM_SERVICE_ID);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        reportMap.put("districtCode", "3201");
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//20221114//中优先级//4、安全目标考核.xlsx");
        ExcelUtil<WC_ENT_TARGET_EAXM> excelUtil = new ExcelUtil<>(WC_ENT_TARGET_EAXM.class);
        List<WC_ENT_TARGET_EAXM> dataList = excelUtil.importExcel(inputStream);
        if (!dataList.isEmpty()) {
            aesAndReportData(ctx, reportMap, JSONUtil.toJsonStr(dataList));
        }
    }

    // 区域报警中危化品运输车辆管理
    public void reportWC_ENT_ALARM_VEHICLE(ChannelHandlerContext ctx) throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("appId", FiveInOneReportConstant.APP_ID);
        reportMap.put("serviceId", FiveInOneReportConstant.WC_ENT_ALARM_VEHICLE_SERVICE_ID);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        reportMap.put("districtCode", "3201");
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//20221114//中优先级//5、区域报警中危化品运输车辆管理.xlsx");
        ExcelUtil<WC_ENT_ALARM_VEHICLE> excelUtil = new ExcelUtil<>(WC_ENT_ALARM_VEHICLE.class);
        List<WC_ENT_ALARM_VEHICLE> dataList = excelUtil.importExcel(inputStream);
        if (!dataList.isEmpty()) {
            aesAndReportData(ctx, reportMap, JSONUtil.toJsonStr(dataList));
        }
    }

    // 区域报警中外来人员作业管理
    public void reportWC_ENT_ALARM_FOREGIN(ChannelHandlerContext ctx) throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("appId", FiveInOneReportConstant.APP_ID);
        reportMap.put("serviceId", FiveInOneReportConstant.WC_ENT_ALARM_FOREGIN_SERVICE_ID);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        reportMap.put("districtCode", "3201");
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//20221114//中优先级//6、区域报警中外来作业人员管理.xlsx");
        ExcelUtil<WC_ENT_ALARM_FOREGIN> excelUtil = new ExcelUtil<>(WC_ENT_ALARM_FOREGIN.class);
        List<WC_ENT_ALARM_FOREGIN> dataList = excelUtil.importExcel(inputStream);
        if (!dataList.isEmpty()) {
            aesAndReportData(ctx, reportMap, JSONUtil.toJsonStr(dataList));
        }
    }

    // 报警信息管理
    public void reportWC_ENT_ALARM_REGIONAL(ChannelHandlerContext ctx) throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("appId", FiveInOneReportConstant.APP_ID);
        reportMap.put("serviceId", FiveInOneReportConstant.WC_ENT_ALARM_REGIONAL_SERVICE_ID);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        reportMap.put("districtCode", "3201");
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//20221114//中优先级//7、报警信息管理.xlsx");
        ExcelUtil<WC_ENT_ALARM_REGIONAL> excelUtil = new ExcelUtil<>(WC_ENT_ALARM_REGIONAL.class);
        List<WC_ENT_ALARM_REGIONAL> dataList = excelUtil.importExcel(inputStream);
        if (!dataList.isEmpty()) {
            aesAndReportData(ctx, reportMap, JSONUtil.toJsonStr(dataList));
        }
    }

    // 预案表
    public void reportWC_ENT_RESERVEPLAN(ChannelHandlerContext ctx) throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("appId", FiveInOneReportConstant.APP_ID);
        reportMap.put("serviceId", FiveInOneReportConstant.WC_ENT_RESERVEPLAN_SERVICE_ID);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        reportMap.put("districtCode", "3201");
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//20221114//中优先级//9、预案表.xlsx");
        ExcelUtil<WC_ENT_RESERVEPLAN> excelUtil = new ExcelUtil<>(WC_ENT_RESERVEPLAN.class);
        List<WC_ENT_RESERVEPLAN> dataList = excelUtil.importExcel(inputStream);
        if (!dataList.isEmpty()) {
            aesAndReportData(ctx, reportMap, JSONUtil.toJsonStr(dataList));
        }
    }

    // 预案应急演练计划
    public void reportWC_ENT_DRILL(ChannelHandlerContext ctx) throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("appId", FiveInOneReportConstant.APP_ID);
        reportMap.put("serviceId", FiveInOneReportConstant.WC_ENT_DRILL_SERVICE_ID);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        reportMap.put("districtCode", "3201");
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//20221114//中优先级//10、预案应急演练计划.xlsx");
        ExcelUtil<WC_ENT_DRILL> excelUtil = new ExcelUtil<>(WC_ENT_DRILL.class);
        List<WC_ENT_DRILL> dataList = excelUtil.importExcel(inputStream);
        if (!dataList.isEmpty()) {
            aesAndReportData(ctx, reportMap, JSONUtil.toJsonStr(dataList));
        }
    }

    // 风险等级
    public void reportWC_ENT_FXDJ(ChannelHandlerContext ctx) throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("appId", FiveInOneReportConstant.APP_ID);
        reportMap.put("serviceId", FiveInOneReportConstant.WC_ENT_FXDJ_SERVICE_ID);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        reportMap.put("districtCode", "3201");
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//20221114//中优先级//11、风险等级.xlsx");
        ExcelUtil<WC_ENT_FXDJ> excelUtil = new ExcelUtil<>(WC_ENT_FXDJ.class);
        List<WC_ENT_FXDJ> dataList = excelUtil.importExcel(inputStream);
        if (!dataList.isEmpty()) {
            aesAndReportData(ctx, reportMap, JSONUtil.toJsonStr(dataList));
        }
    }

    // 风险管控信息
    public void reportWC_ENT_FXGK(ChannelHandlerContext ctx) throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("appId", FiveInOneReportConstant.APP_ID);
        reportMap.put("serviceId", FiveInOneReportConstant.WC_ENT_FXGK_SERVICE_ID);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        reportMap.put("districtCode", "3201");
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//20221114//中优先级//12、风险管控信息.xlsx");
        ExcelUtil<WC_ENT_FXGK> excelUtil = new ExcelUtil<>(WC_ENT_FXGK.class);
        List<WC_ENT_FXGK> dataList = excelUtil.importExcel(inputStream);
        if (!dataList.isEmpty()) {
            aesAndReportData(ctx, reportMap, JSONUtil.toJsonStr(dataList));
        }
    }

    // 人员培训
    public void reportWC_ENT_PR_PXTRAIN(ChannelHandlerContext ctx) throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("appId", FiveInOneReportConstant.APP_ID);
        reportMap.put("serviceId", FiveInOneReportConstant.WC_ENT_PR_PXTRAIN_SERVICE_ID);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        reportMap.put("districtCode", "3201");
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//20221114//中优先级//13、人员培训.xlsx");
        ExcelUtil<WC_ENT_PR_PXTRAIN> excelUtil = new ExcelUtil<>(WC_ENT_PR_PXTRAIN.class);
        List<WC_ENT_PR_PXTRAIN> dataList = excelUtil.importExcel(inputStream);
        if (!dataList.isEmpty()) {
            aesAndReportData(ctx, reportMap, JSONUtil.toJsonStr(dataList));
        }
    }

    // 安全活动
    public void reportWC_ENT_PR_PXHD(ChannelHandlerContext ctx) throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("appId", FiveInOneReportConstant.APP_ID);
        reportMap.put("serviceId", FiveInOneReportConstant.WC_ENT_PR_PXHD_SERVICE_ID);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        reportMap.put("districtCode", "3201");
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//20221114//中优先级//14、安全活动.xlsx");
        ExcelUtil<WC_ENT_PR_PXHD> excelUtil = new ExcelUtil<>(WC_ENT_PR_PXHD.class);
        List<WC_ENT_PR_PXHD> dataList = excelUtil.importExcel(inputStream);
        if (!dataList.isEmpty()) {
            aesAndReportData(ctx, reportMap, JSONUtil.toJsonStr(dataList));
        }
    }

    // 检查整改单
    public void reportWC_ENT_PR_YHZG(ChannelHandlerContext ctx) throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("appId", FiveInOneReportConstant.APP_ID);
        reportMap.put("serviceId", FiveInOneReportConstant.WC_ENT_PR_YHZG_SERVICE_ID);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        reportMap.put("districtCode", "3201");
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//20221114//中优先级//15、检查整改单.xlsx");
        ExcelUtil<WC_ENT_PR_YHZG> excelUtil = new ExcelUtil<>(WC_ENT_PR_YHZG.class);
        List<WC_ENT_PR_YHZG> dataList = excelUtil.importExcel(inputStream);
        if (!dataList.isEmpty()) {
            aesAndReportData(ctx, reportMap, JSONUtil.toJsonStr(dataList));
        }
    }

    // 整改通知单
    public void reportWC_ENT_PR_YHZGTZ(ChannelHandlerContext ctx) throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("appId", FiveInOneReportConstant.APP_ID);
        reportMap.put("serviceId", FiveInOneReportConstant.WC_ENT_PR_YHZGTZ_SERVICE_ID);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        reportMap.put("districtCode", "3201");
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//20221114//中优先级//16、整改通知单.xlsx");
        ExcelUtil<WC_ENT_PR_YHZGTZ> excelUtil = new ExcelUtil<>(WC_ENT_PR_YHZGTZ.class);
        List<WC_ENT_PR_YHZGTZ> dataList = excelUtil.importExcel(inputStream);
        if (!dataList.isEmpty()) {
            aesAndReportData(ctx, reportMap, JSONUtil.toJsonStr(dataList));
        }
    }

    // 登录情况
    public void reportWC_ENT_LOGINSTATUS(ChannelHandlerContext ctx) throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("appId", FiveInOneReportConstant.APP_ID);
        reportMap.put("serviceId", FiveInOneReportConstant.WC_ENT_LOGINSTATUS_SERVICE_ID);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        reportMap.put("districtCode", "3201");
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//20221114//中优先级//8、登录情况.xlsx");
        ExcelUtil<WC_ENT_LOGINSTATUS> excelUtil = new ExcelUtil<>(WC_ENT_LOGINSTATUS.class);
        List<WC_ENT_LOGINSTATUS> dataList = excelUtil.importExcel(inputStream);
        if (!dataList.isEmpty()) {
            aesAndReportData(ctx, reportMap, JSONUtil.toJsonStr(dataList));
        }
    }

    // 物资装备
    public void reportWC_ENT_MATERIAL(ChannelHandlerContext ctx) throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("appId", FiveInOneReportConstant.APP_ID);
        reportMap.put("serviceId", FiveInOneReportConstant.WC_ENT_MATERIAL_SERVICE_ID);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        reportMap.put("districtCode", "3201");
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//20221114//中优先级//17、物资装备.xlsx");
        ExcelUtil<WC_ENT_MATERIAL> excelUtil = new ExcelUtil<>(WC_ENT_MATERIAL.class);
        List<WC_ENT_MATERIAL> dataList = excelUtil.importExcel(inputStream);
        if (!dataList.isEmpty()) {
            aesAndReportData(ctx, reportMap, JSONUtil.toJsonStr(dataList));
        }
    }

    // 企业人员信息
    public void reportEnterprisePersonInfo(ChannelHandlerContext ctx) throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("appId", FiveInOneReportConstant.APP_ID);
        reportMap.put("serviceId", FiveInOneReportConstant.ENTERPRISE_PERSON_INFO_SERVICE_ID);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        reportMap.put("districtCode", "3201");
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//朗新对接//20230517//企业人员信息表.xlsx");
        ExcelUtil<EnterprisePersonInfoReportDto> excelUtil = new ExcelUtil<>(EnterprisePersonInfoReportDto.class);
        List<EnterprisePersonInfoReportDto> dataList = excelUtil.importExcel(inputStream);
        if (!dataList.isEmpty()) {
            aesAndReportData(ctx, reportMap, JSONUtil.toJsonStr(dataList));
        }
    }

    // 生产设施信息
    public void reportProductFacilityInfo(ChannelHandlerContext ctx) throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("appId", FiveInOneReportConstant.APP_ID);
        reportMap.put("serviceId", FiveInOneReportConstant.PRODUCT_FACILITY_INFO_SERVICE_ID);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        reportMap.put("districtCode", "3201");
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//朗新对接//20230517//生产设施信息表.xlsx");
        ExcelUtil<ProductFacilityInfoReportDto> excelUtil = new ExcelUtil<>(ProductFacilityInfoReportDto.class);
        List<ProductFacilityInfoReportDto> dataList = excelUtil.importExcel(inputStream);
        if (!dataList.isEmpty()) {
            aesAndReportData(ctx, reportMap, JSONUtil.toJsonStr(dataList));
        }
    }
}