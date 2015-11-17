package org.gestion.PI.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Id;

@SuppressWarnings("serial")
public class Terrain implements Serializable {
	@Id
	@Column(name="PROJECT_ID")
	private Long idterrain;
	private Double surface;
	private Double latitude;
	private Double longitude;
	private String adresse;
	private Collection<Lots> lot;
	
	
	
	public Long getIdterrain() {
		return idterrain;
	}
	public void setIdterrain(Long idterrain) {
		this.idterrain = idterrain;
	}
	public Double getSurface() {
		return surface;
	}
	public void setSurface(Double surface) {
		this.surface = surface;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Collection<Lots> getLot() {
		return lot;
	}
	public void setLot(Collection<Lots> lot) {
		this.lot = lot;
	}
	public Terrain() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Terrain(Double surface, Double latitude, Double longitude,
			String adresse) {
		super();
		this.surface = surface;
		this.latitude = latitude;
		this.longitude = longitude;
		this.adresse = adresse;
	}
	
	
	
	

}
