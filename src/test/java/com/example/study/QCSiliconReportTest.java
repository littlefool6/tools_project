package com.example.study;

import cn.hutool.core.io.FileUtil;
import cn.hutool.json.JSONUtil;
import com.example.study.constant.QCSiliconReportConstant;
import com.example.study.entity.QCSiliconReport.T_AQFXFXDY;
import com.example.study.entity.QCSiliconReport.T_AQFXSJ;
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
        RequestBody body = RequestBody.create(mediaType, JSONUtil.toJsonStr(reportMap));
        Request request = new Request.Builder()
                .url(QCSiliconReportConstant.REPORT_URL)
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .build();
        Response response = client.newCall(request).execute();
        log.info(response.body().string());
    }

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

    @Test
    public void T_AQFXGKCS() throws Exception {
        Map<String, Object> reportMap = Maps.newHashMap();
        reportMap.put("serviceId", QCSiliconReportConstant.T_AQFXGKCS_SERVICE_ID);
        reportMap.put("orgCode", QCSiliconReportConstant.QCG_ORG_CODE);
        reportMap.put("dataId", UUID.randomUUID().toString().replace("-", ""));
        BufferedInputStream inputStream = FileUtil.getInputStream("C://Users//littlefool//Desktop//确成硅园区推送//确成硅//安全风险事件表.xlsx");
        ExcelUtil<T_AQFXSJ> excelUtil = new ExcelUtil<>(T_AQFXSJ.class);
        List<T_AQFXSJ> dataList = excelUtil.importExcel(inputStream);
        String dataStr = JSONUtil.toJsonStr(dataList);
        aesAndReportData(reportMap, dataStr, QCSiliconReportConstant.QCG_AES_KEY);
    }

}
