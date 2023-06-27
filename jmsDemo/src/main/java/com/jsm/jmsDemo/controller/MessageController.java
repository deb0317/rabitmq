package com.jsm.jmsDemo.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("/message/{content}")
    public String sendMessage(@PathVariable String content) {
        rabbitTemplate.convertAndSend(content);
        return "Message sent: " + content;
    }
}

