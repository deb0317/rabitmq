package com.jsm.jmsDemo.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumerRmq {

    @RabbitListener(queues = "myQueue")
    public void handleMessage(String message) {
        System.out.println("Received message: " + message);
    }
}

