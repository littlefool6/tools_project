package com.example.study.entity.QCSiliconReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName T_ZYCSWXYSHWPWXWHTXYZKXX
 * @Description 作业场所（工作岗位）危险（有害）因素和物品危险（有害）危害特性应知卡信息表  t_zycswxyshwpwxwhtxyzkxx
 * @Author zlguo
 * @Date 2022/11/22
 **/
@Data
@NoArgsConstructor
public class T_ZYCSWXYSHWPWXWHTXYZKXX {

    @JsonProperty("ID")
    @Excel(name = "应知卡ID")
    private String ID;

    @JsonProperty("GWMC")
    @Excel(name = "岗位名称")
    private String GWMC;

    @JsonProperty("ZYWXYHYS")
    @Excel(name = "主要危险有害因素")
    private String ZYWXYHYS;

    @JsonProperty("YDZSGFX")
    @Excel(name = "易导致事故风险")
    private String YDZSGFX;

    @JsonProperty("FXDJ")
    @Excel(name = "风险等级")
    private String FXDJ;

    @JsonProperty("FXGKCS")
    @Excel(name = "风险管控措施")
    private String FXGKCS;

    @JsonProperty("YJCSDC")
    @Excel(name = "应急处置对策")
    private String YJCSDC;

    @JsonProperty("AQJSBS")
    @Excel(name = "安全警示标示")
    private String AQJSBS;

    @JsonProperty("FJ")
    @Excel(name = "应知卡相关图片", cellType = Excel.ColumnType.IMAGE)
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
    private Integer DELETE_MARK;

    @JsonProperty("COMPANY_CODE")
    @Excel(name = "企业编码")
    private Integer COMPANY_CODE;

}
