package br.com.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyController {

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}

}
