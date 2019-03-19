package fr.epsi.blog.beans;

import java.util.Date;

public class Utilisateur {

	private String email;
	private String nom;
	private String password;
	private Date dateCreation;
	private Boolean admin;

	public Utilisateur() {
	}

	public Utilisateur(String email, String nom, String password) {
		this.email = email;
		this.nom = nom;
		this.password = password;
		this.dateCreation = new Date();
		this.admin = false;
	}

	public Utilisateur(String email, String nom, String password, Date dateCreation, Boolean admin) {
		this.email = email;
		this.nom = nom;
		this.password = password;
		this.dateCreation = dateCreation;
		this.admin = admin;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String passord) {
		this.password = passord;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Boolean getAdmin() {
		return admin;
	}
	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}
	
}
