package com.app.ServerSide.service;

import java.util.List;

import com.app.ServerSide.modal.entities.Operation;
import com.app.ServerSide.modal.entities.Tournee;

public interface IOperationService extends IService<Operation,Long>{
	
	public List<Operation>findByTournee(Tournee tournee);
	
	public void deleteAll();
	

}
