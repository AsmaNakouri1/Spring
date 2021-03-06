package com.superCar.superCar.model.entities;
// Generated 16 nov. 2017 22:03:34 by Hibernate Tools 5.2.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * DocumentVehicule generated by hbm2java
 */
@Entity
@Table(name = "DOCUMENT_VEHICULE", catalog = "enidis")
public class DocumentVehicule implements java.io.Serializable {

	private Integer dvId;
	private Agence agence;
	private Vehicule vehicule;
	private String dvNom;
	private String dvType;
	private String dvChemin;

	public DocumentVehicule() {
	}

	public DocumentVehicule(Agence agence, Vehicule vehicule, String dvNom, String dvType, String dvChemin) {
		this.agence = agence;
		this.vehicule = vehicule;
		this.dvNom = dvNom;
		this.dvType = dvType;
		this.dvChemin = dvChemin;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "DV_ID", unique = true, nullable = false)
	public Integer getDvId() {
		return this.dvId;
	}

	public void setDvId(Integer dvId) {
		this.dvId = dvId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DV_IDAGENCE")
	public Agence getAgence() {
		return this.agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DV_IDVEHICULE")
	public Vehicule getVehicule() {
		return this.vehicule;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

	@Column(name = "DV_NOM", length = 20)
	public String getDvNom() {
		return this.dvNom;
	}

	public void setDvNom(String dvNom) {
		this.dvNom = dvNom;
	}

	@Column(name = "DV_TYPE", length = 20)
	public String getDvType() {
		return this.dvType;
	}

	public void setDvType(String dvType) {
		this.dvType = dvType;
	}

	@Column(name = "DV_CHEMIN", length = 60)
	public String getDvChemin() {
		return this.dvChemin;
	}

	public void setDvChemin(String dvChemin) {
		this.dvChemin = dvChemin;
	}

}
