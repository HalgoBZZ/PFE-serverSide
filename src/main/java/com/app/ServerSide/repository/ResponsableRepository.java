package com.app.ServerSide.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.ServerSide.modal.entities.Responsable;

@Repository
public interface ResponsableRepository extends JpaRepository<Responsable,Long>{
	
	@Query("select c from Responsable c where c.CMPT_LOGIN = :login")
	public Responsable findByLogin(@Param("login")String login);
	
	@Query("select c from Responsable c where c.CMPT_LOGIN= :login and c.CMPT_EMAIL= :email")
	public Responsable findByEmail(@Param("login")String login, @Param("email") String email);

}
