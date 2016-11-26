package com.plakhotnyuk.adminpanel.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.plakhotnyuk.adminpanel.bean.Product;
import com.plakhotnyuk.adminpanel.dao.ProductDAOImpl;
import com.plakhotnyuk.adminpanel.dao.ProductDao;


public class DeleteProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Product product = new Product();
		
		product.setProductName(request.getParameter("productName"));
		
		ProductDao productDao = new ProductDAOImpl();
		
		productDao.deleteProduct(product);
		response.getWriter().write("Deleted");
	}

}
