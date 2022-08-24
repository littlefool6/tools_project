package com.example.study.entity;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName AQJCJL004
 * @Description 安全检查记录表  topic：AQJCJL004
 * @Author zlguo
 * @Date 2022/7/28
 **/
@Data
@NoArgsConstructor
public class AQJCJL004 {

    @JsonProperty("ID")
    @Excel(name = "安全检查记录ID")
    private String ID;

    @JsonProperty("JCBT")
    @Excel(name = "检查标题")
    private String JCBT;

    @JsonProperty("JCDBH")
    @Excel(name = "检查单编号")
    private String JCDBH;

    @JsonProperty("JCR")
    @Excel(name = "记录人员姓名")
    private String JCR;

    @JsonProperty("JCRQ")
    @Excel(name = "检查日期")
    private String JCRQ;

    @JsonProperty("JCZCY")
    @Excel(name = "检查组成员")
    private String JCZCY;

    @JsonProperty("SJDX")
    @Excel(name = "受检对象")
    private String SJDX;

    @JsonProperty("JCLX")
    @Excel(name = "检查类型")
    private String JCLX;

    @JsonProperty("JCXM")
    @Excel(name = "检查项目")
    private String JCXM;

    @JsonProperty("JCNR")
    @Excel(name = "检查内容")
    private String JCNR;

    @JsonProperty("JCJL")
    @Excel(name = "检查结论")
    private String JCJL;

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
