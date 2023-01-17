package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	// HTML 폼을 보여주기 위한 컨트롤러 메서드
	
	@RequestMapping("/showingForm")
	public String showingForm() {
		return "helloworld-form";
	}
	// HTML 폼을 처리하기 위한 컨트롤러 메서드
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// 폼 데이터를 읽어오기 위한 컨트롤러 메서드
	
	// 모델에 데이터 추가하기
	@RequestMapping("/processFormV2")
	public String letShoutDude(HttpServletRequest request, Model model) {
		
		// HTML 폼에서 요청단 파라미터 읽어오기
		String theName = request.getParameter("studentName");
		// 데이터를 모두 대문자로 변환
		theName = theName.toUpperCase();
		// 메시지 생성
		String result = "Hi! " + theName;
		// 메세지를 모델에 추가하기 ( 이름 , 값)
		model.addAttribute("message",result);
		
		
		return "helloworld";
	}

}
