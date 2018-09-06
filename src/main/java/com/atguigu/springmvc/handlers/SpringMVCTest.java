package com.atguigu.springmvc.handlers;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ted.springmvc.entities.User;

//@SessionAttributes(value={"user"} , types= {String.class})
@Controller
@RequestMapping("/springmvc")
public class SpringMVCTest {
	
	private static final String SUCCESS="success";
	
	
	@ModelAttribute
	public void getUser(@RequestParam(value="id",required=false)Integer id , Map<String,Object> map) {
		if(id != null) {
			User user = new User(id.toString(),"Ted", "sssddd", "ted_tzeng@settour.com.tw", "30");
			System.out.println("從db中抓一個user" + user);
			map.put("user", user);
		}
	}
	
	@RequestMapping(value="/testModelAttribute") 
	public String testModelAttribute(User user) {
		System.out.println("修改"+user);
		return SUCCESS;
	}
	
	
	@RequestMapping(value="/testSessionAttributes") 
	public String testSessionAttributes(Map<String,Object> map) {
		User user = new User("1","ted", "sssddd", "timetime1979@gmail.com", "30");
		map.put("user", user);
		map.put("school", "settour");
		return SUCCESS;
	}
	
	@RequestMapping(value="/testMap")
	public String testMap(Map<String,Object> map) {
		System.out.println(map.getClass().getName());
		map.put("names",Arrays.asList("Ted","yichen",""));
		return SUCCESS;
	}
	
	
	@RequestMapping(value="/testModelAndView")
	public ModelAndView testModelAndView() { 
		String viewName = SUCCESS;
		ModelAndView modelAndView = new ModelAndView(viewName);
		modelAndView.addObject("time",new Date());
		return modelAndView;
	}
	
	@RequestMapping(value="/testServletApi")
	public void testServletApi(HttpServletRequest request, HttpServletResponse response, Writer out ) throws IOException { 
		System.out.println("testServletApi , " + request + " , " + response);
		out.write("Hello Spring mvc");
		//return SUCCESS;
	}
	
	@RequestMapping(value="/testPojo")
	public String testPojo(User user) { 
		System.out.println("testPojo" + user);
		return SUCCESS;
	}
	
	@RequestMapping(value="/testCookieValue")
	public String testCookieValue(@CookieValue("JSESSIONID") String jsessionId) { 
		System.out.println("testCookieValue" + jsessionId);
		return SUCCESS;
	}
	
	@RequestMapping(value="/testRequestHeader")
	public String testRequestHeader(@RequestHeader(value="Accept-Language") String a1) {
		System.out.println(a1);
		System.out.println("testRequestHeader");
		return SUCCESS;
	}
	
	
	@RequestMapping(value="/testRequestParam")
	public String testRequestParam(@RequestParam(value="username") String username 
			, @RequestParam(value="age" , required=false , defaultValue="40") Integer age) { 
		System.out.println(username + ":" + age);
		return SUCCESS;
	}

	@ResponseBody
	@RequestMapping(value="/testRest/{id}" , method=RequestMethod.PUT)
	public String testRestPut(@PathVariable Integer id) {
		System.out.println("testRest put "+ id);
		return SUCCESS;
	}

	@ResponseBody
	@RequestMapping(value="/testRest/{id}" , method=RequestMethod.DELETE)
	public String testRestDelete(@PathVariable Integer id) {
		System.out.println("testRest delete "+ id);
		return SUCCESS;
	}
	
	@RequestMapping(value="/testRest" , method=RequestMethod.POST)
	public String testRestPost() {
		System.out.println("testRest post ");
		return SUCCESS;
	}
	
	@RequestMapping(value="/testRest/{id}" , method=RequestMethod.GET)
	public String testRestGet(@PathVariable Integer id) {
		System.out.println("testRest get "+ id);
		return SUCCESS;
	}

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
