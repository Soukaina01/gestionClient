package com.voiceman.cg.entities;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="UserProjet")
@DiscriminatorValue("UserProjet")
public class UserProjet extends Users{
	
	
	
	  @OneToMany(cascade = CascadeType.PERSIST, mappedBy ="userProjet") 
	  private Set<typeProjet> typeProjet;
	
	
	  @OneToMany(cascade = CascadeType.PERSIST, mappedBy ="user") 
	  private Set<CMD> commands;
	  
	  @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "user") 
	  private Set<RDV> rdvs;
	  
	
	 
		
	public Set<typeProjet> getTypeProjet() {
		return typeProjet;
	}



	public void setTypeProjet(Set<typeProjet> typeProjet) {
		this.typeProjet = typeProjet;
	}



	public Set<CMD> getCommands() {
		return commands;
	}



	public void setCommands(Set<CMD> commands) {
		this.commands = commands;
	}



	public Set<RDV> getRdvs() {
		return rdvs;
	}



	public void setRdvs(Set<RDV> rdvs) {
		this.rdvs = rdvs;
	}



	public UserProjet(Long idUser, String nomUser, String prenomUser, String adresse, String telephone,
			String civilite, String login, String motdepasse) {
		super(idUser, nomUser, prenomUser, adresse, telephone, civilite, login, motdepasse);
	}

	

	public UserProjet() {
		super();
	}

	public UserProjet(String login) {
		super(login);
	}



}
