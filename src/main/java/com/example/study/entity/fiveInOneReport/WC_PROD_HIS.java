package com.example.study.entity.fiveInOneReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName WC_PROD_HIS
 * @Description 设备停用历史信息表
 * @Author zlguo
 * @Date 2022/11/8
 **/
@Data
@NoArgsConstructor
public class WC_PROD_HIS {

    @JsonProperty("STOP_ID")
    @Excel(name = "停用标识")
    private String STOP_ID;

    @JsonProperty("PROD_TYPE")
    @Excel(name = "生产单元类型")
    private String PROD_TYPE;

    @JsonProperty("EQUIP_CODE")
    @Excel(name = "生产单元编码")
    private String EQUIP_CODE;

    @JsonProperty("IS_STOP")
    @Excel(name = "是否停用")
    private String IS_STOP;

    @JsonProperty("STOP_REMARK")
    @Excel(name = "停用说明")
    private String STOP_REMARK;

    @JsonProperty("STOP_PSN")
    @Excel(name = "停用人")
    private String STOP_PSN;

    @JsonProperty("STOP_TIME")
    @Excel(name = "停用时间")
    private String STOP_TIME;

    @JsonProperty("START_REMARK")
    @Excel(name = "恢复说明")
    private String START_REMARK;

    @JsonProperty("START_PSN")
    @Excel(name = "恢复人")
    private String START_PSN;

    @JsonProperty("START_TIME")
    @Excel(name = "恢复时间")
    private String START_TIME;

    @JsonProperty("CREATOR")
    @Excel(name = "创建人")
    private String CREATOR;

    @JsonProperty("CREATE_TIME")
    @Excel(name = "创建日期")
    private String CREATE_TIME;

}
