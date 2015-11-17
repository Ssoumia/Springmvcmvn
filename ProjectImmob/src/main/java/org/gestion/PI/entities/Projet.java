package org.gestion.PI.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@SuppressWarnings("serial")
@Entity
public class Projet implements Serializable {
	 @Id
	 @Column(name="PRJ_ID")
	private Long idprojet;
	private String nom;
	private String type;
	private String date;
	
	@ManyToMany(mappedBy="projet")
	private Collection<Condidat> condidat;
	
	@ManyToMany(mappedBy="proj")
	private Collection<Afournisseur> afourniss;
	
	@OneToMany
	@JoinColumn(name="PROJECT_ID", referencedColumnName="PRJ_ID")
	private Collection<Terrain> terrain;
	//private Collection<Caisse> caisse;
	
	
	public String getNom() {
		return nom;
	}
	public Long getIdprojet() {
		return idprojet;
	}
	public void setIdprojet(Long idprojet) {
		this.idprojet = idprojet;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Collection<Condidat> getCondidat() {
		return condidat;
	}
	public void setCondidat(Collection<Condidat> condidat) {
		this.condidat = condidat;
	}
	public Collection<Afournisseur> getAfourniss() {
		return afourniss;
	}
	public void setAfourniss(Collection<Afournisseur> afourniss) {
		this.afourniss = afourniss;
	}
	public Collection<Terrain> getTerrain() {
		return terrain;
	}
	public void setTerrain(Collection<Terrain> terrain) {
		this.terrain = terrain;
	}
	
	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Projet(String nom, String type, String date) {
		super();
		this.nom = nom;
		this.type = type;
		this.date = date;
	}

	
	

}
