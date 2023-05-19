package com.example.study.entity.fiveInOneReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author littlefool
 * @ClassName EnterprisePersonInfoReportDto
 * @description 企业人员信息上报实体类
 * @date 2023年05月11日
 */
@Data
@NoArgsConstructor
public class EnterprisePersonInfoReportDto {

    @JsonProperty("id")
    @Excel(name = "人员ID")
    private String id;
    @JsonProperty("xm")
    @Excel(name = "姓名")
    private String xm;
    @JsonProperty("xb")
    @Excel(name = "性别")
    private String xb;
    @JsonProperty("mz")
    @Excel(name = "民族")
    private String mz;
    @JsonProperty("zjlx")
    @Excel(name = "证件类型")
    private String zjlx;
    @JsonProperty("zjhm")
    @Excel(name = "证件号码")
    private String zjhm;
    @JsonProperty("rylx")
    @Excel(name = "人员类型")
    private String rylx;
    @JsonProperty("zgxl")
    @Excel(name = "最高学历")
    private String zgxl;
    @JsonProperty("zhbyyx")
    @Excel(name = "最后毕业院校")
    private String zhbyyx;
    @JsonProperty("zy")
    @Excel(name = "专业")
    private String zy;
    @JsonProperty("gzjl")
    @Excel(name = "工作经历")
    private String gzjl;
    @JsonProperty("jrbdwrq")
    @Excel(name = "进入本单位日期")
    private String jrbdwrq;
    @JsonProperty("bz")
    @Excel(name = "备注")
    private String bz;
    @JsonProperty("create_time")
    @Excel(name = "创建时间")
    private String create_time;
    @JsonProperty("create_by")
    @Excel(name = "创建人")
    private String create_by;
    @JsonProperty("update_time")
    @Excel(name = "最后修改时间")
    private String update_time;
    @JsonProperty("update_by")
    @Excel(name = "最后修改人")
    private String update_by;
    @JsonProperty("delete_mark")
    @Excel(name = "删除标识")
    private String delete_mark;
    @JsonProperty("company_code")
    @Excel(name = "企业编码")
    private String company_code;
}