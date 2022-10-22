package com.example.study.entity;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName YHPCREXX010
 * @Description 隐患排查任务信息表   topic：YHPCREXX010
 * @Author zlguo
 * @Date 2022/7/28
 **/
@Data
@NoArgsConstructor
public class YHPCREXX010 {

    @JsonProperty("CHECKTASK_ID")
    @Excel(name = "隐患排查任务ID")
    private String CHECKTASK_ID;

    @JsonProperty("RISK_MEASURE_ID")
    @Excel(name = "管控措施ID")
    private String RISK_MEASURE_ID;

    @JsonProperty("TROUBLESHOOT_CONTENT")
    @Excel(name = "隐患排产内容")
    private String TROUBLESHOOT_CONTENT;

    @JsonProperty("CHECK_CYCLE")
    @Excel(name = "巡检周期")
    private String CHECK_CYCLE;

    @JsonProperty("CHECK_CYCLE_UNIT")
    @Excel(name = "巡检周期单位")
    private String CHECK_CYCLE_UNIT;

    @JsonProperty("CREATE_TIME")
    @Excel(name = "创建时间")
    private String CREATE_TIME;

    @JsonProperty("CREATE_BY")
    @Excel(name = "创建人")
    private String CREATE_BY;

    @JsonProperty("UPDATE_TIME")
    @Excel(name = "最后修改时间")
    private String UPDATE_TIME;

    @JsonProperty("UPDATE_BY")
    @Excel(name = "最后修改人")
    private String UPDATE_BY;

    @JsonProperty("DELETE_MARK")
    @Excel(name = "删除标志")
    private String DELETE_MARK;

    @JsonProperty("COMPANY_CODE")
    @Excel(name = "企业编码")
    private String COMPANY_CODE;

    @JsonProperty("COMPANY_NAME")
    @Excel(name = "厂商名称")
    private String COMPANY_NAME;

}
