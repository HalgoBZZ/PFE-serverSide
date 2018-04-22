package com.app.ServerSide.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.ServerSide.modal.entities.Vocabulaire;
import com.app.ServerSide.modal.entities.Word;

@Repository
public interface WordRepository extends JpaRepository<Word,Long>{
	
	
	public List<Word> findByVocabulaire(Vocabulaire vocabulaire);

}
