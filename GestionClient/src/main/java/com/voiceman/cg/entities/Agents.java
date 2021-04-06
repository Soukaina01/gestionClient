package com.voiceman.cg.entities;

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
@Table(name="AGENTS")
@DiscriminatorValue("agent")

public class Agents extends Users {

	
	private String photo;
	
	  @OneToMany(cascade = CascadeType.PERSIST, mappedBy ="user") 
	  private Set<CMD> commands;
	  
	  @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "user") 
	  private Set<RDV> rdvs;
	  
	  

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}




	public Agents(Long idUser, String nomUser, String prenomUser, String adresse, String telephone,
			String civilite, String login, String motdepasse, String photo, Set<CMD> commands, Set<RDV> rdvs) {
		super(idUser, nomUser, prenomUser, adresse, telephone, civilite, login, motdepasse);
		this.photo = photo;
		this.commands = commands;
		this.rdvs = rdvs;
	}

	
	public Agents(Long idUser, String nomUser, String prenomUser, String adresse, String telephone, String civilite,
			String login, String motdepasse, String photo) {
		super(idUser, nomUser, prenomUser, adresse, telephone, civilite, login, motdepasse);
		this.photo = photo;
	}

	public Agents() {
		super();
	}

	public Agents(String login) {
		super(login);
	}

	


	
	
}
