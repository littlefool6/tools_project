package com.example.study.entity.QCSiliconReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName T_AQSCZRCLKXX
 * @Description 安全生产责任承诺卡信息表  t_aqsczrclkxx
 * @Author zlguo
 * @Date 2022/11/22
**/
@Data
@NoArgsConstructor
public class T_AQSCZRCLKXX {

    @JsonProperty(value = "ID")
    @Excel(name = "承诺卡ID")
    private String ID;

    @JsonProperty(value = "CNR")
    @Excel(name = "承诺人")
    private String CNR;

    @JsonProperty(value = "ZGLD")
    @Excel(name = "主管领导")
    private String ZGLD;

    @JsonProperty(value = "GWMC")
    @Excel(name = "岗位名称")
    private String GWMC;

    @JsonProperty(value = "CNSX")
    @Excel(name = "承诺事项")
    private String CNSX;

    @JsonProperty(value = "CNRQ")
    @Excel(name = "承诺日期")
    private String CNRQ;

    @JsonProperty(value = "FJ")
    @Excel(name = "承诺卡相关图片", cellType = Excel.ColumnType.IMAGE)
    private String FJ;

    @JsonProperty(value = "CREATE_TIME")
    @Excel(name = "创建时间")
    private String CREATE_TIME;

    @JsonProperty(value = "CREATE_BY")
    @Excel(name = "创建人")
    private String CREATE_BY;

    @JsonProperty(value = "UPDATE_TIME")
    @Excel(name = "最后修改时间")
    private String UPDATE_TIME;

    @JsonProperty(value = "UPDATE_BY")
    @Excel(name = "最后修改人")
    private String UPDATE_BY;

    @JsonProperty(value = "DELETE_MARK")
    @Excel(name = "删除标志")
    private String DELETE_MARK;

    @JsonProperty(value = "COMPANY_CODE")
    @Excel(name = "企业编码")
    private String COMPANY_CODE;

}
