package com.app.ServerSide.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.ServerSide.modal.entities.Secteur;
import com.app.ServerSide.repository.SecteurRepository;
import com.app.ServerSide.service.ISecteurService;

@Service
@Transactional
public class SecteurService  implements ISecteurService{
	
	
	@Autowired
	private SecteurRepository secteurRepository;

	@Override
	public void save(Secteur t) {
		secteurRepository.save(t);
	}

	@Override
	public void update(Secteur t) {
		secteurRepository.save(t);
	}

	@Override
	public void delete(Long id) {
		secteurRepository.deleteById(id);		
	}

	@Override
	public List<Secteur> findAll() {
		return secteurRepository.findAll();
	}

	@Override
	public Secteur findById(Long id) {
		return secteurRepository.getOne(id);
	}

	
	
}
