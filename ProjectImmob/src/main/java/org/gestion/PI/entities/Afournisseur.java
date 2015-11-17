package org.gestion.PI.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@SuppressWarnings("serial")
@Entity
@DiscriminatorValue("Afournisseur")
public class Afournisseur extends Pfournisseur implements Serializable {
	
	private Double prix;
	@ManyToMany
	@JoinTable(name="FOURN_PROJ",joinColumns=@JoinColumn(name="CODE_FOURN"),
	inverseJoinColumns=@JoinColumn(name="CODE_PROJ"))
	private Collection<Projet> proj;
	

	public Collection<Projet> getProj() {
		return proj;
	}

	public void setProj(Collection<Projet> proj) {
		this.proj = proj;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public Afournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Afournisseur(String nom, String prenom, String cin, String adresse,
			String ville, Long fix, Long mobile, String email, String date,
			String fax, String web, String serv, Double prix) {
		super(nom, prenom, cin, adresse, ville, fix, mobile, email, date, fax,
				web, serv);
		this.prix = prix;
	}

	
	

}
