package com.learnbyheart.rocketmqtest1;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RocketMqTest1Application {

    public static void main(String[] args) {
        SpringApplication.run(RocketMqTest1Application.class, args);
    }

    @Bean
    public RocketMQTemplate rocketMQTemplate(){
        return new RocketMQTemplate();
    }

}
