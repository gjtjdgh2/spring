package com.example.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

//메서드 단독 맵핑: 메서드 앞에 RequestMapping한다
@Controller
public class HelloController {
	//요청 받아야한다
	//url패턴 /hello에 반응하고
	//파라메터로 name을 받는다
	//예: /hello?name=홍길동
	@RequestMapping("/hello")
	public ModelAndView hello(@RequestParam String name) {
		//Spring의 기본 응답 객체는 ModelAndView
		//데이터의 뷰 객체의 정보를 함깨 가지고 있다
		ModelAndView mav = new ModelAndView();
		
		//데이터를 설정
		mav.addObject("message","Hello"+name);
		mav.setViewName("/WEB-INF/views/hello.jsp");
		return mav;
	}
	
	//String 을 반환하면 -> 기본적으로는 뷰 이름을 의미한다
	@RequestMapping("/hello2")
	public String hello2() {
		
		return "/WEB-INF/views/hello.jsp";
	}
	
	@ResponseBody
	@RequestMapping("/hello3")
	public String hello3() {
		return "<h3>Direct Response</h3>";
	}
	
}
