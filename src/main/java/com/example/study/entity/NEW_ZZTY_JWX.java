package com.example.study.entity;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName NEW_ZZTY_JWX
 * @Description 装置停用/检维修记录  topic：NEW_ZZTY_JWX
 * @Author zlguo
 * @Date 2023/6/6
 **/
@Data
@NoArgsConstructor
public class NEW_ZZTY_JWX {

    @JsonProperty("ID")
    @Excel(name = "主键")
    private String ID;
    @JsonProperty("COMPANY_CODE")
    @Excel(name = "企业编码")
    private String COMPANY_CODE;
    @JsonProperty("HAZARD_CODE")
    @Excel(name = "风险分析对象编码")
    private String HAZARD_CODE;
    @JsonProperty("RISK_UNIT_ID")
    @Excel(name = "风险分析单元ID")
    private String RISK_UNIT_ID;
    @JsonProperty("STOP_START_TIME")
    @Excel(name = "停用开始时间")
    private String STOP_START_TIME;
    @JsonProperty("STOP_END_TIME")
    @Excel(name = "停用结束时间")
    private String STOP_END_TIME;
    @JsonProperty("STOP_REASON")
    @Excel(name = "原因")
    private String STOP_REASON;
    @JsonProperty("CREATE_DATE")
    @Excel(name = "创建时间")
    private String CREATE_DATE;
    @JsonProperty("CREATE_BY")
    @Excel(name = "创建人")
    private String CREATE_BY;
    @JsonProperty("UPDATE_DATE")
    @Excel(name = "最后修改时间")
    private String UPDATE_DATE;
    @JsonProperty("UPDATE_BY")
    @Excel(name = "最后修改人")
    private String UPDATE_BY;
    @JsonProperty("COMPANY_NAME")
    @Excel(name = "厂商名称")
    private String COMPANY_NAME;

}