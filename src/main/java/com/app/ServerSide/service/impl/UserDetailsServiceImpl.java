package com.app.ServerSide.service.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.ServerSide.modal.entities.Compte;

@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private CompteService compteService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Compte cmpt=compteService.findUserByLogin(username);
		if(cmpt==null)throw new UsernameNotFoundException(username);
		Collection<GrantedAuthority> authorities=new ArrayList<>();
		cmpt.getRoles().forEach(r->{
			authorities.add(new SimpleGrantedAuthority(r.getNAME_ROLE()));
		});
		return new User(cmpt.getCMPT_LOGIN(), cmpt.getCMPT_PWD(), authorities);
	}

}
