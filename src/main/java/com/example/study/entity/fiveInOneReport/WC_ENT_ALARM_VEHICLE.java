package com.example.study.entity.fiveInOneReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName WC_ENT_ALARM_VEHICLE
 * @Description 区域报警中危化品运输车辆管理
 * @Author zlguo
 * @Date 2022/11/10
 **/
@Data
@NoArgsConstructor
public class WC_ENT_ALARM_VEHICLE {

    @JsonProperty("GJID")
    @Excel(name = "告警id")
    private String GJID;

    @JsonProperty("TYSHXYDM")
    @Excel(name = "企业统一信用代码")
    private String TYSHXYDM;

    @JsonProperty("BMID")
    @Excel(name = "部门id")
    private String BMID;

    @JsonProperty("QYID")
    @Excel(name = "区域id")
    private String QYID;

    @JsonProperty("CPH")
    @Excel(name = "车牌号")
    private String CPH;

    @JsonProperty("CLSSDW")
    @Excel(name = "车辆所属单位")
    private String CLSSDW;

    @JsonProperty("GZKSSJ")
    @Excel(name = "工作开始时间")
    private String GZKSSJ;

    @JsonProperty("GZJSSJ")
    @Excel(name = "工作结束时间")
    private String GZJSSJ;

}
