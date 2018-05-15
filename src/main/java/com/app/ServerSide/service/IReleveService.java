package com.app.ServerSide.service;

import java.util.List;

import com.app.ServerSide.modal.entities.Releve;

public interface IReleveService extends IService<Releve, Long>{
	
	public List<Releve> getByPdl(Long id);
	
	
}
