package com.app.ServerSide.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.ServerSide.modal.entities.Responsable;

@Repository
public interface ResponsableRepository extends JpaRepository<Responsable,Long>{
	
	//public Responsable authentification(String login, String pwd);
	
	//public void deconnexion();
	

}
