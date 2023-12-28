package com.nikita.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "spring.kafka")
public class ConfigKafka {
    @Value("${spring.sendTypeKafka}")
    private String kafkaProperties;
}