package com.voiceman.cg.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="RDV")
public class RDV implements Serializable{


	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRDV;
	private Date dateNaissance;
	private String nomMaladie;
	private Date date_RDV;
	private Date heure_RDV;
	
	
	  @ManyToOne
	  @JoinColumn(name="id_user", referencedColumnName = "id_user") 
	  private Users user;
	 


		/*
		 * @ManyToOne(cascade= CascadeType.ALL,fetch=FetchType.LAZY) private Clients
		 * client;
		 * 
		 * @ManyToOne(cascade= CascadeType.ALL,fetch=FetchType.LAZY) private Agents
		 * agent;
		 * 
		 * @ManyToOne(cascade= CascadeType.ALL,fetch=FetchType.LAZY) private UserProjet
		 * userProjet;
		 */
	  
	public Long getIdRDV() {
		return idRDV;
	}

	public void setIdRDV(Long idRDV) {
		this.idRDV = idRDV;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getNomMaladie() {
		return nomMaladie;
	}

	public void setNomMaladie(String nomMaladie) {
		this.nomMaladie = nomMaladie;
	}

	public Date getDate_RDV() {
		return date_RDV;
	}

	public void setDate_RDV(Date date_RDV) {
		this.date_RDV = date_RDV;
	}

	public Date getHeure_RDV() {
		return heure_RDV;
	}

	public void setHeure_RDV(Date heure_RDV) {
		this.heure_RDV = heure_RDV;
	}


	public RDV(Long idRDV, Date dateNaissance, String nomMaladie, Date date_RDV, Date heure_RDV) {
		super();
		this.idRDV = idRDV;
		this.dateNaissance = dateNaissance;
		this.nomMaladie = nomMaladie;
		this.date_RDV = date_RDV;
		this.heure_RDV = heure_RDV;
	
	}



	public RDV(Long idRDV, Date dateNaissance, String nomMaladie, Date date_RDV, Date heure_RDV, Users user) {
		super();
		this.idRDV = idRDV;
		this.dateNaissance = dateNaissance;
		this.nomMaladie = nomMaladie;
		this.date_RDV = date_RDV;
		this.heure_RDV = heure_RDV;
		this.user = user;
	}

	public RDV() {
		super();
	}

	
	
}
