package com.example.study.entity;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName AQFXSJ003
 * @Description 安全风险事件表  topic：AQFXSJ003
 * @Author zlguo
 * @Date 2022/7/28
 **/
@Data
@NoArgsConstructor
public class AQFXSJ003 {

    @JsonProperty("RISKEVENT_ID")
    @Excel(name = "风险事件ID")
    private String RISKEVENT_ID;

    @JsonProperty("RISK_UNIT_ID")
    @Excel(name = "所属风险单元ID")
    private String RISK_UNIT_ID;

    @JsonProperty("RISK_EVENT_NAME")
    @Excel(name = "风险事件名称")
    private String RISK_EVENT_NAME;

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
