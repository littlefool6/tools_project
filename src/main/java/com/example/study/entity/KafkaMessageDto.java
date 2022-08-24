package com.example.study.entity;

import lombok.Data;

@Data
public class KafkaMessageDto {

    private static final long serialVersionUID = 1L;

    private String topic;

    private String message;
}
