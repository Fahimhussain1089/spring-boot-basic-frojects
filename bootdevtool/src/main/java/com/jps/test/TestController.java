package com.jps.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		int a =10;
		int b =10;
		int c =10;
		return "this is test1 /t sum of a and b c is =" +(a+b+c);
		
	}

}
