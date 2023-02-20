package com.learnbyheart.rocketmqtest1.producer;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.messaging.core.AbstractDestinationResolvingMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Producer {
    @Autowired
    private RocketMQTemplate rocketMQTemplate;


    @RequestMapping("/sendMsg")
    public void send() throws MQBrokerException, RemotingException, InterruptedException, MQClientException {
        //这里要指定producerGroup
//        DefaultMQProducer producer = new DefaultMQProducer("p-group");
//        producer.setNamesrvAddr("127.0.0.1:9876");
//        producer.setSendMsgTimeout(60000);
//        producer.start();
//        Message msg = new Message("topic1", "hello mq ".getBytes());
//        SendResult sendResult = producer.send(msg);
//        System.out.printf("%s%n", sendResult);
//        // 关闭生产者
//        producer.shutdown();

        // 用RocketMqTemplate会报错没有producer 手动创建就没事>_<
        rocketMQTemplate.convertAndSend("topic1","hello mq");
        System.out.println("发送成功");
    }
}
