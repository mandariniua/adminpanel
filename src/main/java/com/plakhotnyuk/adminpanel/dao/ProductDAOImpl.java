package com.plakhotnyuk.adminpanel.dao;

import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.plakhotnyuk.adminpanel.bean.Product;

public class ProductDAOImpl implements ProductDao {

	public void addProduct(Product product) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","1234");
				PreparedStatement preparedstatement = connection.prepareStatement(
						"INSERT INTO productAdmin (productName, description) VALUES (?, ?);")) {
			
			preparedstatement.setString(1, product.getProductName());
			preparedstatement.setString(2, product.getDescription());
			
			preparedstatement.executeUpdate();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
			
		
	}

	public void deleteProduct(Product product) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","1234");
				PreparedStatement preparedstatement = connection.prepareStatement(
						"DELETE FROM productAdmin WHERE productName = ?;")) {
			
			preparedstatement.setString(1, product.getProductName());
			
			preparedstatement.executeUpdate();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}


	public List<Product> findAllProducts() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		ArrayList<Product> productList = new ArrayList<>();
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","1234");
				Statement statement = connection.createStatement();) {
			
			ResultSet resultSet = statement.executeQuery("SELECT * FROM productAdmin;");
			
			while(resultSet.next()) {
				int id = resultSet.getInt("id");
				String productName = resultSet.getString("productName");
				String description = resultSet.getString("description");
				productList.add(new Product(id, productName, description));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return productList;
	}

	@Override
	public Product findProductByID(int id) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","1234");
				PreparedStatement preparedStatement = connection.prepareStatement(
						"SELECT * FROM productAdmin where id = ?;")) {
			preparedStatement.setInt(1, id);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();
			
			return new Product (resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Product();
	}


}
