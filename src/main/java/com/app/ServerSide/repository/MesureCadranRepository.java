package com.app.ServerSide.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.ServerSide.modal.entities.MesureCadran;
import com.app.ServerSide.modal.entities.Releve;


@Repository
public interface MesureCadranRepository extends JpaRepository<MesureCadran, Long> {
	
	public List<MesureCadran> findByReleve(Releve releve);

}
