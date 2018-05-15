package com.app.ServerSide.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.ServerSide.modal.entities.Releve;
import com.app.ServerSide.repository.ReleveRepository;
import com.app.ServerSide.service.IReleveService;

@Service
@Transactional
public class ReleveService implements IReleveService{
	
	
	@Autowired
	private ReleveRepository releveRepository;

	@Override
	public void save(Releve t) {
		releveRepository.save(t);		
	}

	@Override
	public void update(Releve t) {
		releveRepository.save(t);
	}

	@Override
	public void delete(Long id) {
		releveRepository.deleteById(id);
	}

	@Override
	public List<Releve> findAll() {
		return releveRepository.findAll();
	}

	@Override
	public Releve findById(Long id) {
		return releveRepository.getOne(id);
	}

	@Override
	public List<Releve> getByPdl(Long id) {
		return releveRepository.getByPdl(id);
	}

	
	

}
