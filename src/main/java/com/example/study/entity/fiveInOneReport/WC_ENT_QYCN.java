package com.example.study.entity.fiveInOneReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName WC_ENT_QYCN
 * @Description 企业承诺作业票详情表
 * @Author zlguo
 * @Date 2022/11/8
 **/
@Data
@NoArgsConstructor
public class WC_ENT_QYCN {

    @JsonProperty("TASK_ID")
    @Excel(name = "作业票id")
    private String TASK_ID;

    @JsonProperty("COMPANY_CODE")
    @Excel(name = "企业编码")
    private String COMPANY_CODE;

    @JsonProperty("TASK_TYPE")
    @Excel(name = "作业类型")
    private String TASK_TYPE;

    @JsonProperty("TASK_POSITION")
    @Excel(name = "作业地址")
    private String TASK_POSITION;

    @JsonProperty("TASK_BEGIN_TIME")
    @Excel(name = "作业开始时间")
    private String TASK_BEGIN_TIME;

    @JsonProperty("TASK_END_TIME")
    @Excel(name = "作业结束时间")
    private String TASK_END_TIME;

    @JsonProperty("IS_CONTRACTOR_TASK")
    @Excel(name = "是否是承包商作业")
    private String IS_CONTRACTOR_TASK;

    @JsonProperty("TASK_UNIT")
    @Excel(name = "作业单位")
    private String TASK_UNIT;

    @JsonProperty("MAJOR_PERSON")
    @Excel(name = "负责人")
    private String MAJOR_PERSON;

    @JsonProperty("MAJOR_PERSON_MOBILE")
    @Excel(name = "负责人联系方式")
    private String MAJOR_PERSON_MOBILE;

    @JsonProperty("TASK_CONTENT")
    @Excel(name = "作业内容")
    private String TASK_CONTENT;

    @JsonProperty("IS_CHANGED")
    @Excel(name = "作业是否变更过")
    private String IS_CHANGED;

    @JsonProperty("CHANGED_REASON")
    @Excel(name = "作业变更原因")
    private String CHANGED_REASON;

    @JsonProperty("IS_CANCELLED")
    @Excel(name = "作业是否取消")
    private String IS_CANCELLED;

    @JsonProperty("CANCELLED_REASON")
    @Excel(name = "作业取消原因")
    private String CANCELLED_REASON;

    @JsonProperty("IS_ACTIVE")
    @Excel(name = "是否有效")
    private String IS_ACTIVE;

    @JsonProperty("CREATOR")
    @Excel(name = "创建人")
    private String CREATOR;

    @JsonProperty("CREATE_TIME")
    @Excel(name = "创建日期")
    private String CREATE_TIME;

    @JsonProperty("UPDATOR")
    @Excel(name = "修改人")
    private String UPDATOR;

    @JsonProperty("UPDATE_TIME")
    @Excel(name = "修改日期")
    private String UPDATE_TIME;

}
