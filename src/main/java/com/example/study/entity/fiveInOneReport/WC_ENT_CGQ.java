package com.example.study.entity.fiveInOneReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName WC_ENT_CGQ
 * @Description 传感器信息表
 * @Author zlguo
 * @Date 2022/11/10
 **/
@Data
@NoArgsConstructor
public class WC_ENT_CGQ {

    @JsonProperty("TARGET_CODE")
    @Excel(name = "指标编码")
    private String TARGET_CODE;

    @JsonProperty("TARGET_NAME")
    @Excel(name = "指标名称")
    private String TARGET_NAME;

    @JsonProperty("EQUIP_CODE")
    @Excel(name = "设备编码")
    private String EQUIP_CODE;

    @JsonProperty("PRODCELL_TYPE")
    @Excel(name = "生产单元类型")
    private String PRODCELL_TYPE;

    @JsonProperty("EQUIP_NAME")
    @Excel(name = "设备名称")
    private String EQUIP_NAME;

    @JsonProperty("EQUIP_NO")
    @Excel(name = "设备编号")
    private String EQUIP_NO;

    @JsonProperty("EQUIP_TYPE")
    @Excel(name = "设备类型")
    private String EQUIP_TYPE;

    @JsonProperty("GATEWAY_CODE")
    @Excel(name = "网关编码")
    private String GATEWAY_CODE;

    @JsonProperty("UNIT")
    @Excel(name = "计量单位")
    private String UNIT;

    @JsonProperty("LOW_VALUE_01")
    @Excel(name = "阈值下限值01(低低报)")
    private String LOW_VALUE_01;

    @JsonProperty("LOW_VALUE_02")
    @Excel(name = "阈值下限值02(低报)")
    private String LOW_VALUE_02;

    @JsonProperty("TOP_VALUE_01")
    @Excel(name = "阈值上限值01(高报)")
    private String TOP_VALUE_01;

    @JsonProperty("TOP_VALUE_02")
    @Excel(name = "阈值上限值02(高高报)")
    private String TOP_VALUE_02;

    @JsonProperty("LOW_VALUE")
    @Excel(name = "量程下限值")
    private String LOW_VALUE;

    @JsonProperty("TOP_VALUE")
    @Excel(name = "量程上限值")
    private String TOP_VALUE;

    @JsonProperty("BIT_NO")
    @Excel(name = "位号")
    private String BIT_NO;

    @JsonProperty("EQUIP_DESCRIBE")
    @Excel(name = "设备描述")
    private String EQUIP_DESCRIBE;

    @JsonProperty("LONGITUDE")
    @Excel(name = "经度")
    private String LONGITUDE;

    @JsonProperty("LATITUDE")
    @Excel(name = "纬度")
    private String LATITUDE;

    @JsonProperty("IS_USE")
    @Excel(name = "是否停用")
    private String IS_USE;

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
