package com.example.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//파라메터 관련 내용 정리
@Controller
@RequestMapping("/welcome")
public class WelcomeController {
	@RequestMapping({"","/"})//여러 url 패턴에 응답
	//파라메터 기본값 예제
	//기본 방식으로 @RequestParam을  사용하면 반드시 파라미터가 전달되어야한다
//	public ModelAndView home(@RequestParam String name) {
	public ModelAndView home(@RequestParam(value="name", required=false,defaultValue="there")
	String name) // required=false,defaultValue="there" 를 부여해 파라미터 기본갑 부여  def가 기본값 req가 실패시
	{
		ModelAndView mav =new ModelAndView();
		mav.addObject("message","hello,"+name);
		mav.setViewName("/WEB-INF/views/hello.jsp");
		return mav;
	}
	
	//path Variable
	//파라메터를 URL 쿼리 스트링(예:?name=_&no=_)으로 전달하지 않고
	//url 경로상에 지정하는 방법(Fancy url, Pretty URL)
	// {}-> url 경로상 내용을 라라미터로 변환
	@RequestMapping("/pathparam/{name}/{no}")
	public ModelAndView pathParam(
			@PathVariable String name,
			@PathVariable Long no) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "Name:" + name + ", No:" + no);
		mav.setViewName("/WEB-INF/views/hello.jsp");

		return mav;
	}
}
