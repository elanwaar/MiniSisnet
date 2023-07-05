package com.miniprojet.sisnet.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class connection_base_donnees{
	
	public static Connection getConnection() throws SQLException {
		
		try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    // Rest of your code here
		} catch (ClassNotFoundException e) {
		    e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/sisnet";
		String username = "root";
		String password = "";
		
		Connection connection = DriverManager.getConnection(url, username, password);
		
		return connection;
		
	}
}