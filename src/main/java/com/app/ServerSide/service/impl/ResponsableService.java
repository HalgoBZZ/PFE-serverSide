package com.app.ServerSide.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ServerSide.modal.entities.Responsable;
import com.app.ServerSide.repository.ResponsableRepository;
import com.app.ServerSide.service.IResponsableService;


@Service
public class ResponsableService implements IResponsableService {
	
	
	@Autowired
	private ResponsableRepository responsableRepository;

	@Override
	public void save(Responsable t) {
		responsableRepository.save(t);
		
	}

	@Override
	public void update(Responsable t) {
		responsableRepository.save(t);
	}

	@Override
	public void delete(Long id) {
		responsableRepository.deleteById(id);
		
	}

	@Override
	public List<Responsable> findAll() {
		return responsableRepository.findAll();
	}

	@Override
	public Responsable findById(Long id) {
		return responsableRepository.getOne(id);
	}

	
	
}
