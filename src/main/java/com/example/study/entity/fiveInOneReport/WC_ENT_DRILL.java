package com.example.study.entity.fiveInOneReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName WC_ENT_DRILL
 * @Description 预案应急演练计划
 * @Author zlguo
 * @Date 2022/11/10
 **/
@Data
@NoArgsConstructor
public class WC_ENT_DRILL {

    @JsonProperty("TYSHXYDM")
    @Excel(name = "统一社会信用代码")
    private String TYSHXYDM;

    @JsonProperty("YLJHID")
    @Excel(name = "演练计划id")
    private String YLJHID;

    @JsonProperty("YLMC")
    @Excel(name = "演练名称")
    private String YLMC;

    @JsonProperty("YLDD")
    @Excel(name = "演练地点")
    private String YLDD;

    @JsonProperty("ZBBM")
    @Excel(name = "主办部门")
    private String ZBBM;

    @JsonProperty("YLFS")
    @Excel(name = "演练方式")
    private String YLFS;

    @JsonProperty("YJYA")
    @Excel(name = "应急预案")
    private String YJYA;

    @JsonProperty("YLJB")
    @Excel(name = "演练级别")
    private String YLJB;

    @JsonProperty("JHDZRQ")
    @Excel(name = "计划定制日期")
    private String JHDZRQ;

    @JsonProperty("JHYLRQ")
    @Excel(name = "计划演练日期")
    private String JHYLRQ;

    @JsonProperty("JHZDR")
    @Excel(name = "计划定制人")
    private String JHZDR;

    @JsonProperty("BZ")
    @Excel(name = "备注")
    private String BZ;

    @JsonProperty("XGFJ")
    @Excel(name = "相关附件")
    private String XGFJ;

    @JsonProperty("SJYLRQ")
    @Excel(name = "实际演练日期")
    private String SJYLRQ;

    @JsonProperty("YLSSRY")
    @Excel(name = "演练实施人员")
    private String YLSSRY;

    @JsonProperty("ZYCYRY")
    @Excel(name = "主要参演人员")
    private String ZYCYRY;

    @JsonProperty("QTCYBM")
    @Excel(name = "其它参演部门")
    private String QTCYBM;

    @JsonProperty("YLNR")
    @Excel(name = "演练内容")
    private String YLNR;

    @JsonProperty("YLMD")
    @Excel(name = "演练目的")
    private String YLMD;

    @JsonProperty("YLGC")
    @Excel(name = "演练过程")
    private String YLGC;

    @JsonProperty("YLXJ")
    @Excel(name = "演练小结")
    private String YLXJ;

    @JsonProperty("BZYSMS")
    @Excel(name = "不足因素描述")
    private String BZYSMS;

    @JsonProperty("SFZG")
    @Excel(name = "是否整改")
    private String SFZG;

    @JsonProperty("PJYJ")
    @Excel(name = "评价意见")
    private String PJYJ;

    @JsonProperty("PJZT")
    @Excel(name = "评价状态")
    private String PJZT;

    @JsonProperty("CJSJ")
    @Excel(name = "创建时间")
    private String CJSJ;

    @JsonProperty("GXSJ")
    @Excel(name = "更新时间")
    private String GXSJ;

}
