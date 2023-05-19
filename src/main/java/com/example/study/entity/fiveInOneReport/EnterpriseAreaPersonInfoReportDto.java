package com.example.study.entity.fiveInOneReport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author littlefool
 * @ClassName EnterpriseAreaPersonInfoReportDto
 * @description 企业区域人员情况上报实体类
 * @date 2023年05月11日
 */
@Data
@NoArgsConstructor
public class EnterpriseAreaPersonInfoReportDto {

    @JsonProperty("dataId")
    private String dataId;

    @JsonProperty("enterpriseId")
    private String enterpriseId;

    @JsonProperty("collectTime")
    private String collectTime;

    @JsonProperty("companyPersonNum")
    private String companyPersonNum;

    @JsonProperty("dataA")
    private List<EnterpriseAreaPersonDataA> dataA;
}
