package com.app.ServerSide.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.ServerSide.modal.entities.Releveur;

@Repository
public interface ReleveurRepository extends JpaRepository<Releveur,Long>{
	
	@Query("select c from Releveur c where c.CMPT_LOGIN = :login")
	public Releveur findByLogin(@Param("login")String login);

	@Query("select c from Releveur c where c.responsable.CMPT_LOGIN = :login")
	public List<Releveur> findByResponsable(@Param("login")String login);

}
