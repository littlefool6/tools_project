package com.example.study.service;

import cn.hutool.core.io.FileUtil;
import cn.hutool.json.JSONUtil;
import com.example.study.constant.FiveInOneReportConstant;
import com.example.study.entity.fiveInOneReport.WC_ENT_LEAKPOINT;
import com.example.study.entity.fiveInOneReport.WC_ENT_QYCN;
import com.example.study.entity.fiveInOneReport.WC_ENT_SBJZ;
import com.example.study.entity.fiveInOneReport.WC_PROD_HIS;
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
            String aesStr = AESUtil.aesPKCS7PaddingEncrypt(dataStr);
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
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//省平台五位一体推送//气体泄漏监测点信息表.xlsx");
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
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//省平台五位一体推送//高优先级//企业承诺作业票详情表.xlsx");
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
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//省平台五位一体推送//高优先级//设备停用历史信息表.xlsx");
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
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//省平台五位一体推送//高优先级//设备介质基础信息表.xlsx");
        ExcelUtil<WC_ENT_SBJZ> excelUtil = new ExcelUtil<>(WC_ENT_SBJZ.class);
        List<WC_ENT_SBJZ> dataList = excelUtil.importExcel(inputStream);
        if (!dataList.isEmpty()) {
            aesAndReportData(ctx, reportMap, JSONUtil.toJsonStr(dataList));
        }
    }

    //

}
