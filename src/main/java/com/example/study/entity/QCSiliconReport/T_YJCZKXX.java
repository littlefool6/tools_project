package com.example.study.entity.QCSiliconReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName T_YJCZKXX
 * @Description 应急处置卡信息表   t_yjczkxx
 * @Author zlguo
 * @Date 2022/11/22
 **/
@Data
@NoArgsConstructor
public class T_YJCZKXX {

    @JsonProperty("ID")
    @Excel(name = "应急卡ID")
    private String ID;

    @JsonProperty("YJKMC")
    @Excel(name = "应急卡名称")
    private String YJKMC;

    @JsonProperty("GLGWMC")
    @Excel(name = "关联岗位名称")
    private String GLGWMC;

    @JsonProperty("CZKBH")
    @Excel(name = "处置卡编号")
    private String CZKBH;

    @JsonProperty("SGFX")
    @Excel(name = "事故风险")
    private String SGFX;

    @JsonProperty("FSCS")
    @Excel(name = "发生场所")
    private String FSCS;

    @JsonProperty("GYSM")
    @Excel(name = "工艺说明")
    private String GYSM;

    @JsonProperty("SGTZ")
    @Excel(name = "事故特征")
    private String SGTZ;

    @JsonProperty("WHMS")
    @Excel(name = "危害描述")
    private String WHMS;

    @JsonProperty("BZSM")
    @Excel(name = "步骤说明")
    private String BZSM;

    @JsonProperty("CZCS")
    @Excel(name = "处置措施")
    private String CZCS;

    @JsonProperty("ZYZRR")
    @Excel(name = "主要责任人")
    private String ZYZRR;

    @JsonProperty("ZYSX")
    @Excel(name = "注意事项")
    private String ZYSX;

    @JsonProperty("NBYJDH")
    @Excel(name = "内部应急电话")
    private String NBYJDH;

    @JsonProperty("WBYJDH")
    @Excel(name = "外部应急电话")
    private String WBYJDH;

    @JsonProperty("FJ")
    @Excel(name = "应急处置卡相关图片", cellType = Excel.ColumnType.IMAGE)
    private String FJ;

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

}
