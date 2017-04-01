package com.shopping.service;

import java.util.List;

import com.shopping.model.Customer;

public interface CustomerService {

	boolean addCustomer(Customer c);
	boolean delCustomer(int id);
	boolean updCustomer(Customer c);
	Customer getCustomerByName(String name);
	List<Customer> getAllCustomer();
	
}
