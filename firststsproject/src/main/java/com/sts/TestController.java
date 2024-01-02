package com.sts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@RequestMapping ("/test")
	
	@ResponseBody
	public String handleTest()
	{
		return "this is project using sts ye phele bar kaaam kr rhe hai ";
	}

}
