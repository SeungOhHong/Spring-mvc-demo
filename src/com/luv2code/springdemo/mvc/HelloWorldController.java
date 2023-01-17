package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
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
	
	

}
