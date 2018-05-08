package com.app.ServerSide.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.ServerSide.modal.entities.Releveur;
import com.app.ServerSide.repository.ReleveurRepository;
import com.app.ServerSide.service.IReleveurService;


@Service
@Transactional
public class ReleveurService implements IReleveurService {
	
	
	@Autowired
	private ReleveurRepository releveurRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public List<Releveur> findByResponsable(String login) {
		return releveurRepository.findByResponsable(login);
	}

	@Override
	public void save(Releveur t) {
		String hashPW=bCryptPasswordEncoder.encode(t.getCMPT_PWD());
		t.setCMPT_PWD(hashPW);
		releveurRepository.save(t);	
	}

	@Override
	public void update(Releveur t) {
		releveurRepository.save(t);
	}

	@Override
	public void delete(Long id) {
		releveurRepository.deleteById(id);
	}

	@Override
	public List<Releveur> findAll() {
		return releveurRepository.findAll();
	}

	@Override
	public Releveur findById(Long id) {
		return releveurRepository.getOne(id);
	}

	@Override
	public Releveur findByLogin(String login) {
		return releveurRepository.findByLogin(login);
	}

	

}
