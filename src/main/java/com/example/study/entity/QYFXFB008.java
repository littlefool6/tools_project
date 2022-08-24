package com.example.study.entity;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName QYFXFB008
 * @Description 企业安全风险分布信息表  topic：QYFXFB008
 * @Author zlguo
 * @Date 2022/7/28
 **/
@Data
@NoArgsConstructor
public class QYFXFB008 {

    @JsonProperty("ID")
    @Excel(name = "安全风险空间分布图ID")
    private String ID;

    @JsonProperty("IMG")
    @Excel(name = "安全风险空间分布图", cellType = Excel.ColumnType.IMAGE)
    private String IMG;

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
