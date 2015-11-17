package org.gestion.PI.entities;

import java.io.Serializable;
import java.util.Collection;

@SuppressWarnings("serial")
public class Lots implements Serializable {
	
	private Long idlots;
	private Double surface;
	private String type;
	private String affectation;
	private Long etage;
	private Collection<Adherant> adher;
	
	
	public Long getIdlots() {
		return idlots;
	}
	public void setIdlots(Long idlots) {
		this.idlots = idlots;
	}
	public Double getSurface() {
		return surface;
	}
	public void setSurface(Double surface) {
		this.surface = surface;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAffectation() {
		return affectation;
	}
	public void setAffectation(String affectation) {
		this.affectation = affectation;
	}
	public Long getEtage() {
		return etage;
	}
	public void setEtage(Long etage) {
		this.etage = etage;
	}
	public Collection<Adherant> getAdher() {
		return adher;
	}
	public void setAdher(Collection<Adherant> adher) {
		this.adher = adher;
	}
	public Lots() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lots(Double surface, String type, String affectation, Long etage) {
		super();
		this.surface = surface;
		this.type = type;
		this.affectation = affectation;
		this.etage = etage;
	}
	
	
	
	
	
	

}
