package com.example.study.entity.fiveInOneReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName WC_ENT_TASK
 * @Description 企业承诺详情表
 * @Author zlguo
 * @Date 2022/11/10
 **/
@Data
@NoArgsConstructor
public class WC_ENT_TASK {
    @JsonProperty("ID")
    @Excel(name = "承诺主键")
    private String ID;

    @JsonProperty("COMPANY_CODE")
    @Excel(name = "企业编码")
    private String COMPANY_CODE;

    @JsonProperty("UNITS_NUMBER")
    @Excel(name = "生产装置套数")
    private String UNITS_NUMBER;

    @JsonProperty("RUN_NUMBER")
    @Excel(name = "运行套数")
    private String RUN_NUMBER;

    @JsonProperty("PARK_NUMBER")
    @Excel(name = "停车套数")
    private String PARK_NUMBER;

    @JsonProperty("ROADWORK_NUMBER")
    @Excel(name = "断路作业")
    private String ROADWORK_NUMBER;

    @JsonProperty("SOILWORK_NUMBER")
    @Excel(name = "动土作业")
    private String SOILWORK_NUMBER;

    @JsonProperty("HIGHWORK_NUMBER")
    @Excel(name = "高处作业")
    private String HIGHWORK_NUMBER;

    @JsonProperty("ELECTRICITYWORK_NUMBER")
    @Excel(name = "临时用电作业")
    private String ELECTRICITYWORK_NUMBER;

    @JsonProperty("LIFTINGWORK_NUMBER")
    @Excel(name = "吊装作业")
    private String LIFTINGWORK_NUMBER;

    @JsonProperty("BLINDPLATE_NUMBER")
    @Excel(name = "盲板作业")
    private String BLINDPLATE_NUMBER;

    @JsonProperty("FIRE2_NUMBER")
    @Excel(name = "二级动火作业")
    private String FIRE2_NUMBER;

    @JsonProperty("FIRE1_NUMBER")
    @Excel(name = "一级动火作业")
    private String FIRE1_NUMBER;

    @JsonProperty("SPACEWORK_NUMBER")
    @Excel(name = "受限空间作业")
    private String SPACEWORK_NUMBER;

    @JsonProperty("INSPECTION_NUMBER")
    @Excel(name = "检维修作业")
    private String INSPECTION_NUMBER;

    @JsonProperty("FIRES_NUMBER")
    @Excel(name = "特级动火作业")
    private String FIRES_NUMBER;

    @JsonProperty("PT_FIRE_NUMBER")
    @Excel(name = "动火作业")
    private String PT_FIRE_NUMBER;

    @JsonProperty("POUR_OUT_NUMBER")
    @Excel(name = "倒罐作业")
    private String POUR_OUT_NUMBER;

    @JsonProperty("CLEAN_TANK_NUMBER")
    @Excel(name = "清罐作业")
    private String CLEAN_TANK_NUMBER;

    @JsonProperty("DRAINING_NUMBER")
    @Excel(name = "切水作业")
    private String DRAINING_NUMBER;

    @JsonProperty("CONTRACTOR_NUMBER")
    @Excel(name = "承包商作业")
    private String CONTRACTOR_NUMBER;

    @JsonProperty("CHANGED_TASK_NUMBER")
    @Excel(name = "变更作业")
    private String CHANGED_TASK_NUMBER;

    @JsonProperty("CONTRACTOR")
    @Excel(name = "是否有承包商作业")
    private String CONTRACTOR;

    @JsonProperty("TRIAL_PRODUCTION")
    @Excel(name = "是否处于试生产期")
    private String TRIAL_PRODUCTION;

    @JsonProperty("OPEN_PARKING")
    @Excel(name = "是否处于开停车状态")
    private String OPEN_PARKING;

    @JsonProperty("TEST")
    @Excel(name = "是否开展中（扩）试")
    private String TEST;

    @JsonProperty("TRYUNITS_NUMBER")
    @Excel(name = "试生产装置数")
    private String TRYUNITS_NUMBER;

    @JsonProperty("OVERHAUL_WORK_NUMBER")
    @Excel(name = "检维修套数")
    private String OVERHAUL_WORK_NUMBER;

    @JsonProperty("DANGERMSDS")
    @Excel(name = "重点监管危险工艺数量")
    private String DANGERMSDS;

    @JsonProperty("M_HAZARDS")
    @Excel(name = "有无重大隐患")
    private String M_HAZARDS;

    @JsonProperty("RISK_GRADE")
    @Excel(name = "风险级别")
    private String RISK_GRADE;

    @JsonProperty("COMMITE_DATE")
    @Excel(name = "承诺时间")
    private String COMMITE_DATE;

    @JsonProperty("COMMITMENT")
    @Excel(name = "承诺人")
    private String COMMITMENT;

    @JsonProperty("SUBJECT")
    @Excel(name = "承诺内容")
    private String SUBJECT;

    @JsonProperty("COMMITMENTSTATE")
    @Excel(name = "承诺状态")
    private String COMMITMENTSTATE;

    @JsonProperty("AREA_CODE")
    @Excel(name = "所属区县行政编码")
    private String AREA_CODE;

    @JsonProperty("WORK_NUMBER")
    @Excel(name = "开车装置数")
    private String WORK_NUMBER;

    @JsonProperty("NOT_WOKR_NUMBER")
    @Excel(name = "停车装置数")
    private String NOT_WOKR_NUMBER;

    @JsonProperty("DANGER_GUARANTEE_RESPONSIBILITY")
    @Excel(name = "重大危险源包保责任制落实")
    private String DANGER_GUARANTEE_RESPONSIBILITY;

    @JsonProperty("DUTY_LEAD")
    @Excel(name = "值班领导")
    private String DUTY_LEAD;

    @JsonProperty("DUTY_LEAD_PHONE")
    @Excel(name = "值班领导电话")
    private String DUTY_LEAD_PHONE;

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
