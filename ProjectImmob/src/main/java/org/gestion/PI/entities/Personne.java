package org.gestion.PI.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="Client")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Type_Client", discriminatorType=DiscriminatorType.STRING,length=12)

public class Personne implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Code_Cli")
	private Long codePersonne;
	private String nom;
	private String prenom;
	private String cin;
	private String adresse;
	private String ville;
	private Long fix;
	private Long mobile;
	private String email;
	private String date;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public Long getFix() {
		return fix;
	}
	public void setFix(Long fix) {
		this.fix = fix;
	}
	public Long getMobile() {
		return mobile;
	}
	
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Personne(String nom, String prenom, String cin, String adresse,
			String ville, Long fix, Long mobile, String email, String date) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.adresse = adresse;
		this.ville = ville;
		this.fix = fix;
		this.mobile = mobile;
		this.email = email;
		this.date = date;
	}
	

}
