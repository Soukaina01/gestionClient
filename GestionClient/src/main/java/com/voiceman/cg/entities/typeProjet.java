package com.voiceman.cg.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="TYPE_PROJET")
public class typeProjet implements Serializable{


	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTypeProjet;
	private String labelle_Type;
	
	
	
	@ManyToOne(cascade= CascadeType.ALL,fetch=FetchType.LAZY)
	private UserProjet userProjet;
	
	
	
	public Long getIdTypeProjet() {
		return idTypeProjet;
	}

	public void setIdTypeProjet(Long idTypeProjet) {
		this.idTypeProjet = idTypeProjet;
	}

	public String getLabelle_Type() {
		return labelle_Type;
	}

	public void setLabelle_Type(String labelle_Type) {
		this.labelle_Type = labelle_Type;
	}

	

	public UserProjet getUserProjet() {
		return userProjet;
	}

	public void setUserProjet(UserProjet userProjet) {
		this.userProjet = userProjet;
	}

	public typeProjet(Long idTypeProjet, String labelle_Type, UserProjet userProjet) {
		super();
		this.idTypeProjet = idTypeProjet;
		this.labelle_Type = labelle_Type;
		this.userProjet = userProjet;
	}

	
	public typeProjet(Long idTypeProjet, String labelle_Type) {
		super();
		this.idTypeProjet = idTypeProjet;
		this.labelle_Type = labelle_Type;
	}

	

	public typeProjet() {
		super();
	}

	
	
	
}
