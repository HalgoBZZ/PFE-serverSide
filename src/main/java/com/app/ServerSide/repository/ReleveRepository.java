package com.app.ServerSide.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.ServerSide.modal.entities.Releve;

@Repository
public interface ReleveRepository extends JpaRepository<Releve,Long>{
	
	
	@Query("select r from Releve r where r.pdl.PDL_ID = :id")
	public List<Releve> getByPdl(@Param("id")Long id);

}
