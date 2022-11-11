package com.example.study.entity.fiveInOneReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName WC_ENT_RESERVEPLAN
 * @Description 预案表
 * @Author zlguo
 * @Date 2022/11/10
 **/
@Data
@NoArgsConstructor
public class WC_ENT_RESERVEPLAN {

    @JsonProperty("TYSHXYDM")
    @Excel(name = "统一社会信用代码")
    private String TYSHXYDM;

    @JsonProperty("YABH")
    @Excel(name = "预案编号")
    private String YABH;

    @JsonProperty("YAMC")
    @Excel(name = "预案名称")
    private String YAMC;

    @JsonProperty("SYBM")
    @Excel(name = "适用部门")
    private String SYBM;

    @JsonProperty("YALX")
    @Excel(name = "预案类型")
    private String YALX;

    @JsonProperty("WXYGL")
    @Excel(name = "危险源关联")
    private String WXYGL;

    @JsonProperty("YAJB")
    @Excel(name = "预案级别")
    private String YAJB;

    @JsonProperty("BXR")
    @Excel(name = "编写人")
    private String BXR;

    @JsonProperty("BXBM")
    @Excel(name = "编写部门")
    private String BXBM;

    @JsonProperty("FBSSRQ")
    @Excel(name = "发布实施日期")
    private String FBSSRQ;

    @JsonProperty("YAFJ")
    @Excel(name = "预案附件")
    private String YAFJ;

    @JsonProperty("CJSJ")
    @Excel(name = "创建时间")
    private String CJSJ;

    @JsonProperty("GXSJ")
    @Excel(name = "更新时间")
    private String GXSJ;

}
