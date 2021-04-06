package com.voiceman.cg.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.voiceman.cg.entities.CMD;
import com.voiceman.cg.repository.CmdRepository;
import com.voiceman.cg.service.ICmdService;

@Service
@Transactional
public class CmdServiceImpl implements ICmdService{

	@Autowired
	private CmdRepository cmdDao;
	

	
	@Override
	public CMD addCmd(CMD cmd) {
		
		return cmdDao.save(cmd);
	}

	@Override
	public boolean validerCMD(Long idCmd) {
		return false;
	}

	@Override
	public int deleteCMD(int idCMD) {
		return 0;
	}

	@Override
	public CMD getCmdById(Long idCmd) {
		return cmdDao.findById(idCmd).get();
	}

	

	@Override
	public List<CMD> getCmdByUser(Long idUser) {
		
		return null;
	}

	@Override
	public List<CMD> getAllCmds() {
		
		return cmdDao.findAll();
	}

	@Override
	public CMD getCmdByDate(Date dateCmd) {
		
		return null;
	}

	@Override
	public boolean updateCMD(CMD cmd) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
