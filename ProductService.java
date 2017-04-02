package com.shopping.service;
import java.util.List;

import com.shopping.model.Product;


public interface ProductService {

	public void addProduct(Product p);
	public void updateProduct(Product p);
	public List<Product> listProducts();
	public Product getProductById(int id);
	void removeProduct(int id);
	
}