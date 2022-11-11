package com.example.study.entity.fiveInOneReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName WC_ENT_SAFE_TARGET
 * @Description 安全目标指标
 * @Author zlguo
 * @Date 2022/11/10
 **/
@Data
@NoArgsConstructor
public class WC_ENT_SAFE_TARGET {

    @JsonProperty("SAFETARGETID")
    @Excel(name = "目标指标ID")
    private String SAFETARGETID;

    @JsonProperty("TARGETINFO")
    @Excel(name = "目标指标(内容)")
    private String TARGETINFO;

    @JsonProperty("ENTCREDITCODE")
    @Excel(name = "企业统一社会信用代码")
    private String ENTCREDITCODE;

    @JsonProperty("TARGETVALUE")
    @Excel(name = "指标值")
    private String TARGETVALUE;

    @JsonProperty("TARGETLEVEL")
    @Excel(name = "指标级别 ")
    private String TARGETLEVEL;

    @JsonProperty("FINISHTIME")
    @Excel(name = "完成期限")
    private String FINISHTIME;

    @JsonProperty("NOTES")
    @Excel(name = "备注")
    private String NOTES;

    @JsonProperty("YEARTIME")
    @Excel(name = "年度")
    private String YEARTIME;

    @JsonProperty("FORMULATTIME")
    @Excel(name = "制定时间")
    private String FORMULATTIME;

    @JsonProperty("CREATEDTIME")
    @Excel(name = "创建时间")
    private String CREATEDTIME;

    @JsonProperty("UPDATEDTIME")
    @Excel(name = "更新时间")
    private String UPDATEDTIME;

}
