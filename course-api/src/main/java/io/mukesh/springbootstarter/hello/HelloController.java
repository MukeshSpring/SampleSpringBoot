package io.mukesh.springbootstarter.hello;

import java.lang.reflect.Method;

import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/{hello}")
	public String sayHello()
	{
		return "Hi";
	}

}
