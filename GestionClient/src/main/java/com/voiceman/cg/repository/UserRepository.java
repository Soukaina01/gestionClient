package com.voiceman.cg.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.voiceman.cg.entities.Users;

public interface UserRepository extends JpaRepository<Users, Long>{

	@Query(nativeQuery = true, value = "SELECT * FROM utilisateurs u WHERE u.type_user like :x")
	public Optional<Users> getUserByType(@Param("x") String type);
	
	@Query(nativeQuery = true, value = "SELECT * FROM utilisateurs u WHERE u.login like :x")
	public Optional<Users> getUserByLogin(@Param("x") String login);
	
		
}
