package com.example.study.entity;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName JCBWHXX007
 * @Description 检查表维护信息表   topic：JCBWHXX007
 * @Author zlguo
 * @Date 2022/7/28
 **/
@Data
@NoArgsConstructor
public class JCBWHXX007 {

    @JsonProperty("ID")
    @Excel(name = "安全检查项ID")
    private String ID;

    @JsonProperty("JCLX")
    @Excel(name = "检查类型")
    private String JCLX;

    @JsonProperty("JCXM")
    @Excel(name = "检查项目")
    private String JCXM;

    @JsonProperty("JCFS")
    @Excel(name = "检查方式")
    private String JCFS;

    @JsonProperty("JCNR")
    @Excel(name = "检查内容")
    private String JCNR;

    @JsonProperty("JCYJ")
    @Excel(name = "检查依据")
    private String JCYJ;

    @JsonProperty("BZ")
    @Excel(name = "备注")
    private String BZ;

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
