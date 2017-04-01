package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	@RequestMapping("/")
	public ModelAndView helloWorld() {
		return new ModelAndView("welcome");
	}
	@RequestMapping("/login")
	public ModelAndView login() {
		return new ModelAndView("login");
	}
	@RequestMapping("/signup")
	public ModelAndView signup() {
		return new ModelAndView("signup");
	}
}