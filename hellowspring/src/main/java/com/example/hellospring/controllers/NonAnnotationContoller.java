package com.example.hellospring.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//Non Annotation 방식
// handleRequest메서드에 대응된다
//수동르오 servlet컨텍스트에 등록해야한다
public class NonAnnotationContoller  implements Controller{


	//	Servlet 방식으로 request, response만 전달
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "<h3>Non Annotation Controller</h3>");
		mav.setViewName("/WEB-INF/views/hello.jsp");
		return mav;
	}
	}

	

