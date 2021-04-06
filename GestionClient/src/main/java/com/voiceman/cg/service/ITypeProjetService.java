package com.voiceman.cg.service;

import java.util.List;

import com.voiceman.cg.entities.typeProjet;

public interface ITypeProjetService {

	public typeProjet addType(typeProjet type);
	
	public typeProjet getTypeProjetById(Long idTypeProjet);
	
	public List<typeProjet> getAllTypeProjet();
	
}
