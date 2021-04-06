package com.voiceman.cg.service;

import java.util.Date;
import java.util.List;

import com.voiceman.cg.entities.CMD;

public interface ICmdService {
	
	public CMD addCmd(CMD cmd);
	
	public boolean updateCMD(CMD cmd);
	
	public int deleteCMD(int idCMD);
	
	public boolean validerCMD(Long idCmd);
	
	public CMD getCmdById(Long idCmd);
	
	public List<CMD> getCmdByUser(Long idUser);
	
	public List<CMD> getAllCmds();
	
	public CMD getCmdByDate(Date dateCmd);
	

}
