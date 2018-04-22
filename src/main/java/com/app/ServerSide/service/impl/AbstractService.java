package com.app.ServerSide.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ServerSide.repository.GenericRepository;
import com.app.ServerSide.service.IService;

@SuppressWarnings(value = { "unchecked" })

@Service
public abstract class AbstractService<T,ID extends Serializable> implements IService<T,ID>{

	@Autowired
	private GenericRepository<T,ID> repository;
	
	
	@Override
	public void save(T t) {
		repository.save(t);
	}

	@Override
	public void update(T t) {
		repository.save(t);
		
	}

	@Override
	public void delete(ID id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<T> findAll() {
		return repository.findAll();
	}

	@Override
	public T findById(ID id) {
		return (T) repository.findById(id);
	}

	

}
