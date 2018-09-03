package com.atguigu.springmvc.handlers;

import java.io.Reader;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/springmvc")
public class SpringMVCTest {
	
	private static final String SUCCESS="success";
	

	@RequestMapping("/testPathVariable/{id}")  
	public String testPathVariable(@PathVariable("id") Integer id) {
		
		System.out.println("testPathvariable"+id);
		return SUCCESS;
	}
	
	@RequestMapping("/testAntPatch/*/abc")  
	public String testAntPatch() {
		System.out.println("testAntPatch");
		return SUCCESS;
	}
	
	/**
	 * 
	 * 了解:可以使用params, headers 來精確的映射請求，params , headers 設定
	 * @return
	 */
	@RequestMapping(value="/testParamsAndHeaders",params= {"username","age!=10"}, headers= {"Accept-Language=zh-TW,zh;q=0.9,en-US;q=0.8,en;q=0.7"})  
	public String testParamsAndHeaders() {
		System.out.println("testParamsAndHeaders");
		return SUCCESS;
	}
	
	@RequestMapping(value="/testMethod",method=RequestMethod.POST)
	public String testMethod() {
		System.out.println("testMethod");
		return SUCCESS;
	}
	
	@RequestMapping("/testRequestMapping")
	public String testRequestMapping() {
		System.out.println("testRequestMapping");
		return SUCCESS;
	}
}
