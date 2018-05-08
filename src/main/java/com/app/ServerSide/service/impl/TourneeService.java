package com.app.ServerSide.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.ServerSide.modal.entities.Tournee;
import com.app.ServerSide.repository.TourneeRepository;
import com.app.ServerSide.service.ITourneeService;

@Service
@Transactional
public class TourneeService implements ITourneeService{

	
	@Autowired
	private TourneeRepository tourneeRepository;
	
	
	@Override
	public void save(Tournee t) {
		tourneeRepository.save(t);
	}

	@Override
	public void update(Tournee t) {
		tourneeRepository.save(t);
	}

	@Override
	public void delete(Long id) {
		tourneeRepository.deleteById(id);
	}

	@Override
	public List<Tournee> findAll() {
		return tourneeRepository.findAll();
	}

	@Override
	public Tournee findById(Long id) {
		return tourneeRepository.getOne(id);
	}

	
	

}
