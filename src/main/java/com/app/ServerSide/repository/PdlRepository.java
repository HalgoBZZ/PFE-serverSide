package com.app.ServerSide.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.ServerSide.modal.entities.Pdl;
import com.app.ServerSide.modal.entities.Tournee;


@Repository
public interface PdlRepository extends JpaRepository<Pdl,Long> {
	
	public List<Pdl> findByTournee(Tournee tournee);

}
