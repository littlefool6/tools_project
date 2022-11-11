package com.example.study.entity.fiveInOneReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName WC_ENT_TARGET_RESOLVE
 * @Description 安全目标指标分解
 * @Author zlguo
 * @Date 2022/11/10
 **/
@Data
@NoArgsConstructor
public class WC_ENT_TARGET_RESOLVE {

    @JsonProperty("RESOLVETARGETID")
    @Excel(name = "分解目标ID")
    private String RESOLVETARGETID;

    @JsonProperty("DUTYDEPT")
    @Excel(name = "责任部门")
    private String DUTYDEPT;

    @JsonProperty("ENTCREDITCODE")
    @Excel(name = "企业统一社会信用代码")
    private String ENTCREDITCODE;

    @JsonProperty("TARGETVALUE")
    @Excel(name = "目标值")
    private String TARGETVALUE;

    @JsonProperty("TARGETYPE")
    @Excel(name = "指标类型 年/月")
    private String TARGETYPE;

    @JsonProperty("SAFETARGETID")
    @Excel(name = "目标指标ID")
    private String SAFETARGETID;

    @JsonProperty("FORMULATEDEPT")
    @Excel(name = "制定部门")
    private String FORMULATEDEPT;

    @JsonProperty("FORMULATTIME")
    @Excel(name = "制定时间")
    private String FORMULATTIME;

    @JsonProperty("CREATED_TIME")
    @Excel(name = "创建时间")
    private String CREATED_TIME;

    @JsonProperty("UPDATED_TIME")
    @Excel(name = "更新时间")
    private String UPDATED_TIME;

}
