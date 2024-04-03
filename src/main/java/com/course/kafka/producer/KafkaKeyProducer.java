package com.course.kafka.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;


import java.util.concurrent.atomic.*;

@Service
public class KafkaKeyProducer {
	
	private final Logger log = LoggerFactory.getLogger(KafkaKeyProducer.class);

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	private AtomicInteger counter = new AtomicInteger();
	
	public void send(String key, String value) {
		kafkaTemplate.send("t-multi-partitions", key, value);
	}
}
