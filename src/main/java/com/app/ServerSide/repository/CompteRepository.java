package com.app.ServerSide.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.ServerSide.security.domain.Compte;

@Repository
public interface CompteRepository extends JpaRepository<Compte,Long>{
	
	//public Compte authentification(String login, String pw);
	
	//public void deconnexion();

}
