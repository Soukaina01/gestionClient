package com.voiceman.cg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.voiceman.cg.entities.RDV;

public interface RdvRepository extends JpaRepository<RDV, Long>{

	
	@Query(nativeQuery = true, value = "SELECT * FROM rdv r WHERE r.id_user = :x")
	public List<RDV> getRDVByUser(@Param("x") Long idUser);
}
