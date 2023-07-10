package com.miniprojet.sisnet;

import java.sql.Connection;
import java.sql.SQLException;

import com.miniprojet.sisnet.DAO.connection_base_donnees;

public class controller{
	
	public void insertCliente() {
		//connection_base_donnees connectionconnection_base_donnees=new connection_base_donnees();
		Connection connection ;
		try {
			connection = connection_base_donnees.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//connection.prepareStatement(null)
		
	}
	
}