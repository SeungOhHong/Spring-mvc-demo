package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

// 2. student 컨트롤러 생성

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showingForm")
	public String showingForm(Model theModel) {
		
		// student 객체 생성
		Student theStudent = new Student();
		
		//모델에 student 객체 추가
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		
		// log the input data
		System.out.println("theStudent" + theStudent.getFirstName()  + "" + theStudent.getLastName());
		
		return "student-confirmation";
		
	}
}
