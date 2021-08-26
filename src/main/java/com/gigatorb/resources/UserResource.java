package com.gigatorb.resources;
import  com.gigatorb.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class UserResource {
    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;
    private static final String TOPIC="Kafka_Example";

    @GetMapping("/publish")
   private String post( @RequestBody  User user){
        kafkaTemplate.send(TOPIC,user);
        return "Success";
    }
}
