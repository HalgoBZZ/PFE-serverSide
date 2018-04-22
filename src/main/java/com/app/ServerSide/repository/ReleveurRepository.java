package com.app.ServerSide.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.ServerSide.modal.entities.Releveur;

@Repository
public interface ReleveurRepository extends JpaRepository<Releveur,Long>{
	
	//public Releveur authentification(String login, String pwd);
	//public void deconnexion();

}
