package com.example.study.entity.fiveInOneReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName WC_ENT_PR_PXTRAIN
 * @Description 人员培训
 * @Author zlguo
 * @Date 2022/11/10
 **/
@Data
@NoArgsConstructor
public class WC_ENT_PR_PXTRAIN {

    @JsonProperty("TYSHXYDM")
    @Excel(name = "统一社会信用代码")
    private String TYSHXYDM;
    @JsonProperty("PXID")
    @Excel(name = "培训ID")
    private String PXID;
    @JsonProperty("PXLB")
    @Excel(name = "培训类别")
    private String PXLB;
    @JsonProperty("PXXS")
    @Excel(name = "培训学时")
    private String PXXS;
    @JsonProperty("PXRQ")
    @Excel(name = "培训日期")
    private String PXRQ;
    @JsonProperty("PXDW")
    @Excel(name = "培训单位")
    private String PXDW;
    @JsonProperty("PXJS")
    @Excel(name = "培训讲师")
    private String PXJS;
    @JsonProperty("PXJJ")
    @Excel(name = "培训简介")
    private String PXJJ;
    @JsonProperty("CJRS")
    @Excel(name = "参加人数")
    private String CJRS;
    @JsonProperty("JGFS")
    @Excel(name = "及格分数")
    private String JGFS;
    @JsonProperty("PXDD")
    @Excel(name = "培训地点")
    private String PXDD;
    @JsonProperty("KHDW")
    @Excel(name = "考核单位")
    private String KHDW;
    @JsonProperty("PXFY")
    @Excel(name = "培训费用")
    private String PXFY;
    @JsonProperty("ZSMC")
    @Excel(name = "证书名称")
    private String ZSMC;
    @JsonProperty("ZSBH")
    @Excel(name = "证书编号")
    private String ZSBH;
    @JsonProperty("QZRQ")
    @Excel(name = "取证日期")
    private String QZRQ;
    @JsonProperty("DQRQ")
    @Excel(name = "到期日期")
    private String DQRQ;
    @JsonProperty("PXYXQ")
    @Excel(name = "培训有效期")
    private String PXYXQ;
    @JsonProperty("PXRXM")
    @Excel(name = "培训人姓名")
    private String PXRXM;
    @JsonProperty("PXCJ")
    @Excel(name = "培训成绩")
    private String PXCJ;
    @JsonProperty("PXJG")
    @Excel(name = "培训结果")
    private String PXJG;
    @JsonProperty("PXTJ")
    @Excel(name = "培训途径")
    private String PXTJ;
    @JsonProperty("CJSJ")
    @Excel(name = "创建时间")
    private String CJSJ;
    @JsonProperty("GXSJ")
    @Excel(name = "更新时间")
    private String GXSJ;

}
