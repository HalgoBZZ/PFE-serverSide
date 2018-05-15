package com.app.ServerSide.service;

import java.util.List;

import com.app.ServerSide.modal.entities.Pdl;

public interface IPdlService extends IService<Pdl,Long>{

	public List<Pdl> getNonAffecter();
	
	public List<Pdl> ByTournee(Long id);

}
