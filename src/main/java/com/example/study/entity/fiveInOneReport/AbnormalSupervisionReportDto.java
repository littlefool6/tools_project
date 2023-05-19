package com.example.study.entity.fiveInOneReport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author littlefool
 * @ClassName AbnormalSupervisionReportDto
 * @description 异常督办上报实体类
 * @date 2023年05月11日
 */
@Data
@NoArgsConstructor
public class AbnormalSupervisionReportDto {

    @JsonProperty("id")
    private String id;
    @JsonProperty("supervise_time")
    private String supervise_time;
    @JsonProperty("supervise_item")
    private String supervise_item;
    @JsonProperty("feedback")
    private String feedback;
    @JsonProperty("feedback_time")
    private String feedback_time;
    @JsonProperty("case_desc")
    private String case_desc;
    @JsonProperty("create_time")
    private String create_time;
    @JsonProperty("create_by")
    private String create_by;
    @JsonProperty("update_time")
    private String update_time;
    @JsonProperty("update_by")
    private String update_by;
    @JsonProperty("delete_mark")
    private String delete_mark;
    @JsonProperty("company_code")
    private String company_code;

}
