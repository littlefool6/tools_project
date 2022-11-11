package com.example.study.entity.fiveInOneReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName WC_ENT_LEAKPOINT
 * @Description 气体泄漏监测点信息表
 * @Author zlguo
 * @Date 2022/11/8
 **/
@Data
@NoArgsConstructor
public class WC_ENT_LEAKPOINT {

    @JsonProperty("EQUIP_CODE")
    @Excel(name = "设备编码")
    private String EQUIP_CODE;

    @JsonProperty("HAZARD_CODE")
    @Excel(name = "重大危险源编码")
    private String HAZARD_CODE;

    @JsonProperty("PRODCELL_ID")
    @Excel(name = "生产单元区域标识")
    private String PRODCELL_ID;

    @JsonProperty("LEAKPOINT_NAME")
    @Excel(name = "泄漏点名称")
    private String LEAKPOINT_NAME;

    @JsonProperty("MONITOR_TYPE")
    @Excel(name = "传感器类型")
    private String MONITOR_TYPE;

    @JsonProperty("MONITOR_CASCODE")
    @Excel(name = "监测气体标识")
    private String MONITOR_CASCODE;

    @JsonProperty("IS_USE")
    @Excel(name = "是否停用")
    private String IS_USE;

    @JsonProperty("STOP_REMARK")
    @Excel(name = "停用说明")
    private String STOP_REMARK;

    @JsonProperty("STOP_PSN")
    @Excel(name = "停用人")
    private String STOP_PSN;

    @JsonProperty("STOP_TIME")
    @Excel(name = "停用申请时间")
    private String STOP_TIME;

    @JsonProperty("LONGITUDE")
    @Excel(name = "经度")
    private String LONGITUDE;

    @JsonProperty("LATITUDE")
    @Excel(name = "纬度")
    private String LATITUDE;

    @JsonProperty("IS_ACTIVE")
    @Excel(name = "是否有效")
    private String IS_ACTIVE;

    @JsonProperty("CREATOR")
    @Excel(name = "创建人")
    private String CREATOR;

    @JsonProperty("CREATE_TIME")
    @Excel(name = "创建日期")
    private String CREATE_TIME;

    @JsonProperty("UPDATOR")
    @Excel(name = "修改人")
    private String UPDATOR;

    @JsonProperty("UPDATE_TIME")
    @Excel(name = "修改日期")
    private String UPDATE_TIME;

}
