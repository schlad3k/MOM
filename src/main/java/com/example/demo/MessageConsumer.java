package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

@Component
public class MessageConsumer {

    @KafkaListener(topics = "quickstart-events")
    public void processMessage(String content) {
        System.out.println( "Read from Message Queue: " + content);
    }

}