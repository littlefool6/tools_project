package com.example.study.entity.fiveInOneReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName WC_ENT_FXGK
 * @Description 风险管控信息
 * @Author zlguo
 * @Date 2022/11/10
 **/
@Data
@NoArgsConstructor
public class WC_ENT_FXGK {

    @JsonProperty("TYSHXYDM")
    @Excel(name = "企业统一信用代码")
    private String TYSHXYDM;

    @JsonProperty("FXGKUUID")
    @Excel(name = "风险管控标识")
    private String FXGKUUID;

    @JsonProperty("FXUUID")
    @Excel(name = "风险辨识表标识")
    private String FXUUID;

    @JsonProperty("FXMC")
    @Excel(name = "风险名称")
    private String FXMC;

    @JsonProperty("SNDFXDJ")
    @Excel(name = "上年度风险等级")
    private String SNDFXDJ;

    @JsonProperty("GYFX")
    @Excel(name = "固有危险")
    private String GYFX;

    @JsonProperty("FXGKCJ")
    @Excel(name = "风险管控层级")
    private String FXGKCJ;

    @JsonProperty("FXJZYS")
    @Excel(name = "风险校正因素")
    private String FXJZYS;

    @JsonProperty("FXJZDJ")
    @Excel(name = "风险校正等级")
    private String FXJZDJ;

    @JsonProperty("SCPJRQ")
    @Excel(name = "上次评价日期")
    private String SCPJRQ;

    @JsonProperty("GKCS")
    @Excel(name = "管控措施")
    private String GKCS;

    @JsonProperty("LSQK")
    @Excel(name = "落实情况")
    private String LSQK;

    @JsonProperty("XGZL")
    @Excel(name = "相关资料")
    private String XGZL;

    @JsonProperty("ZRDW")
    @Excel(name = "责任单位")
    private String ZRDW;

    @JsonProperty("ZRR")
    @Excel(name = "责任人")
    private String ZRR;

    @JsonProperty("LY")
    @Excel(name = "来源")
    private String LY;

    @JsonProperty("SHR")
    @Excel(name = "审核人")
    private String SHR;

    @JsonProperty("CJSJ")
    @Excel(name = "创建时间")
    private String CJSJ;

    @JsonProperty("GXSJ")
    @Excel(name = "更新时间")
    private String GXSJ;

    @JsonProperty("FXFX")
    @Excel(name = "风险分析")
    private String FXFX;

}
