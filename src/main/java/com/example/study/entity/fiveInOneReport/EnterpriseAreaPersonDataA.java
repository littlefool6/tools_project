package com.example.study.entity.fiveInOneReport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author littlefool
 * @ClassName EnterpriseAreaPersonDataA
 * @description 企业区域人员情况上报dataA
 * @date 2023年05月11日
 */
@Data
@NoArgsConstructor
public class EnterpriseAreaPersonDataA {

    @JsonProperty("regionName")
    private String regionName;

    @JsonProperty("regionType")
    private String regionType;

    @JsonProperty("regionPersonNum")
    private String regionPersonNum;

    @JsonProperty("dataB")
    private List<EnterpriseAreaPersonDataB_1> dataB_1;

    @JsonProperty("dataB")
    private List<EnterpriseAreaPersonDataB_2> dataB_2;
}
