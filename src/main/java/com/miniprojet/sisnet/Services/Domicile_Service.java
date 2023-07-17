package com.miniprojet.sisnet.Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.miniprojet.sisnet.DAO.connection_base_donnees;
import com.miniprojet.sisnet.DAO.Tables.Domicile;

import XML.readXML;

public class Domicile_Service {

	Connection connection;
	
	public Domicile_Service(){
		try {
			connection = connection_base_donnees.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Domicile insert(Domicile domicile) throws SQLException {
		
		String insertQuery = readXML.insertQuery("domicile");
		
		PreparedStatement pst = setInsertStatement(domicile, insertQuery);
		
		pst.executeUpdate();
		
		return domicile;
	}
	
	public List<Domicile> getAll() {
		
		List<Domicile> domiciles = new ArrayList<Domicile>();
		
		try {
			
			Statement statement = connection.createStatement();
			String selectAllQuery = readXML.selectAllQuery("domicile");
			ResultSet resultset = statement.executeQuery(selectAllQuery);
			
			domiciles = createDomicileList(resultset);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return domiciles;
	}
	
	public Domicile getDomicileById(int id) throws SQLException {
		
		String selectByIdQuery = readXML.selectByIdQuery("domicile");
		PreparedStatement pst = connection.prepareStatement(selectByIdQuery);
		pst.setInt(1, id);
		ResultSet resultset = pst.executeQuery();
		Domicile domicile = new Domicile();
		
		domicile = createDomicile(resultset);
		return domicile;
		
		
		
	}

	public Domicile update(Domicile domicile) throws SQLException {
		
		return setUpdateStatement(domicile);
	}
	
	public boolean delete(int id) throws SQLException {
		
		String deleteQuery = readXML.deleteQuery("domicile");
		PreparedStatement pst = connection.prepareStatement(deleteQuery);
		pst.setInt(1, id);
		
		int rowsAffected = pst.executeUpdate();
		if(rowsAffected != 0) {
			return true;
		}else {
			return false;
		}
	}
	
	private Domicile createDomicile(ResultSet resultSet) throws SQLException{
		
		Domicile domicile = new Domicile();
		if(resultSet.next()) {
			
			domicile.setId_domicile(resultSet.getInt(1));
			domicile.setId_person_fk(resultSet.getInt(2));
			domicile.setTypeofroad(resultSet.getString(3));
			domicile.setStreetname(resultSet.getString(4));
			domicile.setNumber(resultSet.getString(5));
			domicile.setPortal(resultSet.getString(6));
			domicile.setStairs(resultSet.getString(7));
			domicile.setFloor(resultSet.getString(8));
			domicile.setDoor(resultSet.getString(9));
			domicile.setPopulation(resultSet.getString(10));
			domicile.setProvince(resultSet.getString(11));
			domicile.setPostal(resultSet.getString(12));
			domicile.setComplement(resultSet.getString(13));
			domicile.setNumdomicile(resultSet.getBigDecimal(14));
			domicile.setTypeofdomicile(resultSet.getString(15));
			domicile.setEntrydate(resultSet.getTimestamp(16));
			domicile.setEntryuser(resultSet.getTimestamp(17));
			
		}else {
			return null;
		}
		
		return domicile;
	}
	
	private List<Domicile> createDomicileList(ResultSet resultSet) throws SQLException {
		
		List<Domicile> domiciles = new ArrayList<Domicile>();
		
		while(resultSet.next()) {
			Domicile domicile = new Domicile();
			domicile.setId_domicile(resultSet.getInt(1));
			domicile.setId_person_fk(resultSet.getInt(2));
			domicile.setTypeofroad(resultSet.getString(3));
			domicile.setStreetname(resultSet.getString(4));
			domicile.setNumber(resultSet.getString(5));
			domicile.setPortal(resultSet.getString(6));
			domicile.setStairs(resultSet.getString(7));
			domicile.setFloor(resultSet.getString(8));
			domicile.setDoor(resultSet.getString(9));
			domicile.setPopulation(resultSet.getString(10));
			domicile.setProvince(resultSet.getString(11));
			domicile.setPostal(resultSet.getString(12));
			domicile.setComplement(resultSet.getString(13));
			domicile.setNumdomicile(resultSet.getBigDecimal(14));
			domicile.setTypeofdomicile(resultSet.getString(15));
			domicile.setEntrydate(resultSet.getTimestamp(16));
			domicile.setEntryuser(resultSet.getTimestamp(17));
			domiciles.add(domicile);
		}
		
		return domiciles;
	}
	
	private PreparedStatement setInsertStatement(Domicile domicile, String insertQuery) throws SQLException {
		
		PreparedStatement pst= connection.prepareStatement(insertQuery);
		
		try {
			
			pst.setInt(1, domicile.getId_domicile());
			pst.setInt(2, domicile.getId_person_fk());
			pst.setString(3, domicile.getTypeofroad());
			pst.setString(4, domicile.getStreetname());
			pst.setString(5, domicile.getNumber());
			pst.setString(6, domicile.getPortal());
			pst.setString(7, domicile.getStairs());
			pst.setString(8, domicile.getFloor());
			pst.setString(9, domicile.getDoor());
			pst.setString(10, domicile.getPopulation());
			pst.setString(11, domicile.getProvince());
			pst.setString(12, domicile.getPostal());
			pst.setString(13, domicile.getComplement());
			pst.setBigDecimal(14, domicile.getNumdomicile());
			pst.setString(15, domicile.getTypeofdomicile());
			pst.setTimestamp(16, domicile.getEntrydate());
			pst.setTimestamp(17, domicile.getEntryuser());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return pst;
	}
	
	private Domicile setUpdateStatement(Domicile domicile) throws SQLException {
		
		String updateQuery = readXML.updateQuery("domicile");
		PreparedStatement pst = connection.prepareStatement(updateQuery);
		
		try {
			
			pst.setInt(1, domicile.getId_person_fk());
			pst.setString(2, domicile.getTypeofroad());
			pst.setString(3, domicile.getStreetname());
			pst.setString(4, domicile.getNumber());
			pst.setString(5, domicile.getPortal());
			pst.setString(6, domicile.getStairs());
			pst.setString(7, domicile.getFloor());
			pst.setString(8, domicile.getDoor());
			pst.setString(9, domicile.getPopulation());
			pst.setString(10, domicile.getProvince());
			pst.setString(11, domicile.getPostal());
			pst.setString(12, domicile.getComplement());
			pst.setBigDecimal(13, domicile.getNumdomicile());
			pst.setString(14, domicile.getTypeofdomicile());
			pst.setTimestamp(15, domicile.getEntrydate());
			pst.setTimestamp(16, domicile.getEntryuser());
			pst.setInt(17, domicile.getId_domicile());
			pst.executeUpdate();
			
		} catch (Exception e) {
		}
		
		return domicile; 
	}
	
	
	
}
