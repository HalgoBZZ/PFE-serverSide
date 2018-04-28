package com.app.ServerSide.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ServerSide.modal.entities.MesureCadran;
import com.app.ServerSide.repository.MesureCadranRepository;
import com.app.ServerSide.service.IMesureCadranService;

@Service
public class MesureCadranService implements IMesureCadranService{

	
	@Autowired
	private MesureCadranRepository mesureRepository;
	
	@Override
	public void save(MesureCadran t) {
		mesureRepository.save(t);		
	}

	@Override
	public void update(MesureCadran t) {
		mesureRepository.save(t);
	}

	@Override
	public void delete(Long id) {
		mesureRepository.deleteById(id);
	}

	@Override
	public List<MesureCadran> findAll() {
		return mesureRepository.findAll();
	}

	@Override
	public MesureCadran findById(Long id) {
		return mesureRepository.getOne(id);
	}



}
