package com.example.study.entity;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName FXSST006
 * @Description 风险四色图信息表   topic：FXSST006
 * @Author zlguo
 * @Date 2022/7/28
 **/
@Data
@NoArgsConstructor
public class FXSST006 {

    @JsonProperty("ID")
    @Excel(name = "风险四色图ID")
    private String ID;

    @JsonProperty("FXFQBM")
    @Excel(name = "风险分区编号")
    private String FXFQBM;

    @JsonProperty("FXFQMC")
    @Excel(name = "风险分区名称")
    private String FXFQMC;

    @JsonProperty("FXDJ")
    @Excel(name = "风险等级")
    private String FXDJ;

    @JsonProperty("FXZBFW")
    @Excel(name = "风险坐标范围")
    private String FXZBFW;

    @JsonProperty("GYFXDJ")
    @Excel(name = "固有风险等级")
    private String GYFXDJ;

    @JsonProperty("KZFXDJ")
    @Excel(name = "控制风险等级")
    private String KZFXDJ;

    @JsonProperty("FXJZYS")
    @Excel(name = "风险校正因素")
    private String FXJZYS;

    @JsonProperty("FXJZDJ")
    @Excel(name = "风险校正等级")
    private String FXJZDJ;

    @JsonProperty("SZBM")
    @Excel(name = "所在部门")
    private String SZBM;

    @JsonProperty("ZRR")
    @Excel(name = "评价人")
    private String ZRR;

    @JsonProperty("FPRQ")
    @Excel(name = "复评日期")
    private String FPRQ;

    @JsonProperty("CREATE_TIME")
    @Excel(name = "创建时间")
    private String CREATE_TIME;

    @JsonProperty("CREATE_BY")
    @Excel(name = "创建人")
    private String CREATE_BY;

    @JsonProperty("UPDATE_TIME")
    @Excel(name = "最后修改时间")
    private String UPDATE_TIME;

    @JsonProperty("UPDATE_BY")
    @Excel(name = "最后修改人")
    private String UPDATE_BY;

    @JsonProperty("DELETE_MARK")
    @Excel(name = "删除标志")
    private String DELETE_MARK;

    @JsonProperty("COMPANY_CODE")
    @Excel(name = "企业编码")
    private String COMPANY_CODE;

    @JsonProperty("COMPANY_NAME")
    @Excel(name = "厂商名称")
    private String COMPANY_NAME;

}
