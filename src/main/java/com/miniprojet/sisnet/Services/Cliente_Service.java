package com.miniprojet.sisnet.Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.miniprojet.XML.readXML;
import com.miniprojet.sisnet.DAO.connection_base_donnees;
import com.miniprojet.sisnet.DAO.Tables.Cliente;

import java.sql.ResultSet;

public class Cliente_Service {
	
	public void insert() throws SQLException {
		Connection connection = connection_base_donnees.getConnection();
		String insertQuery = readXML.insertQuery();
		PreparedStatement pst= connection.prepareStatement(insertQuery);
        
        pst.setInt(1, 0);
        pst.setInt(2, 0);
        pst.setString(3, "");
        pst.setString(4, "");
        pst.setString(5, "");
        pst.setString(6, "");
        pst.setString(7, "");
        pst.setTimestamp(8, new Timestamp(1000));
        pst.setString(9, "");
        pst.setString(10, "");
        pst.setString(11, "");
        pst.setNull(12, java.sql.Types.INTEGER);
        pst.setTimestamp(13, new Timestamp(1000));
        
        pst.executeUpdate();
	}
	public List<Cliente> getAll(){
		List<Cliente> clientes = new ArrayList<Cliente>();

		try {
			Connection connection = connection_base_donnees.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultset = statement.executeQuery("SELECT * FROM cliente");
			while(resultset.next()) {
				Cliente cliente = new Cliente();
				cliente.setId_dpersona(resultset.getInt(1));
				cliente.setNumepers(resultset.getInt(2));
				cliente.setNombpers(resultset.getString(3));
				cliente.setApe1pers(resultset.getString(4));
				cliente.setApe2pers(resultset.getString(5));
				cliente.setTipodocu(resultset.getString(6));
				cliente.setNumedocu(resultset.getString(7));
				cliente.setFechnaci(resultset.getTimestamp(8));
				cliente.setSexo('m');
				cliente.setPais(resultset.getString(10));
				cliente.setIdioma(resultset.getString(11));
				cliente.setId_dpedomi_fk(resultset.getInt(12));
				cliente.setFechalta(resultset.getTimestamp(13));
				clientes.add(cliente);
			}
		}
			catch (Exception e) {
					e.printStackTrace();			
			}
		
		
		return clientes;

	}

}
