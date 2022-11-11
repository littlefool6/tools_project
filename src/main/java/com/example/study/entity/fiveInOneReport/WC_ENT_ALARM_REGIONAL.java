package com.example.study.entity.fiveInOneReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName WC_ENT_ALARM_REGIONAL
 * @Description 报警信息管理
 * @Author zlguo
 * @Date 2022/11/10
 **/
@Data
@NoArgsConstructor
public class WC_ENT_ALARM_REGIONAL {

    @JsonProperty("GJID")
    @Excel(name = "告警id")
    private String GJID;
    
    @JsonProperty("TYSHXYDM")
    @Excel(name = "企业统一信用代码")
    private String TYSHXYDM;
    
    @JsonProperty("BJQYID")
    @Excel(name = "报警区域ID")
    private String BJQYID;
    
    @JsonProperty("BJRYXM")
    @Excel(name = "报警人员姓名")
    private String BJRYXM;
    
    @JsonProperty("longitude")
    @Excel(name = "报警人员位置经度（度）")
    private String longitude;
    
    @JsonProperty("latitude")
    @Excel(name = "报警人员位置纬度（度）")
    private String latitude;
    
    @JsonProperty("BJSJ")
    @Excel(name = "报警时间")
    private String BJSJ;
    
    @JsonProperty("BJLX")
    @Excel(name = "报警类型")
    private String BJLX;
    
    @JsonProperty("BJCZSJ")
    @Excel(name = "处置时间")
    private String BJCZSJ;
    
    @JsonProperty("BJCZRY")
    @Excel(name = "报警处置人员")
    private String BJCZRY;
    
    @JsonProperty("BJCZJG")
    @Excel(name = "报警处置结果")
    private String BJCZJG;
    
    @JsonProperty("BJJL")
    @Excel(name = "告警记录")
    private String BJJL;

}
