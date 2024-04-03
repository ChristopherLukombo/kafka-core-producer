package com.course.kafka.config;

import java.time.Duration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.benmanes.caffeine.cache.*;


@Configuration
public class CacheConfig {

	@Bean(name = "cachePurchaseRequest")
	public Cache<Integer, Boolean> cachePurchaseRequest() {
		return Caffeine.newBuilder().expireAfterWrite(Duration.ofMinutes(2)).maximumSize(1000).build();
	}
}
