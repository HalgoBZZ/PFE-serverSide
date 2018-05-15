package com.app.ServerSide.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.ServerSide.modal.entities.Pdl;
import com.app.ServerSide.modal.entities.Tournee;


@Repository
public interface PdlRepository extends JpaRepository<Pdl,Long> {

	@Query("select p from Pdl p where p.tournee.releveur is null")
	public List<Pdl> getNonAffecter();
	
	@Query("select p from Pdl p where p.tournee = :tour")
	public List<Pdl> ByTournee(@Param("tour")Tournee t);

}
