package com.example.study.entity.fiveInOneReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName WC_ENT_PR_PXHD
 * @Description 安全活动
 * @Author zlguo
 * @Date 2022/11/10
 **/
@Data
@NoArgsConstructor
public class WC_ENT_PR_PXHD {

    @JsonProperty("TYSHXYDM")
    @Excel(name = "统一社会信用代码")
    private String TYSHXYDM;
    @JsonProperty("HDID")
    @Excel(name = "活动ID")
    private String HDID;
    @JsonProperty("HDBT")
    @Excel(name = "活动标题")
    private String HDBT;
    @JsonProperty("HDSJ")
    @Excel(name = "活动时间")
    private String HDSJ;
    @JsonProperty("HDDD")
    @Excel(name = "活动地点")
    private String HDDD;
    @JsonProperty("HDZCR")
    @Excel(name = "活动主持人")
    private String HDZCR;
    @JsonProperty("ZBBM")
    @Excel(name = "主办部门")
    private String ZBBM;
    @JsonProperty("ZYCYRY")
    @Excel(name = "主要参与人员")
    private String ZYCYRY;
    @JsonProperty("SFFB")
    @Excel(name = "是否发布")
    private String SFFB;
    @JsonProperty("HDNR")
    @Excel(name = "活动内容")
    private String HDNR;
    @JsonProperty("HDQKYZJ")
    @Excel(name = "活动情况与总结")
    private String HDQKYZJ;
    @JsonProperty("FJ")
    @Excel(name = "附件")
    private String FJ;
    @JsonProperty("CJSJ")
    @Excel(name = "创建时间")
    private String CJSJ;
    @JsonProperty("GXSJ")
    @Excel(name = "更新时间")
    private String GXSJ;

}
