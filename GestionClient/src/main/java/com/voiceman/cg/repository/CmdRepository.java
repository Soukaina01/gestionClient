package com.voiceman.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voiceman.cg.entities.CMD;

public interface CmdRepository extends JpaRepository<CMD, Long> {
	
}
