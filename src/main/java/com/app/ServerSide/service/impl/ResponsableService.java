package com.app.ServerSide.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.ServerSide.modal.entities.Responsable;
import com.app.ServerSide.repository.ResponsableRepository;
import com.app.ServerSide.service.IResponsableService;


@Service
@Transactional
public class ResponsableService implements IResponsableService {
	
	
	@Autowired
	private ResponsableRepository responsableRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public void save(Responsable t) {
		String hashPW=bCryptPasswordEncoder.encode(t.getCMPT_PWD());
		t.setCMPT_PWD(hashPW);
		responsableRepository.save(t);
		
	}

	@Override
	public void update(Responsable t) {
		String hashPW=bCryptPasswordEncoder.encode(t.getCMPT_PWD());
		t.setCMPT_PWD(hashPW);
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

	@Override
	public Responsable findByLogin(String login) {
		return responsableRepository.findByLogin(login);
	}

	@Override
	public Responsable findByEmail(String login, String email) {
		return responsableRepository.findByEmail(login, email);
				
	}

	
	
}
