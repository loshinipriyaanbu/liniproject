package com.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shopping.dao.CustomerDAO;
import com.shopping.model.Customer;
import com.shopping.service.CustomerService;

@Controller
public class CustomerController{
	
	@Autowired
	CustomerDAO cs;
	
	@ModelAttribute("cust")
	public Customer getCust(){
		return new Customer();
	}
	
	@RequestMapping("/")
	public String gohome(){
		return "welcome";
	}
	
	@RequestMapping("/register")
	public String goSign(){
		return "signup";
	}
	
	@RequestMapping("/addCustomer")
	public String doReg(@ModelAttribute Customer c){
		if(cs.addCustomer(c))
			return "welcome";
		else
			return "signup";
	}
}