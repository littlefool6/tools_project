package com.example.study.entity.fiveInOneReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName WC_ENT_ALARM_FOREGIN
 * @Description 区域报警中外来人员作业管理
 * @Author zlguo
 * @Date 2022/11/10
 **/
@Data
@NoArgsConstructor
public class WC_ENT_ALARM_FOREGIN {

    @JsonProperty("GJID")
    @Excel(name = "告警id")
    private String GJID;

    @JsonProperty("TYSHXYDM")
    @Excel(name = "企业统一信用代码")
    private String TYSHXYDM;

    @JsonProperty("BMID")
    @Excel(name = "部门id")
    private String BMID;

    @JsonProperty("QUID")
    @Excel(name = "区域id")
    private String QUID;

    @JsonProperty("WLRYXM")
    @Excel(name = "外来人员名称")
    private String WLRYXM;

    @JsonProperty("DW")
    @Excel(name = "人员所属单位")
    private String DW;

    @JsonProperty("WLRYID")
    @Excel(name = "外来人员id")
    private String WLRYID;

    @JsonProperty("JRSJ")
    @Excel(name = "进入时间")
    private String JRSJ;

    @JsonProperty("JSSC")
    @Excel(name = "出去时间")
    private String JSSC;

}
