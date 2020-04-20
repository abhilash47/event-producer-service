package com.gajarla.event.producer.app.controller;

import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/app/publish/{str}")
	@SendTo(Source.OUTPUT)
	public String publishString(@PathVariable("str") String s) {
		
		return s + ":  Publish Successful";
	}
}
