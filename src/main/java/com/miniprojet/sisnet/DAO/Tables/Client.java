package com.miniprojet.sisnet.DAO.Tables;

import java.sql.Timestamp;

public class Client {

	
	private int id_person;
	
	private int numclient ;
	private String clientname;
	private String lastname1; 
	private String lastname2; 
	private String doctype; 
	private String docnume; 
	private Timestamp birthdate; 
	private char sexe;
	private String country;
	private String language;
	private int id_domicile_fk;
	private Timestamp entrydate;
	
	public int getId_person() {
		return id_person;
	}
	public void setId_person(int id_person) {
		this.id_person = id_person;
	}
	public int getNumclient() {
		return numclient;
	}
	public void setNumclient(int numclient) {
		this.numclient = numclient;
	}
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	public String getLastname1() {
		return lastname1;
	}
	public void setLastname1(String lastname1) {
		this.lastname1 = lastname1;
	}
	public String getLastname2() {
		return lastname2;
	}
	public void setLastname2(String lastname2) {
		this.lastname2 = lastname2;
	}
	public String getDoctype() {
		return doctype;
	}
	public void setDoctype(String doctype) {
		this.doctype = doctype;
	}
	public String getDocnume() {
		return docnume;
	}
	public void setDocnume(String docnume) {
		this.docnume = docnume;
	}
	public Timestamp getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Timestamp birthdate) {
		this.birthdate = birthdate;
	}
	public char getSexe() {
		return sexe;
	}
	public void setSexe(char sexe) {
		this.sexe = sexe;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getId_domicile_fk() {
		
		return id_domicile_fk;
	}
	public void setId_domicile_fk(int id_domicile_fk) {
		this.id_domicile_fk = id_domicile_fk;
	}
	public Timestamp getEntrydate() {
		return entrydate;
	}
	public void setEntrydate(Timestamp entrydate) {
		this.entrydate = entrydate;
	}
	public Client(int id_person, int numclient, String clientname, String lastname1, String lastname2, String doctype,
			String docnume, Timestamp birthdate, char sexe, String country, String language, int id_domicile_fk,
			Timestamp entrydate) {
		super();
		this.id_person = id_person;
		this.numclient = numclient;
		this.clientname = clientname;
		this.lastname1 = lastname1;
		this.lastname2 = lastname2;
		this.doctype = doctype;
		this.docnume = docnume;
		this.birthdate = birthdate;
		this.sexe = sexe;
		this.country = country;
		this.language = language;
		this.id_domicile_fk = id_domicile_fk;
		this.entrydate = entrydate;
	}
	public Client() {
		super();
	}
	
	
	
	
}
