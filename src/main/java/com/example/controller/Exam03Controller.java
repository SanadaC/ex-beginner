package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {

	@Autowired
	private ServletContext application;
	
	@RequestMapping("")
	public String index() {
		return "exam03";
	}
	
	@RequestMapping("/items")
	public String items(Integer num1,Integer num2,Integer num3)	{
		application.setAttribute("num1", num1);
		application.setAttribute("num2", num2);
		application.setAttribute("num3", num3);
		Integer price = num1+num2+num3;
		Integer tax = (int)(price*1.08);
		application.setAttribute("price", price);
		application.setAttribute("tax", tax);
		
		return "exam03-result";
		
	}
	
}
