package com.plakhotnyuk.adminpanel.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.plakhotnyuk.adminpanel.bean.Product;
import com.plakhotnyuk.adminpanel.dao.ProductDAOImpl;


public class findProductByIDServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("findProductId.jsp");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Product product = new ProductDAOImpl().findProductByID(Integer.valueOf(request.getParameter("id")));
			request.setAttribute("product", product);
			RequestDispatcher rd = request.getRequestDispatcher("findProductId.jsp");
			rd.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
