package com.app.ServerSide.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.ServerSide.modal.entities.Compte;

@Repository
public interface CompteRepository extends JpaRepository<Compte,Long>{
	
	 @Query("select c from Compte c where c.CMPT_LOGIN = :login")
	public Compte findByLogin(@Param("login")String login);

}
