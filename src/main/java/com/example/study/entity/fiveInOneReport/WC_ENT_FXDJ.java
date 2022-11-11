package com.example.study.entity.fiveInOneReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName WC_ENT_FXDJ
 * @Description 风险等级
 * @Author zlguo
 * @Date 2022/11/10
 **/
@Data
@NoArgsConstructor
public class WC_ENT_FXDJ {

    @JsonProperty("TYSHXYDM")
    @Excel(name = "企业统一信用代码")
    private String TYSHXYDM;

    @JsonProperty("FXDJUUID")
    @Excel(name = "风险等级标识")
    private String FXDJUUID;

    @JsonProperty("FXUUID")
    @Excel(name = "风险辨识表标识")
    private String FXUUID;

    @JsonProperty("FXMC")
    @Excel(name = "风险名称")
    private String FXMC;

    @JsonProperty("FXDJ")
    @Excel(name = "风险等级")
    private String FXDJ;

    @JsonProperty("PGRY")
    @Excel(name = "评估人员")
    private String PGRY;

    @JsonProperty("PGRQ")
    @Excel(name = "评估日期")
    private String PGRQ;

    @JsonProperty("FXFXFF")
    @Excel(name = "风险分析方法")
    private String FXFXFF;

    @JsonProperty("LECL")
    @Excel(name = "LEC 法 L 值")
    private String LECL;

    @JsonProperty("LECE")
    @Excel(name = "LEC 法 E 值")
    private String LECE;

    @JsonProperty("LECC")
    @Excel(name = "LEC 法 C 值")
    private String LECC;

    @JsonProperty("LSL")
    @Excel(name = "LS 法 L 值")
    private String LSL;

    @JsonProperty("LSS")
    @Excel(name = "LS 法 S 值")
    private String LSS;

    @JsonProperty("FPSJ")
    @Excel(name = "复评时间")
    private String FPSJ;

    @JsonProperty("CJSJ")
    @Excel(name = "创建时间")
    private String CJSJ;

    @JsonProperty("GXSJ")
    @Excel(name = "更新时间")
    private String GXSJ;

}
