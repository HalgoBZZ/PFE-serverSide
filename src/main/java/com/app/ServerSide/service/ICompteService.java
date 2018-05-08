package com.app.ServerSide.service;

import com.app.ServerSide.modal.entities.AppRole;
import com.app.ServerSide.modal.entities.Compte;

public interface ICompteService extends IService<Compte, Long> {
	
	public AppRole saveRole(AppRole role);
	
	public void addRoleToUser(String username, String roleName);
	
	public Compte findUserByLogin(String login);
}
