package com.overhaul.domain.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * Created by erikdreyer on 3/9/17.
 */
@Service
public class KafkaGpsMessageListener {

    @KafkaListener(topics = "gps")
    public void listen(String data) {

        System.out.println(data);

    }
}
