package com.app.ServerSide.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ServerSide.modal.entities.Vocabulaire;
import com.app.ServerSide.repository.VocabulaireRepository;
import com.app.ServerSide.service.IVocabulaireService;

@Service
public class VocabulaireService implements IVocabulaireService{
	
	@Autowired
	private VocabulaireRepository vocabulaireRepository;

	@Override
	public void save(Vocabulaire t) {
		vocabulaireRepository.save(t);
	}

	@Override
	public void update(Vocabulaire t) {
		vocabulaireRepository.save(t);
	}

	@Override
	public void delete(Long id) {
		vocabulaireRepository.deleteById(id);
	}

	@Override
	public List<Vocabulaire> findAll() {
		return vocabulaireRepository.findAll();
	}

	@Override
	public Vocabulaire findById(Long id) {
		return vocabulaireRepository.getOne(id);
	}

	
}
