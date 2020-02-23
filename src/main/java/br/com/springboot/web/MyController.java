package br.com.springboot.web;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@ResponseBody
	public String hello() {
		return "hello";
	}

	@RequestMapping(value = "/parameter", method = RequestMethod.GET)
	@ResponseBody
	public String parameterRequest(@RequestParam String param) {
		return param;
	}

	@RequestMapping(value = "/body", method = RequestMethod.POST)
	@ResponseBody
	public String body(@RequestBody String body) {
		return body;
	}

	@RequestMapping(value = "/responseJson", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public MyPojo responseJson() {
		MyPojo myPojo = new MyPojo();
		myPojo.setNome("Donald Trump");
		myPojo.setEndereco("United States");
		return myPojo;
	}

}
