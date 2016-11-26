package com.plakhotnyuk;

import com.plakhotnyuk.adminpanel.bean.Product;
import com.plakhotnyuk.adminpanel.dao.ProductDAOImpl;
import com.plakhotnyuk.adminpanel.dao.ProductDao;

public class Main {  
	
	public static void main(String[] args) {
		
		ProductDao productDao = new ProductDAOImpl();
		
		
		System.out.println(productDao.findProductByID(7));
		
	}

}
