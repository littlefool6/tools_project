package com.example.study.entity.fiveInOneReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author littlefool
 * @ClassName ProductFacilityInfoReportDto
 * @description 生产设施信息上报实体类
 * @date 2023年05月11日
 */
@Data
@NoArgsConstructor
public class ProductFacilityInfoReportDto {

    @JsonProperty("scssid")
    @Excel(name = "生产设施ID")
    private String scssid;
    @JsonProperty("sfsstqy")
    @Excel(name = "是否在四色图区域内")
    private String sfsstqy;
    @JsonProperty("fssstid")
    @Excel(name = "风险四色图ID")
    private String fssstid;
    @JsonProperty("zzssmc")
    @Excel(name = "装置设施名称")
    private String zzssmc;
    @JsonProperty("zzsswh")
    @Excel(name = "装置设施位号")
    private String zzsswh;
    @JsonProperty("zzbm")
    @Excel(name = "装置编码")
    private String zzbm;
    @JsonProperty("zzssyt")
    @Excel(name = "装置设施用途")
    private String zzssyt;
    @JsonProperty("zzssxh")
    @Excel(name = "装置设施型号")
    private String zzssxh;
    @JsonProperty("lxlb")
    @Excel(name = "类型/类别")
    private String lxlb;
    @JsonProperty("dwbm")
    @Excel(name = "单位部门")
    private String dwbm;
    @JsonProperty("szbw")
    @Excel(name = "设置部位")
    private String szbw;
    @JsonProperty("scrq")
    @Excel(name = "生产日期")
    private String scrq;
    @JsonProperty("syqx")
    @Excel(name = "使用期限")
    private String syqx;
    @JsonProperty("smzq")
    @Excel(name = "生命周期")
    private String smzq;
    @JsonProperty("tyrq")
    @Excel(name = "投用日期")
    private String tyrq;
    @JsonProperty("wxzt")
    @Excel(name = "维修状态")
    private String wxzt;
    @JsonProperty("tyzt")
    @Excel(name = "停用状态")
    private String tyzt;
    @JsonProperty("scjcrq")
    @Excel(name = "上次检查日期")
    private String scjcrq;
    @JsonProperty("scjcrq_1")
    @Excel(name = "上次检测日期")
    private String scjcrq_1;
    @JsonProperty("scbyrq")
    @Excel(name = "上次保养日期")
    private String scbyrq;
    @JsonProperty("xcjcrq")
    @Excel(name = "下次检查日期")
    private String xcjcrq;
    @JsonProperty("xcjcrq_1")
    @Excel(name = "下次检测日期")
    private String xcjcrq_1;
    @JsonProperty("xcbyrq")
    @Excel(name = "下次保养日期")
    private String xcbyrq;
    @JsonProperty("fzr")
    @Excel(name = "负责人")
    private String fzr;
    @JsonProperty("fzrdw")
    @Excel(name = "负责人部门")
    private String fzrdw;
    @JsonProperty("gys")
    @Excel(name = "供应商")
    private String gys;
    @JsonProperty("sysm")
    @Excel(name = "使用说明")
    private String sysm;
    @JsonProperty("sfjc")
    @Excel(name = "是否检查")
    private String sfjc;
    @JsonProperty("jczq")
    @Excel(name = "检查周期")
    private String jczq;
    @JsonProperty("jctqtx")
    @Excel(name = "检查提前提醒")
    private String jctqtx;
    @JsonProperty("sfjc_1")
    @Excel(name = "是否检测")
    private String sfjc_1;
    @JsonProperty("jczq_1")
    @Excel(name = "检测周期")
    private String jczq_1;
    @JsonProperty("jctqtx_1")
    @Excel(name = "检测提前提醒")
    private String jctqtx_1;
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