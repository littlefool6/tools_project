package com.example.study.entity.QCSiliconReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName T_AQFXGKCS
 * @Description 安全风险管控措施表  t_aqfxgkcs
 * @Author zlguo
 * @Date 2022/11/21
 **/
@Data
@NoArgsConstructor
public class T_AQFXGKCS {

    @JsonProperty("ID")
    @Excel(name = "主键")
    private String ID;

    @JsonProperty(value = "RISKMEASURE_ID")
    @Excel(name = "管控措施ID")
    private String RISKMEASURE_ID;

    @JsonProperty(value = "RISK_EVENT_ID")
    @Excel(name = "风险事件ID")
    private String RISK_EVENT_ID;

    @JsonProperty(value = "DATA_SRC")
    @Excel(name = "管控方式")
    private String DATA_SRC;

    @JsonProperty(value = "RISK_MEASURE_DESC")
    @Excel(name = "管控措施描述")
    private String RISK_MEASURE_DESC;

    @JsonProperty(value = "CLASSIFY1")
    @Excel(name = "管控措施分类1")
    private String CLASSIFY1;

    @JsonProperty(value = "CLASSIFY2")
    @Excel(name = "管控措施分类2")
    private String CLASSIFY2;

    @JsonProperty(value = "CLASSIFY3")
    @Excel(name = "管控措施分类3")
    private String CLASSIFY3;

    @JsonProperty(value = "TROUBLESHOOT_CONTENT")
    @Excel(name = "隐患排查内容")
    private String TROUBLESHOOT_CONTENT;

    @JsonProperty(value = "CREATE_TIME")
    @Excel(name = "创建时间")
    private String CREATE_TIME;

    @JsonProperty(value = "CREATE_BY")
    @Excel(name = "创建人")
    private String CREATE_BY;

    @JsonProperty(value = "UPDATE_TIME")
    @Excel(name = "最后修改时间")
    private String UPDATE_TIME;

    @JsonProperty(value = "UPDATE_BY")
    @Excel(name = "最后修改人")
    private String UPDATE_BY;

    @JsonProperty(value = "DELETE_MARK")
    @Excel(name = "删除标志")
    private String DELETE_MARK;

    @JsonProperty(value = "COMPANY_CODE")
    @Excel(name = "企业编码")
    private String COMPANY_CODE;

}
