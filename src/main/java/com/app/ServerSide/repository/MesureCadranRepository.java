package com.app.ServerSide.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.ServerSide.modal.entities.MesureCadran;


@Repository
public interface MesureCadranRepository extends JpaRepository<MesureCadran, Long> {
	
	@Query("select m from MesureCadran m where m.releve.RELE_ID = :id")
	public List<MesureCadran> findByReleve(@Param("id")Long id);

}
