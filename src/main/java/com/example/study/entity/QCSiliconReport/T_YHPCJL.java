package com.example.study.entity.QCSiliconReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName T_YHPCJL
 * @Description 隐患排查记录表   t_yhpcjl
 * @Author zlguo
 * @Date 2022/11/22
 **/
@Data
@NoArgsConstructor
public class T_YHPCJL {

    @JsonProperty("ID")
    @Excel(name = "主键")
    private String ID;

    @JsonProperty("RECORD_ID")
    @Excel(name = "排查记录ID")
    private String RECORD_ID;

    @JsonProperty("CHECK_TASK_ID")
    @Excel(name = "隐患排查任务ID")
    private String CHECK_TASK_ID;

    @JsonProperty("CHECK_TIME")
    @Excel(name = "排查时间")
    private String CHECK_TIME;

    @JsonProperty("CHECK_STATUS")
    @Excel(name = "排查结果")
    private String CHECK_STATUS;

    @JsonProperty("CREATE_BY_MOBILE")
    @Excel(name = "创建人手机号")
    private String CREATE_BY_MOBILE;

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

    @JsonProperty("UPDATE_BY_MOBILE")
    @Excel(name = "最后修改人手机号")
    private String UPDATE_BY_MOBILE;

    @JsonProperty("DELETE_MARK")
    @Excel(name = "删除标志")
    private String DELETE_MARK;

    @JsonProperty("COMPANY_CODE")
    @Excel(name = "企业编码")
    private String COMPANY_CODE;

}
