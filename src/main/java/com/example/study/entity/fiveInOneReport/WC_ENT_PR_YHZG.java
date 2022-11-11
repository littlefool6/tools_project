package com.example.study.entity.fiveInOneReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName WC_ENT_PR_YHZG
 * @Description 检查整改单
 * @Author zlguo
 * @Date 2022/11/10
 **/
@Data
@NoArgsConstructor
public class WC_ENT_PR_YHZG {

    @JsonProperty("TYSHXYDM")
    @Excel(name = "统一社会信用代码")
    private String TYSHXYDM;

    @JsonProperty("JCDID")
    @Excel(name = "检查单ID")
    private String JCDID;

    @JsonProperty("JCBT")
    @Excel(name = "检查标题")
    private String JCBT;

    @JsonProperty("JCDBH")
    @Excel(name = "检查单编号")
    private String JCDBH;

    @JsonProperty("JCR")
    @Excel(name = "检查人")
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

    @JsonProperty("JCBZ")
    @Excel(name = "检查标准")
    private String JCBZ;

    @JsonProperty("JCJL")
    @Excel(name = "检查结论")
    private String JCJL;

    @JsonProperty("WTMS")
    @Excel(name = "问题描述")
    private String WTMS;

    @JsonProperty("WZRS")
    @Excel(name = "违章人数")
    private String WZRS;

    @JsonProperty("ZGFS")
    @Excel(name = "整改方式")
    private String ZGFS;

    @JsonProperty("XGFJ")
    @Excel(name = "相关附件")
    private String XGFJ;
    @JsonProperty("CJSJ")
    @Excel(name = "创建时间")
    private String CJSJ;

    @JsonProperty("GXSJ")
    @Excel(name = "更新时间")
    private String GXSJ;

}
