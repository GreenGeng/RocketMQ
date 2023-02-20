package com.learnbyheart.rocketmqtest1.config;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@EnableAutoConfiguration
//@Configuration
public class Config {

    @Bean
    public RocketMQTemplate rocketMQTemplate(){
        return new RocketMQTemplate();
    }
}
