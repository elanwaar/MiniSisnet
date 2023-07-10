package com.miniprojet.sisnet.DAO.Tables;

import java.sql.Timestamp;

public class Cliente {

	
	private int id_dpersona;
	
	private int numepers ;
	private String nombpers;
	private String ape1pers; 
	private String ape2pers; 
	private String tipodocu; 
	private String numedocu; 
	private Timestamp fechnaci; 
	private char sexo;
	private String pais;
	private String idioma;
	private int id_dpedomi_fk;
	private Timestamp fechalta;
	
	public int getId_dpersona() {
		return id_dpersona;
	}
	public void setId_dpersona(int id_dpersona) {
		this.id_dpersona = id_dpersona;
	}
	public int getNumepers() {
		return numepers;
	}
	public void setNumepers(int numepers) {
		this.numepers = numepers;
	}
	public String getNombpers() {
		return nombpers;
	}
	public void setNombpers(String nombpers) {
		this.nombpers = nombpers;
	}
	public String getApe1pers() {
		return ape1pers;
	}
	public void setApe1pers(String ape1pers) {
		this.ape1pers = ape1pers;
	}
	public String getApe2pers() {
		return ape2pers;
	}
	public void setApe2pers(String ape2pers) {
		this.ape2pers = ape2pers;
	}
	public String getTipodocu() {
		return tipodocu;
	}
	public void setTipodocu(String tipodocu) {
		this.tipodocu = tipodocu;
	}
	public String getNumedocu() {
		return numedocu;
	}
	public void setNumedocu(String numedocu) {
		this.numedocu = numedocu;
	}
	public Timestamp getFechnaci() {
		return fechnaci;
	}
	public void setFechnaci(Timestamp fechnaci) {
		this.fechnaci = fechnaci;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public int getId_dpedomi_fk() {
		return id_dpedomi_fk;
	}
	public void setId_dpedomi_fk(int id_dpedomi_fk) {
		this.id_dpedomi_fk = id_dpedomi_fk;
	}
	public Timestamp getFechalta() {
		return fechalta;
	}
	public void setFechalta(Timestamp fechalta) {
		this.fechalta = fechalta;
	}
	public Cliente(int id_dpersona, int numepers, String nombpers, String ape1pers, String ape2pers, String tipodocu,
			String numedocu, Timestamp fechnaci, char sexo, String pais, String idioma, int id_dpedomi_fk,
			Timestamp fechalta) {
		super();
		this.id_dpersona = id_dpersona;
		this.numepers = numepers;
		this.nombpers = nombpers;
		this.ape1pers = ape1pers;
		this.ape2pers = ape2pers;
		this.tipodocu = tipodocu;
		this.numedocu = numedocu;
		this.fechnaci = fechnaci;
		this.sexo = sexo;
		this.pais = pais;
		this.idioma = idioma;
		this.id_dpedomi_fk = id_dpedomi_fk;
		this.fechalta = fechalta;
	}
	public Cliente() {
		super();
	}
	
	
}
