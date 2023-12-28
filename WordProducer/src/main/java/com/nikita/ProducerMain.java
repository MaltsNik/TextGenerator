package com.nikita;

import com.nikita.config.ConfigFeign;
import com.nikita.config.ConfigKafka;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableConfigurationProperties(ConfigKafka.class)
@EnableConfigurationProperties(ConfigFeign.class)
@EnableScheduling
public class ProducerMain {
    public static void main(String[] args) {
        SpringApplication.run(ProducerMain.class,args);
    }
}