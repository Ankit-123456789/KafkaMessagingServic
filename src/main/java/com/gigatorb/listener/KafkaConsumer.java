package com.gigatorb.listener;

import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
@EnableKafka
@Service
public class KafkaConsumer {
@KafkaListener(topics = "Kafka_Example",groupId = "group_id")
    public void consume(String message){
    System.out.println("Consumed message "+message);
}

}
