package com.app.ServerSide.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.ServerSide.modal.entities.Tournee;

@Repository
public interface TourneeRepository extends JpaRepository<Tournee,Long> {
	
	@Query("select t from Tournee t where t.releveur is null")
	public List<Tournee> getNonAffecter();
	
	@Query("select t from Tournee t where t.TOUR_ID = :id")
	public Tournee getTournee(@Param("id")Long id);
	
	
}
