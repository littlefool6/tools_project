package com.example.study.entity.fiveInOneReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName WC_ENT_PR_YHZGTZ
 * @Description 整改通知单
 * @Author zlguo
 * @Date 2022/11/10
 **/
@Data
@NoArgsConstructor
public class WC_ENT_PR_YHZGTZ {

    @JsonProperty("TYSHXYDM")
    @Excel(name = "统一社会信用代码")
    private String TYSHXYDM;

    @JsonProperty("ZGDID")
    @Excel(name = "整改单ID")
    private String ZGDID;

    @JsonProperty("JCDID")
    @Excel(name = "检查单ID")
    private String JCDID;

    @JsonProperty("ZGBT")
    @Excel(name = "整改标题")
    private String ZGBT;

    @JsonProperty("ZGDBH")
    @Excel(name = "整改单编号")
    private String ZGDBH;

    @JsonProperty("ZGLY")
    @Excel(name = "整改来源")
    private String ZGLY;

    @JsonProperty("ZGDX")
    @Excel(name = "整改对象")
    private String ZGDX;

    @JsonProperty("BHGYS")
    @Excel(name = "不合格因素")
    private String BHGYS;

    @JsonProperty("YHDJ")
    @Excel(name = "隐患等级")
    private String YHDJ;

    @JsonProperty("ZYFL")
    @Excel(name = "专业分类")
    private String ZYFL;

    @JsonProperty("ZRBM")
    @Excel(name = "责任部门")
    private String ZRBM;

    @JsonProperty("YHWZ")
    @Excel(name = "隐患位置")
    private String YHWZ;

    @JsonProperty("WZFXR")
    @Excel(name = "位置发现人")
    private String WZFXR;

    @JsonProperty("JCLYFL")
    @Excel(name = "检查来源分类")
    private String JCLYFL;

    @JsonProperty("RWGLFL")
    @Excel(name = "人物管理分类")
    private String RWGLFL;

    @JsonProperty("FSHJ")
    @Excel(name = "发生环节")
    private String FSHJ;

    @JsonProperty("XGFJ")
    @Excel(name = "相关附件")
    private String XGFJ;

    @JsonProperty("YQZGWCRQ")
    @Excel(name = "要求整改完成日期")
    private String YQZGWCRQ;

    @JsonProperty("FQR")
    @Excel(name = "发起人")
    private String FQR;

    @JsonProperty("FQBM")
    @Excel(name = "发起部门")
    private String FQBM;

    @JsonProperty("FCRQ")
    @Excel(name = "发出日期")
    private String FCRQ;

    @JsonProperty("ZDYHFLBMCODE")
    @Excel(name = "重大隐患分类编码code")
    private String ZDYHFLBMCODE;

    @JsonProperty("YHLXFL")
    @Excel(name = "隐患类型分类")
    private String YHLXFL;

    @JsonProperty("YHZT")
    @Excel(name = "隐患状态")
    private String YHZT;

    @JsonProperty("ZGYJ")
    @Excel(name = "整改意见")
    private String ZGYJ;

    @JsonProperty("ZGQX")
    @Excel(name = "整改期限")
    private String ZGQX;

    @JsonProperty("TBR")
    @Excel(name = "填报人")
    private String TBR;

    @JsonProperty("TBRQ")
    @Excel(name = "填报日期")
    private String TBRQ;

    @JsonProperty("SFCFZG")
    @Excel(name = "是否重复整改")
    private String SFCFZG;

    @JsonProperty("CFZGDBH")
    @Excel(name = "重复整改单编号")
    private String CFZGDBH;

    @JsonProperty("ZGQK")
    @Excel(name = "整改情况")
    private String ZGQK;

    @JsonProperty("YYFX")
    @Excel(name = "原因分析")
    private String YYFX;

    @JsonProperty("ZGWCRQ")
    @Excel(name = "整改完成日期")
    private String ZGWCRQ;

    @JsonProperty("ZLZJ")
    @Excel(name = "治理资金")
    private String ZLZJ;

    @JsonProperty("XGFJ_1")
    @Excel(name = "相关附件")
    private String XGFJ_1;

    @JsonProperty("ZGR")
    @Excel(name = "整改人")
    private String ZGR;

    @JsonProperty("TBRQ_1")
    @Excel(name = "填报日期")
    private String TBRQ_1;

    @JsonProperty("YZQK")
    @Excel(name = "验证情况")
    private String YZQK;

    @JsonProperty("XGFJ_2")
    @Excel(name = "相关附件")
    private String XGFJ_2;

    @JsonProperty("YZR")
    @Excel(name = "验证人")
    private String YZR;

    @JsonProperty("YZRQ")
    @Excel(name = "验证日期")
    private String YZRQ;

    @JsonProperty("ZRBMLDYJ")
    @Excel(name = "责任部门领导意见")
    private String ZRBMLDYJ;

    @JsonProperty("YZRYJ")
    @Excel(name = "验证人意见")
    private String YZRYJ;

    @JsonProperty("TBRYJ")
    @Excel(name = "填报人意见")
    private String TBRYJ;

    @JsonProperty("ZGTXSM")
    @Excel(name = "整改填写说明")
    private String ZGTXSM;

    @JsonProperty("CJSJ")
    @Excel(name = "创建时间")
    private String CJSJ;

    @JsonProperty("GXSJ")
    @Excel(name = "更新时间")
    private String GXSJ;

}
