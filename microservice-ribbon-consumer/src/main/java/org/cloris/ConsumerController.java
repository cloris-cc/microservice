package org.cloris;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
	
	@Autowired
	HelloService helloService;
	
	@GetMapping("/hello")
	public String helloConsumer() {
		return helloService.helloService();
	}
	
}
