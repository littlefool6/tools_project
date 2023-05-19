package com.example.study.entity.fiveInOneReport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author littlefool
 * @ClassName EnterpriseAreaPersonDataB_1
 * @description 企业区域人员情况上报dataB（regionType=1或2时）
 * @date 2023年05月11日
 */
@Data
@NoArgsConstructor
public class EnterpriseAreaPersonDataB_1 {

    @JsonProperty("zjhm1")
    private String zjhm1;

    @JsonProperty("ryxm1")
    private String ryxm1;

    @JsonProperty("ssdw1")
    private String ssdw1;
}
