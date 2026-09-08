package com.example.orderMicroservice.Kafkademo.Configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
public class Confuguration {

    @Bean
    public NewTopic orderCreatedTopic(){
        return TopicBuilder.name("Order_CreatedEvent")
                .partitions(2)
                .replicas(1)
                .config("min-inSyncReplicas", "2")
                .build();
    }
}
