package com.example.study.entity.fiveInOneReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName WC_ENT_PROMISE
 * @Description 企业装置运行状态表
 * @Author zlguo
 * @Date 2022/11/10
 **/
@Data
@NoArgsConstructor
public class WC_ENT_PROMISE {

    @JsonProperty("PRODUCE_ID")
    @Excel(name = "装置运行id")
    private String PRODUCE_ID;

    @JsonProperty("ID")
    @Excel(name = "承诺主键")
    private String ID;

    @JsonProperty("COMPANY_CODE")
    @Excel(name = "企业编码")
    private String COMPANY_CODE;

    @JsonProperty("COMMITE_DATE")
    @Excel(name = "承诺时间")
    private String COMMITE_DATE;

    @JsonProperty("HAZARD_CODE")
    @Excel(name = "危险源编码")
    private String HAZARD_CODE;

    @JsonProperty("EQUIP_CODE")
    @Excel(name = "装置设备编码")
    private String EQUIP_CODE;

    @JsonProperty("IS_TESTING")
    @Excel(name = "是否处于试生产")
    private String IS_TESTING;

    @JsonProperty("RUN_STATUS")
    @Excel(name = "运行状态")
    private String RUN_STATUS;

    @JsonProperty("RUN_STATUS_BEGIN_TIME")
    @Excel(name = "运行状态开始时间")
    private String RUN_STATUS_BEGIN_TIME;

    @JsonProperty("RUN_STATUS_END_TIME")
    @Excel(name = "运行状态结束时间")
    private String RUN_STATUS_END_TIME;

    @JsonProperty("RUN_STATUS_REASON")
    @Excel(name = "处于该运行状态的原因")
    private String RUN_STATUS_REASON;

    @JsonProperty("IS_CHANGED")
    @Excel(name = "是否变更过")
    private String IS_CHANGED;

    @JsonProperty("CHANGED_TIME")
    @Excel(name = "变更时间")
    private String CHANGED_TIME;

    @JsonProperty("CHANGED_REASON")
    @Excel(name = "变更原因")
    private String CHANGED_REASON;

    @JsonProperty("DEAL_STATUS")
    @Excel(name = "填报状态")
    private String DEAL_STATUS;

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
