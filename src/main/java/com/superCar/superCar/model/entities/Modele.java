package com.superCar.superCar.model.entities;
// Generated 16 nov. 2017 22:03:34 by Hibernate Tools 5.2.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Modele generated by hbm2java
 */
@Entity
@Table(name = "MODELE", catalog = "enidis")
public class Modele implements java.io.Serializable {

	private Integer modId;
	private Marque marque;
	private String modCode;
	private String modLibelle;
	private Set<Vehicule> vehicules = new HashSet<Vehicule>(0);

	public Modele() {
	}

	public Modele(Marque marque, String modCode, String modLibelle, Set<Vehicule> vehicules) {
		this.marque = marque;
		this.modCode = modCode;
		this.modLibelle = modLibelle;
		this.vehicules = vehicules;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "MOD_ID", unique = true, nullable = false)
	public Integer getModId() {
		return this.modId;
	}

	public void setModId(Integer modId) {
		this.modId = modId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MOD_IDMARQUE")
	public Marque getMarque() {
		return this.marque;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	@Column(name = "MOD_CODE", length = 5)
	public String getModCode() {
		return this.modCode;
	}

	public void setModCode(String modCode) {
		this.modCode = modCode;
	}

	@Column(name = "MOD_LIBELLE", length = 20)
	public String getModLibelle() {
		return this.modLibelle;
	}

	public void setModLibelle(String modLibelle) {
		this.modLibelle = modLibelle;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "modele")
	public Set<Vehicule> getVehicules() {
		return this.vehicules;
	}

	public void setVehicules(Set<Vehicule> vehicules) {
		this.vehicules = vehicules;
	}

}
