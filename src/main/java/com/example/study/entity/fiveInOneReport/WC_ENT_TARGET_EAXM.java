package com.example.study.entity.fiveInOneReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName WC_ENT_TARGET_EAXM
 * @Description 安全目标指标考核
 * @Author zlguo
 * @Date 2022/11/10
 **/
@Data
@NoArgsConstructor
public class WC_ENT_TARGET_EAXM {

    @JsonProperty("EXAMINFOID")
    @Excel(name = "考核表主键id")
    private String EXAMINFOID;

    @JsonProperty("EXAMDEPT")
    @Excel(name = "考核部门")
    private String EXAMDEPT;

    @JsonProperty("ENTCREDITCODE")
    @Excel(name = "企业统一社会信用代码")
    private String ENTCREDITCODE;

    @JsonProperty("RESOLVETARGETID")
    @Excel(name = "考核指标ID（关联分解目标iD")
    private String RESOLVETARGETID;

    @JsonProperty("FINISHNOTES")
    @Excel(name = "完成指标")
    private String FINISHNOTES;

    @JsonProperty("EXAMPERSON")
    @Excel(name = "考核人员")
    private String EXAMPERSON;

    @JsonProperty("EXAMDATE")
    @Excel(name = "考核日期")
    private String EXAMDATE;

    @JsonProperty("EXAMRESULT")
    @Excel(name = "考核结果")
    private String EXAMRESULT;

    @JsonProperty("CREATED_TIME")
    @Excel(name = "创建时间")
    private String CREATED_TIME;

    @JsonProperty("UPDATED_TIME")
    @Excel(name = "更新时间")
    private String UPDATED_TIME;

}
