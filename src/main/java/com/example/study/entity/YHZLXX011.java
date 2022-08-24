package com.example.study.entity;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName YHZLXX011
 * @Description 隐患治理信息表  topic：YHZLXX011
 * @Author zlguo
 * @Date 2022/7/28
 **/
@Data
@NoArgsConstructor
public class YHZLXX011 {

    @JsonProperty("DANGER_ID")
    @Excel(name = "隐患ID")
    private String DANGER_ID;

    @JsonProperty("DANGER_NAME")
    @Excel(name = "隐患名称")
    private String DANGER_NAME;

    @JsonProperty("HAZARD_CODE")
    @Excel(name = "风险分析对象编码（危险源编码）")
    private String HAZARD_CODE;

    @JsonProperty("RISK_MEASURE_ID")
    @Excel(name = "管控措施ID")
    private String RISK_MEASURE_ID;

    @JsonProperty("RECORD_ID")
    @Excel(name = "隐患排查记录ID")
    private String RECORD_ID;

    @JsonProperty("DANGER_LEVEL")
    @Excel(name = "隐患等级")
    private String DANGER_LEVEL;

    @JsonProperty("REGIST_TIME")
    @Excel(name = "登记时间")
    private String REGIST_TIME;

    @JsonProperty("REGISTRANT")
    @Excel(name = "登记人姓名")
    private String REGISTRANT;

    @JsonProperty("DANGER_SRC")
    @Excel(name = "隐患来源（检查来源分类）")
    private String DANGER_SRC;

    @JsonProperty("DANGER_MANAGE_TYPE")
    @Excel(name = "治理类型")
    private String DANGER_MANAGE_TYPE;

    @JsonProperty("HAZARD_DANGER_TYPE")
    @Excel(name = "隐患类型（专业分类）")
    private String HAZARD_DANGER_TYPE;

    @JsonProperty("DANGER_DESC")
    @Excel(name = "隐患描述")
    private String DANGER_DESC;

    @JsonProperty("DANGER_REASON")
    @Excel(name = "原因分析")
    private String DANGER_REASON;

    @JsonProperty("CONTROL_MEASURES")
    @Excel(name = "控制措施")
    private String CONTROL_MEASURES;

    @JsonProperty("COST")
    @Excel(name = "整改资金")
    private String COST;

    @JsonProperty("LIABLE_PERSON")
    @Excel(name = "整改责任人")
    private String LIABLE_PERSON;

    @JsonProperty("DANGER_MANAGE_DEADLINE")
    @Excel(name = "隐患治理期限")
    private String DANGER_MANAGE_DEADLINE;

    @JsonProperty("CHECK_ACCEPT_PERSON")
    @Excel(name = "验收人姓名")
    private String CHECK_ACCEPT_PERSON;

    @JsonProperty("CHECK_ACCEPT_TIME")
    @Excel(name = "验收时间")
    private String CHECK_ACCEPT_TIME;

    @JsonProperty("CHECK_ACCEPT_COMMENT")
    @Excel(name = "验收情况描述")
    private String CHECK_ACCEPT_COMMENT;

    @JsonProperty("DANGER_STATE")
    @Excel(name = "隐患状态")
    private String DANGER_STATE;

    @JsonProperty("MANAGEMENT_CLASSIFICATION")
    @Excel(name = "人物管理分类")
    private String MANAGEMENT_CLASSIFICATION;

    @JsonProperty("OCCURRENCE_LINK")
    @Excel(name = "发生环节")
    private String OCCURRENCE_LINK;

    @JsonProperty("ATTACHMENTS1")
    @Excel(name = "隐患照片")
    private String ATTACHMENTS1;

    @JsonProperty("ATTACHMENTS2")
    @Excel(name = "隐患整改照片")
    private String ATTACHMENTS2;

    @JsonProperty("FJ")
    @Excel(name = "附件")
    private String FJ;

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
