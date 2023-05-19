package com.example.study.entity.fiveInOneReport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author littlefool
 * @ClassName EnterpriseAreaPersonDataB_2
 * @description 企业区域人员情况上报dataB（regionType=3时）
 * @date 2023年05月11日
 */
@Data
@NoArgsConstructor
public class EnterpriseAreaPersonDataB_2 {

    @JsonProperty("sstId")
    private String sstId;

    @JsonProperty("sstqymc")
    private String sstqymc;

    @JsonProperty("sstqyrs")
    private String sstqyrs;

    @JsonProperty("sstfxdj")
    private String sstfxdj;

    @JsonProperty("dataC")
    private List<EnterpriseAreaPersonDataC> dataC;
}
