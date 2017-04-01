package com.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.dao.CustomerDAO;
import com.shopping.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDAO cdao;
	@Override
	public boolean addCustomer(Customer c) {
		
		return cdao.addCustomer(c);
	}

	@Override
	public boolean delCustomer(int id)  {
		return cdao.delCustomer(id);
	}

	@Override
	public boolean updCustomer(Customer c) {

		return cdao.updCustomer(c);
	}

	@Override
	public Customer getCustomerByName(String name) {
	
		return cdao.getCustomerByName(name);
	}

	@Override
	public List<Customer> getAllCustomer() {
		return cdao.getAllCustomer();


}
}
