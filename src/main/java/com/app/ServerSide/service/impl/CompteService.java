package com.app.ServerSide.service.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.ServerSide.modal.entities.AppRole;
import com.app.ServerSide.modal.entities.Compte;
import com.app.ServerSide.repository.CompteRepository;
import com.app.ServerSide.repository.RoleRepository;
import com.app.ServerSide.service.ICompteService;

@Service
@Transactional
public class CompteService  implements ICompteService {
	
	@Autowired
	private CompteRepository compteRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public void save(Compte t) {
		String hashPW=bCryptPasswordEncoder.encode(t.getCMPT_PWD());
		t.setCMPT_PWD(hashPW);
		compteRepository.save(t);
	}

	@Override
	public void update(Compte t) {
		compteRepository.save(t);
	}

	@Override
	public void delete(Long id) {
		compteRepository.deleteById(id);		
	}

	@Override
	public List<Compte> findAll() {
		return compteRepository.findAll();
	}

	@Override
	public Compte findById(Long id) {
		return compteRepository.getOne(id);
	}

	@Override
	public AppRole saveRole(AppRole role) {
		return roleRepository.save(role);
	}

	@Override
	public void addRoleToUser(String login, String roleName) {
		AppRole role=roleRepository.findByRoleName(roleName);
		Compte cmpt=compteRepository.findByLogin(login);
		cmpt.getRoles().add(role);
	}

	@Override
	public Compte findUserByLogin(String login) {
		return compteRepository.findByLogin(login);
	}

	@Override
	public boolean isResponsable(String login) {
		Compte cmpt=findUserByLogin(login);
		Collection<AppRole> roles=cmpt.getRoles();
		for (AppRole role : roles) {
			if (role.getNAME_ROLE().equals("RESPONSABLE"))
			return true;
		}
		return false;
	}

	
}
