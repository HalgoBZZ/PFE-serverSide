package com.app.ServerSide.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.ServerSide.modal.entities.Pdl;
import com.app.ServerSide.repository.PdlRepository;
import com.app.ServerSide.repository.TourneeRepository;
import com.app.ServerSide.service.IPdlService;

@Service
@Transactional
public class PdlService  implements IPdlService{
	
	@Autowired
	private PdlRepository pdlRepository;
	
	@Autowired
	private TourneeRepository tourneeRepository;

	@Override
	public void save(Pdl t) {
		pdlRepository.save(t);
	}

	@Override
	public void update(Pdl t) {
		pdlRepository.save(t);
	}

	@Override
	public void delete(Long id) {
		pdlRepository.deleteById(id);
	}

	@Override
	public List<Pdl> findAll() {
		return pdlRepository.findAll();
	}

	@Override
	public Pdl findById(Long id) {
		return pdlRepository.getOne(id);
	}

	@Override
	public List<Pdl> getNonAffecter() {
		return pdlRepository.getNonAffecter();
	}

	@Override
	public List<Pdl> ByTournee(Long id) {
		return pdlRepository.ByTournee(tourneeRepository.getTournee(id));
	}

	

}
