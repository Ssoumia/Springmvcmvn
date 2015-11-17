package org.gestion.PI.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@SuppressWarnings("serial")
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Type_Candidat", discriminatorType=DiscriminatorType.STRING,length=12)
@DiscriminatorValue("Candidat")
public class Condidat extends Personne implements Serializable {
	
	private String profession;
	private String location;
	private String situationFamiliale;
	private String nbrenfant;
	private String nomConjoint;
	private String prenomConjoint;
	private String profConjoint;
	private String loconjoint;
	@ManyToMany
	@JoinTable(name="CAND_PROJ",joinColumns=@JoinColumn(name="CODE_CAND"),
	inverseJoinColumns=@JoinColumn(name="CODE_PROJ"))
	private Collection<Projet> projet;
	
	public Collection<Projet> getProjet() {
		return projet;
	}
	public void setProjet(Collection<Projet> projet) {
		this.projet = projet;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSituationFamiliale() {
		return situationFamiliale;
	}
	public void setSituationFamiliale(String situationFamiliale) {
		this.situationFamiliale = situationFamiliale;
	}
	public String getNbrenfant() {
		return nbrenfant;
	}
	public void setNbrenfant(String nbrenfant) {
		this.nbrenfant = nbrenfant;
	}
	public String getNomConjoint() {
		return nomConjoint;
	}
	public void setNomConjoint(String nomConjoint) {
		this.nomConjoint = nomConjoint;
	}
	public String getPrenomConjoint() {
		return prenomConjoint;
	}
	public void setPrenomConjoint(String prenomConjoint) {
		this.prenomConjoint = prenomConjoint;
	}
	public String getProfConjoint() {
		return profConjoint;
	}
	public void setProfConjoint(String profConjoint) {
		this.profConjoint = profConjoint;
	}
	public String getLoconjoint() {
		return loconjoint;
	}
	public void setLoconjoint(String loconjoint) {
		this.loconjoint = loconjoint;
	}
	public Condidat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Condidat(String nom, String prenom, String cin, String adresse,
			String ville, Long fix, Long mobile, String email, String date,
			String profession, String location, String situationFamiliale,
			String nbrenfant, String nomConjoint, String prenomConjoint,
			String profConjoint, String loconjoint) {
		super(nom, prenom, cin, adresse, ville, fix, mobile, email, date);
		this.profession = profession;
		this.location = location;
		this.situationFamiliale = situationFamiliale;
		this.nbrenfant = nbrenfant;
		this.nomConjoint = nomConjoint;
		this.prenomConjoint = prenomConjoint;
		this.profConjoint = profConjoint;
		this.loconjoint = loconjoint;
	}
	
}
