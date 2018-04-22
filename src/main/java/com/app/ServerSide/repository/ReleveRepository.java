package com.app.ServerSide.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.ServerSide.modal.entities.Pdl;
import com.app.ServerSide.modal.entities.Releve;

@Repository
public interface ReleveRepository extends JpaRepository<Releve,Long>{
	
	
	public List<Releve> findByPdl(Pdl pdl);

}
