package com.app.ServerSide.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.ServerSide.modal.entities.Planification;
import com.app.ServerSide.repository.PlanificationRepository;
import com.app.ServerSide.service.IPlanificationService;

@Service
@Transactional
public class PlanificationService implements IPlanificationService{
	
	
	@Autowired
	private PlanificationRepository planificationRepository;

	@Override
	public void save(Planification t) {
		planificationRepository.save(t);
		
	}

	@Override
	public void update(Planification t) {
		planificationRepository.save(t);
		
	}

	@Override
	public void delete(Long id) {
		planificationRepository.deleteById(id);
	}

	@Override
	public List<Planification> findAll() {
		return planificationRepository.findAll();
	}

	@Override
	public Planification findById(Long id) {
		return planificationRepository.getOne(id);
	}

}
