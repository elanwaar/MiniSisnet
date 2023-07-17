package com.miniprojet.sisnet.DAO.Tables;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Domicile {
	
	
	private int id_domicile;
	private int id_person_fk;
	private String typeofroad;
	private String streetname;
	private String number;
	private String portal;
	private String stairs;
	private String floor;
	private String door;
	private String population;
	private String province;
	private String postal;
	private String complement;
	private BigDecimal numdomicile;
	private String typeofdomicile;
	private Timestamp entrydate;
	private Timestamp Entryuser;
	
	public Domicile() {
		super();
	}
	
	public int getId_domicile() {
		return id_domicile;
	}
	public void setId_domicile(int id_domicile) {
		this.id_domicile = id_domicile;
	}
	public int getId_person_fk() {
		return id_person_fk;
	}
	public void setId_person_fk(int id_person_fk) {
		this.id_person_fk = id_person_fk;
	}
	public String getTypeofroad() {
		return typeofroad;
	}
	public void setTypeofroad(String typeofroad) {
		this.typeofroad = typeofroad;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPortal() {
		return portal;
	}
	public void setPortal(String portal) {
		this.portal = portal;
	}
	public String getStairs() {
		return stairs;
	}
	public void setStairs(String stairs) {
		this.stairs = stairs;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getDoor() {
		return door;
	}
	public void setDoor(String door) {
		this.door = door;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getPostal() {
		return postal;
	}
	public void setPostal(String postal) {
		this.postal = postal;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public BigDecimal getNumdomicile() {
		return numdomicile;
	}
	public void setNumdomicile(BigDecimal numdomicile) {
		this.numdomicile = numdomicile;
	}
	public String getTypeofdomicile() {
		return typeofdomicile;
	}
	public void setTypeofdomicile(String typeofdomicile) {
		this.typeofdomicile = typeofdomicile;
	}
	public Timestamp getEntrydate() {
		return entrydate;
	}
	public void setEntrydate(Timestamp entrydate) {
		this.entrydate = entrydate;
	}
	public Timestamp getEntryuser() {
		return Entryuser;
	}
	public void setEntryuser(Timestamp entryuser) {
		Entryuser = entryuser; 
	}
	
	

}
