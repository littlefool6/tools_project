package com.example.study.entity.fiveInOneReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName WC_ENT_SBJZ
 * @Description 设备介质基础信息表
 * @Author zlguo
 * @Date 2022/11/8
 **/
@Data
@NoArgsConstructor
public class WC_ENT_SBJZ {

    @JsonProperty("ID")
    @Excel(name = "编号")
    private String ID;

    @JsonProperty("EQUIP_CODE")
    @Excel(name = "设备编码")
    private String EQUIP_CODE;

    @JsonProperty("EQUIP_TYPE")
    @Excel(name = "设备类型")
    private String EQUIP_TYPE;

    @JsonProperty("MEDIUM")
    @Excel(name = "存储介质")
    private String MEDIUM;

    @JsonProperty("CAS")
    @Excel(name = "CAS号")
    private String CAS;

    @JsonProperty("MEDIUM_STATUS")
    @Excel(name = "介质形态")
    private String MEDIUM_STATUS;

    @JsonProperty("RESERVES")
    @Excel(name = "设计储量")
    private String RESERVES;

    @JsonProperty("IS_ACTIVE")
    @Excel(name = "是否有效")
    private String START_REMARK;

    @JsonProperty("CREATOR")
    @Excel(name = "创建人")
    private String CREATOR;

    @JsonProperty("CREATE_TIME")
    @Excel(name = "创建日期")
    private String CREATE_TIME;

    @JsonProperty("UPDATOR")
    @Excel(name = "修改人")
    private String UPDATOR;

    @JsonProperty("UPDATE_TIME")
    @Excel(name = "修改日期")
    private String UPDATE_TIME;

}
