package com.example.study.entity.fiveInOneReport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author littlefool
 * @ClassName EnterpriseAreaPersonDataC
 * @description 企业区域人员情况上报dataC
 * @date 2023年05月11日
 */
@Data
@NoArgsConstructor
public class EnterpriseAreaPersonDataC {

    @JsonProperty("zjhm")
    private String zjhm;

    @JsonProperty("ryxm")
    private String ryxm;

    @JsonProperty("ssdw")
    private String ssdw;
}
