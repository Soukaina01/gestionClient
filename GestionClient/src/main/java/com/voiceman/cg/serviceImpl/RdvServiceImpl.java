package com.voiceman.cg.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.voiceman.cg.entities.RDV;
import com.voiceman.cg.repository.RdvRepository;
import com.voiceman.cg.service.IRdvService;

@Service
@Transactional
public class RdvServiceImpl implements IRdvService{

	@Autowired
	private RdvRepository rdvDao;
	@Override
	public RDV addRdv(RDV rdv) {
		
		return rdvDao.save(rdv);
	}

	@Override
	public boolean validerRdv(Long idRdv) {
		
		return false;
	}

	@Override
	public RDV getRdvById(Long idRdv) {
		return rdvDao.findById(idRdv).get();
	}

	@Override
	public RDV getRdvByUser(Long idUser) {
		
		return null;
	}


	@Override
	public List<RDV> getAllRdvs() {
		
		return rdvDao.findAll();
	}

	@Override
	public RDV getRdvByDate(Date dateRdv) {
		
		return null;
	}

	@Override
	public boolean updateRDV(RDV rdv) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int deleteRDV(int idRDV) {
		return 0;
		

	}

}
