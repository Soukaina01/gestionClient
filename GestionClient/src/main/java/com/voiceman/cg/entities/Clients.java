package com.voiceman.cg.entities;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="CLIENTS")
@DiscriminatorValue("client")
public class Clients extends Users{

	
	
	  @OneToMany(cascade = CascadeType.PERSIST, mappedBy ="user") 
	  private Set<CMD> commands;
	  
	  @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "user") 
	  private Set<RDV> rdvs;
	  
	  
	 

	public Clients(Long idUser, String nomUser, String prenomUser, String adresse, String telephone, String civilite) {
		super(idUser, nomUser, prenomUser, adresse, telephone, civilite);
	}

	
	public Clients() {
		super();
	}

	public Clients(String login) {
		super(login);
	}


	
	
	
	
}
