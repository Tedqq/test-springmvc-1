package com.atguigu.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
	
	/**
	 * 使用@@RequestMapping 來對應請求的url 
	 * @return
	 */
	@RequestMapping("/helloworld")
	public String hello() {
		System.out.println("Hello world");
		return "success";
	}
}
