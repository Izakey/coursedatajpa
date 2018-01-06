package io.isaac.springbootstarter.courses;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/greeting")
	public String sayHi(){
		return "Hi Isaac. How are you doing ?";
	}

}
