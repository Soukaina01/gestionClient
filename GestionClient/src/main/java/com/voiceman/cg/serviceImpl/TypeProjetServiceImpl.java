package com.voiceman.cg.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.voiceman.cg.entities.typeProjet;
import com.voiceman.cg.repository.TypeProjetRepository;
import com.voiceman.cg.service.ITypeProjetService;

@Service
@Transactional
public class TypeProjetServiceImpl implements ITypeProjetService{

	@Autowired
	private  TypeProjetRepository daoTypeProjet;
	
	@Override
	public typeProjet getTypeProjetById(Long idTypeProjet) {
		return daoTypeProjet.findById(idTypeProjet).get();
	}

	@Override
	public List<typeProjet> getAllTypeProjet() {
		return daoTypeProjet.findAll();
	}

	@Override
	public typeProjet addType(typeProjet type) {
		return daoTypeProjet.save(type);
	}

}
