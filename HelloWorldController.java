package com.shopping.controller;
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
	public ModelAndView helloWorld1() {
	return new ModelAndView("login");
	
}
	
@RequestMapping("/signnup")
public ModelAndView helloWorld6() {
return new ModelAndView("signnup");
}
}