package org.gestion.PI.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@SuppressWarnings("serial")
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Type_Fourn", discriminatorType=DiscriminatorType.STRING,length=12)
@DiscriminatorValue("Pfournisseur")
public class Pfournisseur extends Personne implements Serializable {
	
	private String fax;
	private String web;
	private String serv;
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getServ() {
		return serv;
	}
	public void setServ(String serv) {
		this.serv = serv;
	}
	public Pfournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pfournisseur(String nom, String prenom, String cin, String adresse,
			String ville, Long fix, Long mobile, String email, String date,
			String fax, String web, String serv) {
		super(nom, prenom, cin, adresse, ville, fix, mobile, email, date);
		this.fax = fax;
		this.web = web;
		this.serv = serv;
	}
	
	

}
