package com.app.ServerSide.service;

import com.app.ServerSide.modal.entities.Responsable;

public interface IResponsableService extends IService<Responsable,Long>{
	
	public Responsable findByLogin(String login);
	
	public Responsable findByEmail(String login, String email);

}
