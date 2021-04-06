package com.voiceman.cg.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.voiceman.cg.entities.Users;
import com.voiceman.cg.repository.UserRepository;
import com.voiceman.cg.service.IUserService;

@Service
@Transactional
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserRepository userDao;
	

	
	@Override
	public Users authentification(String login, String password) {
		
		return null;
	}


	@Override
	public Users getUserByType(String typeUser) {
		return userDao.getUserByType(typeUser).get();
	}

	@Override
	public List<Users> getAllUser() {
		return userDao.findAll();
	}


	@Override
	public Users addUser(Users user) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean updateUser(Users user) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public int deleteUser(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
