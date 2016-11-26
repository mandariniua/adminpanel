package com.plakhotnyuk.adminpanel.dao;

import java.util.List;

import com.plakhotnyuk.adminpanel.bean.Product;

public interface ProductDao {
	
	public void addProduct(Product product);
	public void deleteProduct(Product product);
	public Product findProductByID(int id);
	public List<Product> findAllProducts();
	

}
