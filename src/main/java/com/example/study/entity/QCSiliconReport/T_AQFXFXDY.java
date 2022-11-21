package com.example.study.entity.QCSiliconReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName T_AQFXFXDY
 * @Description 安全风险分析单元表  t_aqfxfxdy
 * @Author zlguo
 * @Date 2022/11/21
**/
@Data
@NoArgsConstructor
public class T_AQFXFXDY {

    @JsonProperty("ID")
    @Excel(name = "主键")
    private String ID;

    @JsonProperty("RISKUNIT_ID")
    @Excel(name = "风险单元ID")
    private String RISKUNIT_ID;

    @JsonProperty("HAZARD_CODE")
    @Excel(name = "风险分析对象编码（重大危险源）")
    private String HAZARD_CODE;

    @JsonProperty("HAZARD_CODE1")
    @Excel(name = "风险分析对象编码（非重大危险源）")
    private String HAZARD_CODE1;

    @JsonProperty("HAZARD_DEP")
    @Excel(name = "责任部门")
    private String HAZARD_DEP;

    @JsonProperty("HAZARD_LIABLE_PERSON")
    @Excel(name = "责任人")
    private String HAZARD_LIABLE_PERSON;

    @JsonProperty("RISK_UNIT_NAME")
    @Excel(name = "风险分析单元名称")
    private String RISK_UNIT_NAME;

    @JsonProperty("RISK_CLASS")
    @Excel(name = "风险等级")
    private String RISK_CLASS;

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

}
