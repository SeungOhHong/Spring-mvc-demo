package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
		@RequestMapping("/showingForm")
		public String showingForm(Model theModel) {
			theModel.addAttribute("customer", new Customer());
			return "customer-form";
		
		}
		
		@RequestMapping("/processForm")
		public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer, 
				BindingResult theBindingResult) {
			
			{
				if(theBindingResult.hasErrors()) {
					return "customer-form";
				}
				else {
					
					return "customer-confirmation";
				}
			}
			
			
		
	}
	

}
