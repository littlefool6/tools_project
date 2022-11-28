package com.example.study.entity.fiveInOneReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName WC_ENT_MATERIAL
 * @Description 物资装备
 * @Author zlguo
 * @Date 2022/11/23
 **/
@Data
@NoArgsConstructor
public class WC_ENT_MATERIAL {

    @JsonProperty("TYSHXYDM")
    @Excel(name = "统一社会信用代码")
    private String TYSHXYDM;
    @JsonProperty("WZZBBH")
    @Excel(name = "物资装备编号")
    private String WZZBBH;
    @JsonProperty("WZMC")
    @Excel(name = "物资名称")
    private String WZMC;
    @JsonProperty("WZBH")
    @Excel(name = "物资编号")
    private String WZBH;
    @JsonProperty("WZYT")
    @Excel(name = "物资用途")
    private String WZYT;
    @JsonProperty("WZXH")
    @Excel(name = "物资型号")
    private String WZXH;
    @JsonProperty("FZBM")
    @Excel(name = "负责部门")
    private String FZBM;
    @JsonProperty("WZFL")
    @Excel(name = "物资分类")
    private String WZFL;
    @JsonProperty("CFWZ")
    @Excel(name = "存放位置")
    private String CFWZ;
    @JsonProperty("CCSL")
    @Excel(name = "存储数量")
    private String CCSL;
    @JsonProperty("SCRQ")
    @Excel(name = "生产日期")
    private String SCRQ;
    @JsonProperty("SYQY")
    @Excel(name = "使用期限")
    private String SYQY;
    @JsonProperty("SMZQ")
    @Excel(name = "生命周期")
    private String SMZQ;
    @JsonProperty("WZZT")
    @Excel(name = "物资状态")
    private String WZZT;
    @JsonProperty("TYRQ")
    @Excel(name = "投用日期")
    private String TYRQ;
    @JsonProperty("SYSM")
    @Excel(name = "使用说明")
    private String SYSM;
    @JsonProperty("BELTYPE")
    @Excel(name = "属于类型")
    private String BELTYPE;
    @JsonProperty("ENTTEAMID")
    @Excel(name = "所属单位/队伍编号")
    private String ENTTEAMID;
    @JsonProperty("MATERIALTYPECODE")
    @Excel(name = "装备类型")
    private String MATERIALTYPECODE;
    @JsonProperty("CHARACTERINDEX")
    @Excel(name = "特性指标")
    private String CHARACTERINDEX;
    @JsonProperty("INVESTMENTCODE")
    @Excel(name = "投资方式代码")
    private String INVESTMENTCODE;
    @JsonProperty("UNITPRICE")
    @Excel(name = "单价（单位：元）")
    private String UNITPRICE;
    @JsonProperty("PURCHASEDATE")
    @Excel(name = "购买日期")
    private String PURCHASEDATE;
    @JsonProperty("RESPPER")
    @Excel(name = "企业负责人")
    private String RESPPER;
    @JsonProperty("RESPPHONE")
    @Excel(name = "负责人手机")
    private String RESPPHONE;
    @JsonProperty("RESPTEL")
    @Excel(name = "负责人电话")
    private String RESPTEL;
    @JsonProperty("MANUFACTURER")
    @Excel(name = "生产厂家")
    private String MANUFACTURER;
    @JsonProperty("DISTRICTCODE")
    @Excel(name = "行政区划")
    private String DISTRICTCODE;
    @JsonProperty("ATTACHID")
    @Excel(name = "附件编号")
    private String ATTACHID;
    @JsonProperty("DELEFLAG")
    @Excel(name = "删除标识")
    private String DELEFLAG;
    @JsonProperty("CREATEORGCODE")
    @Excel(name = "创建单位")
    private String CREATEORGCODE;
    @JsonProperty("CREATETIME")
    @Excel(name = "创建时间")
    private String CREATETIME;
    @JsonProperty("USERID")
    @Excel(name = "录入人")
    private String USERID;
    @JsonProperty("PARENTORGCODE")
    @Excel(name = "上级单位")
    private String PARENTORGCODE;
    @JsonProperty("UPDATETIME")
    @Excel(name = "最近更新时间")
    private String UPDATETIME;
    @JsonProperty("UNITCODE")
    @Excel(name = "计量单位")
    private String UNITCODE;
    @JsonProperty("ISIMPORTANT")
    @Excel(name = "是否是重要物资")
    private String ISIMPORTANT;
    @JsonProperty("ORDERNUMBER")
    @Excel(name = "物质序号")
    private String ORDERNUMBER;

}
