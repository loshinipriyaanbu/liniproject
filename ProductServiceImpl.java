package com.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.dao.ProductDao;
import com.shopping.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDao productdao;	
	
	public ProductServiceImpl(){
		
	}
	
	public void addProduct(Product product) {
		productdao.addProduct(product);

	}

	public void updateProduct(Product product) {
		productdao.updateProduct(product);
		
	}
	
	public List<Product> listProduct() {
		return productdao.listProduct();
	}

	public Product getbyid(int id) {
		return productdao.getbyid(id);
	}

	public void deleteProduct(int id) {
		productdao.deleteProduct(id);
	}

	public List<Product> listProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeProduct(int id) {
		// TODO Auto-generated method stub
		
	}

	

}
