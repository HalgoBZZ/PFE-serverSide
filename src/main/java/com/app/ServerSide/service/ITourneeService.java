package com.app.ServerSide.service;
import java.util.List;

import com.app.ServerSide.modal.entities.Tournee;

public interface ITourneeService extends IService<Tournee, Long> {
	
	public List<Tournee> getNonAffecter();
	

}
