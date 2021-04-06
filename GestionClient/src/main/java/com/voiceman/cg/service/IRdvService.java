package com.voiceman.cg.service;

import java.util.Date;
import java.util.List;

import com.voiceman.cg.entities.RDV;

public interface IRdvService {

	public RDV addRdv(RDV rdv);
	
	public boolean validerRdv(Long idRdv);
	
	public boolean updateRDV(RDV rdv);
	
	public int deleteRDV(int idRDV);
	
	public RDV getRdvById(Long idRdv);
	
	public RDV getRdvByUser(Long idUser);
	
	public List<RDV> getAllRdvs();
	
	public RDV getRdvByDate(Date dateRdv);
}
