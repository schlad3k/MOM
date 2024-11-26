package com.example.demo;

import com.example.demo.model.ElectionData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Component
public class MessageProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @GetMapping("/send")
    public ElectionData sendMessage() {
        RestTemplate rt= restTemplateBuilder.build();
        ElectionData ed = rt.getForObject("http://localhost:6969/election/001/data", ElectionData.class);
        System.out.println("Test");
        kafkaTemplate.send("quickstart-events", ed.toString());
        return ed;
    }

}