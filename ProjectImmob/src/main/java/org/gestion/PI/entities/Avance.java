package org.gestion.PI.entities;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Avance implements Serializable {
	
	private Long idavance;
	private String refAv;
	private String typeAv;
	private Double sommeAv;
	private String dateAv;
	

	public Long getIdavance() {
		return idavance;
	}
	public void setIdavance(Long idavance) {
		this.idavance = idavance;
	}
	public String getRefAv() {
		return refAv;
	}
	public void setRefAv(String refAv) {
		this.refAv = refAv;
	}
	public String getTypeAv() {
		return typeAv;
	}
	public void setTypeAv(String typeAv) {
		this.typeAv = typeAv;
	}
	public Double getSommeAv() {
		return sommeAv;
	}
	public void setSommeAv(Double sommeAv) {
		this.sommeAv = sommeAv;
	}
	public String getDateAv() {
		return dateAv;
	}
	public void setDateAv(String dateAv) {
		this.dateAv = dateAv;
	}
	public Avance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Avance(String refAv, String typeAv, Double sommeAv, String dateAv) {
		super();
		this.refAv = refAv;
		this.typeAv = typeAv;
		this.sommeAv = sommeAv;
		this.dateAv = dateAv;
	}
	
	
	

}
