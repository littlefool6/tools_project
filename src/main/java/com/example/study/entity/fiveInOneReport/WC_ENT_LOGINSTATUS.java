package com.example.study.entity.fiveInOneReport;

import com.example.study.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName WC_ENT_LOGINSTATUS
 * @Description 登录情况
 * @Author zlguo
 * @Date 2022/11/23
 **/
@Data
@NoArgsConstructor
public class WC_ENT_LOGINSTATUS {

    @JsonProperty("TYSHXYDM")
    @Excel(name = "统一社会信用代码")
    private String TYSHXYDM;

    @JsonProperty("DLQKID")
    @Excel(name = "登录情况ID")
    private String DLQKID;

    @JsonProperty("ZYFZRDLQK")
    @Excel(name = "企业主要负责人是否登录")
    private String ZYFZRDLQK;

    @JsonProperty("AQFZRDLQK")
    @Excel(name = "安全负责人是否登录")
    private String AQFZRDLQK;

    @JsonProperty("CJFZRDLQK")
    @Excel(name = "车间负责人是否登录")
    private String CJFZRDLQK;

    @JsonProperty("DLYHS")
    @Excel(name = "当天登录用户数")
    private String DLYHS;

    @JsonProperty("ZYHS")
    @Excel(name = "总用户数")
    private String ZYHS;

    @JsonProperty("DLSJ")
    @Excel(name = "登录时间")
    private String DLSJ;

    @JsonProperty("CJSJ")
    @Excel(name = "创建时间")
    private String CJSJ;

    @JsonProperty("GXSJ")
    @Excel(name = "更新时间")
    private String GXSJ;

}
