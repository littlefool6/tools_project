package com.example.study;

import cn.hutool.core.io.FileUtil;
import cn.hutool.json.JSONUtil;
import com.example.study.constant.QCSiliconReportConstant;
import com.example.study.entity.QCSiliconReport.*;
import com.example.study.util.QCSiliconReportAESUtil;
import com.example.study.util.SSLSocketClient;
import com.example.study.util.poi.ExcelUtil;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Slf4j
@SpringBootTest
public class QCSiliconReportTest {

    public void aesAndReportData(Map<String, Object> reportMap, String dataStr, String aesKey) throws IOException {
        try {
            String aesStr = QCSiliconReportAESUtil.encrypt(dataStr, aesKey);
            reportMap.put("data", aesStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("serviceId：" + reportMap.get("serviceId") + "；dataId：" + reportMap.get("dataId") + "；对应数据：" + dataStr);
        OkHttpClient client = new OkHttpClient().newBuilder()
                .sslSocketFactory(SSLSocketClient.getSSLSocketFactory(), SSLSocketClient.getX509TrustManager())
                .hostnameVerifier(SSLSocketClient.getHostnameVerifier())
                .build();
        MediaType mediaType = MediaType.parse("application/json");
        String reportStr = JSONUtil.toJsonStr(reportMap);
        log.info("reportStr：" + reportStr);
        RequestBody body = RequestBody.create(mediaType, reportStr);
        Request request = new Request.Builder()
                .url(QCSiliconReportConstant.REPORT_URL)
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .build();
        Response response = client.newCall(request).execute();
        log.info(response.body().string());
    }

    // 安全风险分析单元表
    @Test
    public void T_AQFXFXDY() throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("serviceId", QCSiliconReportConstant.T_AQFXFXDY_SERVICE_ID);
        reportMap.put("orgCode", QCSiliconReportConstant.QCG_ORG_CODE);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//确成硅园区推送//确成硅//安全风险分析单元表.xlsx");
        ExcelUtil<T_AQFXFXDY> excelUtil = new ExcelUtil<>(T_AQFXFXDY.class);
        List<T_AQFXFXDY> dataList = excelUtil.importExcel(inputStream);
        String dataStr = JSONUtil.toJsonStr(dataList);
        aesAndReportData(reportMap, dataStr, QCSiliconReportConstant.QCG_AES_KEY);
    }

    // 安全风险事件表
    @Test
    public void T_AQFXSJ() throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("serviceId", QCSiliconReportConstant.T_AQFXSJ_SERVICE_ID);
        reportMap.put("orgCode", QCSiliconReportConstant.QCG_ORG_CODE);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//确成硅园区推送//确成硅//安全风险事件表.xlsx");
        ExcelUtil<T_AQFXSJ> excelUtil = new ExcelUtil<>(T_AQFXSJ.class);
        List<T_AQFXSJ> dataList = excelUtil.importExcel(inputStream);
        String dataStr = JSONUtil.toJsonStr(dataList);
        aesAndReportData(reportMap, dataStr, QCSiliconReportConstant.QCG_AES_KEY);
    }

    // 安全风险管控措施表
    // "msg":"保存失败,请检查数据规范；失败记录[\"266a0276c80d499db3ddcca1e019d59f\"]"
    @Test
    public void T_AQFXGKCS() throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("serviceId", QCSiliconReportConstant.T_AQFXGKCS_SERVICE_ID);
        reportMap.put("orgCode", QCSiliconReportConstant.QCG_ORG_CODE);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//确成硅园区推送//确成硅//安全风险管控措施表.xlsx");
        ExcelUtil<T_AQFXGKCS> excelUtil = new ExcelUtil<>(T_AQFXGKCS.class);
        List<T_AQFXGKCS> dataList = excelUtil.importExcel(inputStream);
        String dataStr = JSONUtil.toJsonStr(dataList);
        aesAndReportData(reportMap, dataStr, QCSiliconReportConstant.QCG_AES_KEY);
    }

    // 安全检查记录表
    @Test
    public void T_AQJCJL() throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("serviceId", QCSiliconReportConstant.T_AQJCJL_SERVICE_ID);
        reportMap.put("orgCode", QCSiliconReportConstant.QCG_ORG_CODE);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//确成硅园区推送//确成硅//安全检查记录表.xlsx");
        ExcelUtil<T_AQJCJL> excelUtil = new ExcelUtil<>(T_AQJCJL.class);
        List<T_AQJCJL> dataList = excelUtil.importExcel(inputStream);
        String dataStr = JSONUtil.toJsonStr(dataList);
        aesAndReportData(reportMap, dataStr, QCSiliconReportConstant.QCG_AES_KEY);
    }

    // 检查表维护信息表
    // "msg":"保存失败"
    @Test
    public void T_JCBWHXX() throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("serviceId", QCSiliconReportConstant.T_JCBWHXX_SERVICE_ID);
        reportMap.put("orgCode", QCSiliconReportConstant.QCG_ORG_CODE);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//确成硅园区推送//确成硅//检查表维护信息表.xlsx");
        ExcelUtil<T_JCBWHXX> excelUtil = new ExcelUtil<>(T_JCBWHXX.class);
        List<T_JCBWHXX> dataList = excelUtil.importExcel(inputStream);
        String dataStr = JSONUtil.toJsonStr(dataList.get(0));
        aesAndReportData(reportMap, dataStr, QCSiliconReportConstant.QCG_AES_KEY);
    }

    // 隐患排查任务信息表
    @Test
    public void T_YHPCRWXX() throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("serviceId", QCSiliconReportConstant.T_YHPCRWXX_SERVICE_ID);
        reportMap.put("orgCode", QCSiliconReportConstant.QCG_ORG_CODE);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//确成硅园区推送//确成硅//隐患排查任务信息表.xlsx");
        ExcelUtil<T_YHPCRWXX> excelUtil = new ExcelUtil<>(T_YHPCRWXX.class);
        List<T_YHPCRWXX> dataList = excelUtil.importExcel(inputStream);
        for (T_YHPCRWXX t_yhpcrwxx : dataList) {
            String troubleshoot_content = t_yhpcrwxx.getTROUBLESHOOT_CONTENT();
            if (troubleshoot_content != null && !"".equals(troubleshoot_content)) {
                t_yhpcrwxx.setTROUBLESHOOT_CONTENT(troubleshoot_content.replace(" ", ""));
            }
        }
        String dataStr = JSONUtil.toJsonStr(dataList.get(0));
        aesAndReportData(reportMap, dataStr, QCSiliconReportConstant.QCG_AES_KEY);
    }

    // 隐患排查记录表
    @Test
    public void T_YHPCJL() throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("serviceId", QCSiliconReportConstant.T_YHPCJL_SERVICE_ID);
        reportMap.put("orgCode", QCSiliconReportConstant.QCG_ORG_CODE);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//确成硅园区推送//确成硅//隐患排查记录表.xlsx");
        ExcelUtil<T_YHPCJL> excelUtil = new ExcelUtil<>(T_YHPCJL.class);
        List<T_YHPCJL> dataList = excelUtil.importExcel(inputStream);
        String dataStr = JSONUtil.toJsonStr(dataList);
        aesAndReportData(reportMap, dataStr, QCSiliconReportConstant.QCG_AES_KEY);
    }

    // 隐患治理信息表
    @Test
    public void T_YHZLXX() throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("serviceId", QCSiliconReportConstant.T_YHZLXX_SERVICE_ID);
        reportMap.put("orgCode", QCSiliconReportConstant.QCG_ORG_CODE);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//确成硅园区推送//确成硅//隐患治理信息表.xlsx");
        ExcelUtil<T_YHZLXX> excelUtil = new ExcelUtil<>(T_YHZLXX.class);
        List<T_YHZLXX> dataList = excelUtil.importExcel(inputStream);
        String dataStr = JSONUtil.toJsonStr(dataList);
        aesAndReportData(reportMap, dataStr, QCSiliconReportConstant.QCG_AES_KEY);
    }

    // 安全生产责任承诺卡信息表
    @Test
    public void T_AQSCZRCLKXX() throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("serviceId", QCSiliconReportConstant.T_AQSCZRCLKXX_SERVICE_ID);
        reportMap.put("orgCode", QCSiliconReportConstant.QCG_ORG_CODE);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//确成硅园区推送//确成硅//安全生产责任承诺卡信息表.xlsx");
        ExcelUtil<T_AQSCZRCLKXX> excelUtil = new ExcelUtil<>(T_AQSCZRCLKXX.class);
        List<T_AQSCZRCLKXX> dataList = excelUtil.importExcel(inputStream);
        String dataStr = JSONUtil.toJsonStr(dataList);
        aesAndReportData(reportMap, dataStr, QCSiliconReportConstant.QCG_AES_KEY);
    }

    // 作业场所（工作岗位）危险（有害）因素和物品危险（有害）危害特性应知卡信息表
    @Test
    public void T_ZYCSWXYSHWPWXWHTXYZKXX() throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("serviceId", QCSiliconReportConstant.T_ZYCSWXYSHWPWXWHTXYZKXX_SERVICE_ID);
        reportMap.put("orgCode", QCSiliconReportConstant.QCG_ORG_CODE);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//确成硅园区推送//确成硅//危害特性应知卡信息表.xlsx");
        ExcelUtil<T_ZYCSWXYSHWPWXWHTXYZKXX> excelUtil = new ExcelUtil<>(T_ZYCSWXYSHWPWXWHTXYZKXX.class);
        List<T_ZYCSWXYSHWPWXWHTXYZKXX> dataList = excelUtil.importExcel(inputStream);
        String dataStr = JSONUtil.toJsonStr(dataList);
        aesAndReportData(reportMap, dataStr, QCSiliconReportConstant.QCG_AES_KEY);
    }

    // 应急处置卡信息表
    @Test
    public void T_YJCZKXX() throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("serviceId", QCSiliconReportConstant.T_YJCZKXX_SERVICE_ID);
        reportMap.put("orgCode", QCSiliconReportConstant.QCG_ORG_CODE);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//确成硅园区推送//确成硅//应急处置卡信息表.xlsx");
        ExcelUtil<T_YJCZKXX> excelUtil = new ExcelUtil<>(T_YJCZKXX.class);
        List<T_YJCZKXX> dataList = excelUtil.importExcel(inputStream);
        String dataStr = JSONUtil.toJsonStr(dataList);
        aesAndReportData(reportMap, dataStr, QCSiliconReportConstant.QCG_AES_KEY);
    }

}
