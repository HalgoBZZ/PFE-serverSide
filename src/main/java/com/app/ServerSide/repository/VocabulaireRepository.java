package com.app.ServerSide.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.ServerSide.modal.entities.Releve;
import com.app.ServerSide.modal.entities.Vocabulaire;

@Repository
public interface VocabulaireRepository extends JpaRepository<Vocabulaire,Long> {
	
	public List<Vocabulaire> findByReleve(Releve releve);

}
