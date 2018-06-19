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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Agence generated by hbm2java
 */
@Entity
@Table(name = "AGENCE", catalog = "enidis")
public class Agence implements java.io.Serializable {

	private Integer agenId;
	private String agenCode;
	private String agenAdresse1;
	private String agenAdresse2;
	private String agenAdresse3;
	private Integer agenCp;
	private String agenVille;
	private Set<Vehicule> vehicules = new HashSet<Vehicule>(0);
	private Set<Correspondantvoiture> correspondantvoitures = new HashSet<Correspondantvoiture>(0);
	private Set<DocumentVehicule> documentVehicules = new HashSet<DocumentVehicule>(0);

	public Agence() {
	}

	public Agence(String agenCode, String agenAdresse1, String agenAdresse2, String agenAdresse3, Integer agenCp,
			String agenVille, Set<Vehicule> vehicules, Set<Correspondantvoiture> correspondantvoitures,
			Set<DocumentVehicule> documentVehicules) {
		this.agenCode = agenCode;
		this.agenAdresse1 = agenAdresse1;
		this.agenAdresse2 = agenAdresse2;
		this.agenAdresse3 = agenAdresse3;
		this.agenCp = agenCp;
		this.agenVille = agenVille;
		this.vehicules = vehicules;
		this.correspondantvoitures = correspondantvoitures;
		this.documentVehicules = documentVehicules;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "AGEN_ID", unique = true, nullable = false)
	public Integer getAgenId() {
		return this.agenId;
	}

	public void setAgenId(Integer agenId) {
		this.agenId = agenId;
	}

	@Column(name = "AGEN_CODE", length = 20)
	public String getAgenCode() {
		return this.agenCode;
	}

	public void setAgenCode(String agenCode) {
		this.agenCode = agenCode;
	}

	@Column(name = "AGEN_ADRESSE1", length = 60)
	public String getAgenAdresse1() {
		return this.agenAdresse1;
	}

	public void setAgenAdresse1(String agenAdresse1) {
		this.agenAdresse1 = agenAdresse1;
	}

	@Column(name = "AGEN_ADRESSE2", length = 60)
	public String getAgenAdresse2() {
		return this.agenAdresse2;
	}

	public void setAgenAdresse2(String agenAdresse2) {
		this.agenAdresse2 = agenAdresse2;
	}

	@Column(name = "AGEN_ADRESSE3", length = 60)
	public String getAgenAdresse3() {
		return this.agenAdresse3;
	}

	public void setAgenAdresse3(String agenAdresse3) {
		this.agenAdresse3 = agenAdresse3;
	}

	@Column(name = "AGEN_CP")
	public Integer getAgenCp() {
		return this.agenCp;
	}

	public void setAgenCp(Integer agenCp) {
		this.agenCp = agenCp;
	}

	@Column(name = "AGEN_VILLE", length = 20)
	public String getAgenVille() {
		return this.agenVille;
	}

	public void setAgenVille(String agenVille) {
		this.agenVille = agenVille;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "agence")
	public Set<Vehicule> getVehicules() {
		return this.vehicules;
	}

	public void setVehicules(Set<Vehicule> vehicules) {
		this.vehicules = vehicules;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "agence")
	public Set<Correspondantvoiture> getCorrespondantvoitures() {
		return this.correspondantvoitures;
	}

	public void setCorrespondantvoitures(Set<Correspondantvoiture> correspondantvoitures) {
		this.correspondantvoitures = correspondantvoitures;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "agence")
	public Set<DocumentVehicule> getDocumentVehicules() {
		return this.documentVehicules;
	}

	public void setDocumentVehicules(Set<DocumentVehicule> documentVehicules) {
		this.documentVehicules = documentVehicules;
	}

}