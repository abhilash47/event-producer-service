package com.gajarla.event.producer.app;

import javax.xml.transform.Source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(Source.class)
public class EventProducerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventProducerServiceApplication.class, args);
	}

}
