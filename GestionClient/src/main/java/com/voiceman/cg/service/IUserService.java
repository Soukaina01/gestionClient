package com.voiceman.cg.service;

import java.util.List;

import com.voiceman.cg.entities.CMD;
import com.voiceman.cg.entities.Users;

public interface IUserService {

	public Users authentification(String login, String password);
	
	public Users addUser(Users user);
	
	public boolean updateUser(Users user);
	
	public int deleteUser(int id);
		
	public Users getUserByType(String typeUser);
	
	public List<Users> getAllUser();
	
}
