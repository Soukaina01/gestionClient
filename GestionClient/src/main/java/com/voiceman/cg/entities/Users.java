package com.voiceman.cg.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name="USERS")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_USER",
discriminatorType=DiscriminatorType.STRING, length=10)

public abstract class Users implements Serializable{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id_user")
	private Long idUser;
	
	private String nomUser;
	private String prenomUser;
	private String adresse;
	private String telephone;
	private String civilite;
	private String login;
	private String motdepasse;
	private boolean active;
	
	
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getNomUser() {
		return nomUser;
	}
	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}
	public String getPrenomUser() {
		return prenomUser;
	}
	public void setPrenomUser(String prenomUser) {
		this.prenomUser = prenomUser;
	}
	
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getCivilite() {
		return civilite;
	}
	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMotdepasse() {
		return motdepasse;
	}
	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}
	public Users(Long idUser, String nomUser, String prenomUser, String adresse, String telephone, String civilite,
			String login, String motdepasse) {
		super();
		this.idUser = idUser;
		this.nomUser = nomUser;
		this.prenomUser = prenomUser;
		this.adresse = adresse;
		this.telephone = telephone;
		this.civilite = civilite;
		this.login = login;
		this.motdepasse = motdepasse;
	}
	
	
	
	public Users(Long idUser, String nomUser, String prenomUser, String adresse, String telephone, String civilite) {
		super();
		this.idUser = idUser;
		this.nomUser = nomUser;
		this.prenomUser = prenomUser;
		this.adresse = adresse;
		this.telephone = telephone;
		this.civilite = civilite;
	}
	public Users() {
		super();
	}
	
	public Users(String login) {
		super();
		this.login = login;
	}
	

	
}
