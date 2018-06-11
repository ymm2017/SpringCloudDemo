package com.ym.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

	@Autowired
	private RestTemplate template;
	
	@RequestMapping("/hello")
	public String sayHello() {
		return template.getForObject("http://YM/name", String.class);
	}
}
