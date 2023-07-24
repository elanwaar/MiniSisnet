package com.miniprojet.sisnet.DAO.Tables;

import java.sql.Timestamp;

public class User {

	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String username;
	private String password;
	private char sexe;
	private int phone_number;
	private String role;
	private int level;
	private String state ;
	private Timestamp gistration_date;
	private Timestamp last_login;
	

	public User() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public char getSexe() {
		return sexe;
	}


	public void setSexe(char sexe) {
		this.sexe = sexe;
	}


	public int getPhone_number() {
		return phone_number;
	}


	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public Timestamp getGistration_date() {
		return gistration_date;
	}


	public void setGistration_date(Timestamp gistration_date) {
		this.gistration_date = gistration_date;
	}


	public Timestamp getLast_login() {
		return last_login;
	}


	public void setLast_login(Timestamp last_login) {
		this.last_login = last_login;
	}
	
	
}
