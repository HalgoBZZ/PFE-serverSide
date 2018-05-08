package com.app.ServerSide.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.ServerSide.modal.entities.AppRole;

public interface RoleRepository extends JpaRepository<AppRole, Long>{
	
	 @Query("select r from AppRole r where r.NAME_ROLE = :roleName")
	public AppRole findByRoleName(@Param("roleName")String roleName);

}
