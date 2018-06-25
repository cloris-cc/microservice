package org.cloris;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloServiceController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "你好-8081";
	}
	
}
