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
@Table(name="COMMANDES")
public class CMD implements Serializable{


		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long idCommande;
		private String nomCommande;
		private Date date_CMD;
		private Date heure_CMD;
		private int quantite_CMD;
		
	
	
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
		 * 
		 * @ManyToOne(cascade= CascadeType.ALL,fetch=FetchType.LAZY)
		
		  private UserProjet userProjet;
		  */
	
	public Long getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}

	public String getNomCommande() {
		return nomCommande;
	}

	public void setNomCommande(String nomCommande) {
		this.nomCommande = nomCommande;
	}

	public Date getDate_CMD() {
		return date_CMD;
	}

	public void setDate_CMD(Date date_CMD) {
		this.date_CMD = date_CMD;
	}

	public Date getHeure_CMD() {
		return heure_CMD;
	}

	public void setHeure_CMD(Date heure_CMD) {
		this.heure_CMD = heure_CMD;
	}

	public int getQuantite_CMD() {
		return quantite_CMD;
	}

	public void setQuantite_CMD(int quantite_CMD) {
		this.quantite_CMD = quantite_CMD;
	}

	 
	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public CMD(Long idCommande, String nomCommande, Date date_CMD, Date heure_CMD, int quantite_CMD) {
		super();
		this.idCommande = idCommande;
		this.nomCommande = nomCommande;
		this.date_CMD = date_CMD;
		this.heure_CMD = heure_CMD;
		this.quantite_CMD = quantite_CMD;
		 
	}


	public CMD(Long idCommande, String nomCommande, Date date_CMD, Date heure_CMD, int quantite_CMD, Users user) {
		super();
		this.idCommande = idCommande;
		this.nomCommande = nomCommande;
		this.date_CMD = date_CMD;
		this.heure_CMD = heure_CMD;
		this.quantite_CMD = quantite_CMD;
		this.user = user;
	}

	public CMD() {
		super();
	}

 
	
	
}
