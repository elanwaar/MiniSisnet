package com.miniprojet.sisnet.Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import XML.readXML;
import com.miniprojet.sisnet.DAO.connection_base_donnees;
import com.miniprojet.sisnet.DAO.Tables.Client;

import java.sql.ResultSet;

public class Client_Service {
	
	Connection connection;
	
	public Client_Service(){
		try {
			connection = connection_base_donnees.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Client insert(Client client) throws SQLException {
				
		String insertQuery = readXML.insertQuery("client");
		PreparedStatement pst = setInsertStatement(client, insertQuery);
        pst.executeUpdate();
        pst.close();
        connection.close();
        return client;
	}
	
	public List<Client> getAll(){
		
		List<Client> clients = new ArrayList<Client>();
		
		try {
			
			Statement statement = connection.createStatement();
			String selectAllQuery = readXML.selectAllQuery("client");
			ResultSet resultset = statement.executeQuery(selectAllQuery);
			clients = createClientList(resultset);
			statement.close();
			resultset.close();
			connection.close();
			
		}
			catch (Exception e) {
					e.printStackTrace();			
			}
		
		return clients;

	}
	
	public Client getClientById(int id) {
		
		Client client = new Client();
		try {
			
			String selectByIdQuery = readXML.selectByIdQuery("client");
			PreparedStatement pst = connection.prepareStatement(selectByIdQuery);
			pst.setInt(1, id);
			ResultSet resultset = pst.executeQuery();
			client = createClient(resultset);
			pst.close();
			resultset.close();
			connection.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return client;
	}
	

	
	public Client update(Client client, int id) throws SQLException{
		
		return setUpdateStatement(client);
	}
	
	public boolean delete(int id) throws SQLException {
		
		String deleteQuery = readXML.deleteQuery("client");
		PreparedStatement pst = connection.prepareStatement(deleteQuery);
		pst.setInt(1, id);
		int rowsAffected = pst.executeUpdate();
		pst.close();
		connection.close();
		if(rowsAffected != 0) {
			return true;
		}else {
			return false;
		}
	}
	
	private PreparedStatement setInsertStatement(Client client, String insertQuery) throws SQLException {
		
		PreparedStatement pst= connection.prepareStatement(insertQuery);
		try {
        	String sexeAsString = String.valueOf(client.getSexe());
        	pst.setInt(1, client.getId_person());
            pst.setInt(2, client.getNumclient());
            pst.setString(3, client.getClientname());
            pst.setString(4, client.getLastname1());
            pst.setString(5, client.getLastname2());
            pst.setString(6, client.getDoctype());
            pst.setString(7, client.getDocnume());
            pst.setTimestamp(8, client.getBirthdate());
            pst.setString(9, sexeAsString);
            pst.setString(10, client.getCountry());
            pst.setString(11, client.getLanguage());
            //sets the foreign key id_domicile_fk, after verifying its value.
            setId_domicile_fk(client, pst);
            pst.setTimestamp(13, client.getEntrydate());
            pst.close();
            connection.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return pst;
}
	
	private List<Client> createClientList(ResultSet resultset) throws SQLException {
		
		List<Client> clients = new ArrayList<Client>();
		
		while(resultset.next()) {
			Client client = new Client();
			char sexeAsChar = '\0';
			try {
				sexeAsChar = resultset.getString(9).charAt(0);
			} catch (Exception e) {
				// TODO: handle exception
			}
				
			client.setId_person(resultset.getInt(1));
			client.setNumclient(resultset.getInt(2));
			client.setClientname(resultset.getString(3));
			client.setLastname1(resultset.getString(4));
			client.setLastname2(resultset.getString(5));
			client.setDoctype(resultset.getString(6));
			client.setDocnume(resultset.getString(7));
			client.setBirthdate(resultset.getTimestamp(8));
			client.setSexe(sexeAsChar);
			client.setCountry(resultset.getString(10));
			client.setLanguage(resultset.getString(11));
			client.setId_domicile_fk(resultset.getInt(12));
			client.setEntrydate(resultset.getTimestamp(13));
			clients.add(client);
			
		}
		resultset.close();
		connection.close();
		return clients;
	}

	private Client createClient(ResultSet resultset) throws SQLException{
		
		Client client = new Client();
		
		if(resultset.next()) {
			client.setId_person(resultset.getInt(1));
			client.setNumclient(resultset.getInt(2));
			client.setClientname(resultset.getString(3));
			client.setLastname1(resultset.getString(4));
			client.setLastname2(resultset.getString(5));
			client.setDoctype(resultset.getString(6));
			client.setDocnume(resultset.getString(7));
			client.setBirthdate(resultset.getTimestamp(8));
			client.setSexe(resultset.getString(9).charAt(0));
			client.setCountry(resultset.getString(10));
			client.setLanguage(resultset.getString(11));
			client.setId_domicile_fk(resultset.getInt(12));
			client.setEntrydate(resultset.getTimestamp(13));
		}
		
		
		return client;
	}

	private void setId_domicile_fk(Client client, PreparedStatement pst) {
		 
		if (client.getId_domicile_fk() == 0) {
         	try {
				pst.setNull(12, java.sql.Types.TINYINT);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 		}else {
 			try {
				pst.setInt(12, client.getId_domicile_fk());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	}

	private Client setUpdateStatement(Client client) throws SQLException {
		
		String updateQuery = readXML.updateQuery("client");
		PreparedStatement pst = connection.prepareStatement(updateQuery);
		
			String sexeAsString = String.valueOf(client.getSexe());
			pst.setInt(1, client.getId_person());
            pst.setInt(2, client.getNumclient());
            pst.setString(3, client.getClientname());
            pst.setString(4, client.getLastname1());
            pst.setString(5, client.getLastname2());
            pst.setString(6, client.getDoctype());
            pst.setString(7, client.getDocnume());
            pst.setTimestamp(8, client.getBirthdate());
            pst.setString(9, sexeAsString);
            pst.setString(10, client.getCountry());
            pst.setString(11, client.getLanguage());
            //sets the foreign key id_domicile_fk, after verifying its value.
            setId_domicile_fk(client, pst);
            pst.setTimestamp(13, client.getEntrydate());
            pst.setInt(14, client.getId_person());
            pst.executeUpdate();
            pst.close();
            connection.close();
		
		return client;
	}
}
