package com.app.ServerSide.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ServerSide.modal.entities.Compte;
import com.app.ServerSide.repository.CompteRepository;
import com.app.ServerSide.service.ICompteService;

@Service
public class CompteService  implements ICompteService {
	
	@Autowired
	private CompteRepository compteRepository;

	@Override
	public void save(Compte t) {
		compteRepository.save(t);
	}

	@Override
	public void update(Compte t) {
		compteRepository.save(t);
	}

	@Override
	public void delete(Long id) {
		compteRepository.deleteById(id);		
	}

	@Override
	public List<Compte> findAll() {
		return compteRepository.findAll();
	}

	@Override
	public Compte findById(Long id) {
		return compteRepository.getOne(id);
	}

	
}
