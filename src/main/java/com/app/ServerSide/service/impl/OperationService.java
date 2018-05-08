package com.app.ServerSide.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.ServerSide.modal.entities.Operation;
import com.app.ServerSide.modal.entities.Tournee;
import com.app.ServerSide.repository.OperationRepository;
import com.app.ServerSide.service.IOperationService;

@Service
@Transactional
public class OperationService implements IOperationService{

	
	@Autowired
	private OperationRepository operationRepository;

	@Override
	public void save(Operation operation) {
		operationRepository.save(operation);
		
	}

	@Override
	public void update(Operation operation) {
		operationRepository.save(operation);
		
	}

	@Override
	public void delete(Long id) {
		operationRepository.deleteById(id);
		
	}

	@Override
	public List<Operation> findAll() {
		return operationRepository.findAll();
	}

	@Override
	public Operation findById(Long id) {
		return operationRepository.getOne(id);	
	}

	@Override
	public List<Operation> findByTournee(Tournee tournee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAll() {
		operationRepository.deleteAll();
	}
	
	
}
