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
@DiscriminatorValue("Adherant")
public class Adherant extends Condidat implements Serializable {
	
	private Long Nrclasseur;
	private Long Nrpage;
	private Double Sommeavance;
	private boolean signcontrat;
	@ManyToMany
	@JoinTable(name="ADHR_LOTS",joinColumns=@JoinColumn(name="CODE_ADHR"),
	inverseJoinColumns=@JoinColumn(name="CODE_LOTS"))
	private Collection<Lots> lots;
	//private Collection<Desistant> desistant;
	
//	public Collection<Desistant> getDesistant() {
//		return desistant;
//	}
//	public void setDesistant(Collection<Desistant> desistant) {
//		this.desistant = desistant;
//	}
	public Collection<Lots> getLots() {
		return lots;
	}
	public void setLots(Collection<Lots> lots) {
		this.lots = lots;
	}
	public Long getNrclasseur() {
		return Nrclasseur;
	}
	public void setNrclasseur(Long nrclasseur) {
		Nrclasseur = nrclasseur;
	}
	public Long getNrpage() {
		return Nrpage;
	}
	public void setNrpage(Long nrpage) {
		Nrpage = nrpage;
	}
	public Double getSommeavance() {
		return Sommeavance;
	}
	public void setSommeavance(Double sommeavance) {
		Sommeavance = sommeavance;
	}
	public boolean isSigncontrat() {
		return signcontrat;
	}
	public void setSigncontrat(boolean signcontrat) {
		this.signcontrat = signcontrat;
	}
	public Adherant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Adherant(String nom, String prenom, String cin, String adresse,
			String ville, Long fix, Long mobile, String email, String date,
			String profession, String location, String situationFamiliale,
			String nbrenfant, String nomConjoint, String prenomConjoint,
			String profConjoint, String loconjoint, Long nrclasseur,
			Long nrpage, Double sommeavance, boolean signcontrat) {
		super(nom, prenom, cin, adresse, ville, fix, mobile, email, date,
				profession, location, situationFamiliale, nbrenfant,
				nomConjoint, prenomConjoint, profConjoint, loconjoint);
		Nrclasseur = nrclasseur;
		Nrpage = nrpage;
		Sommeavance = sommeavance;
		this.signcontrat = signcontrat;
	}
	
	
	
	
	

}
