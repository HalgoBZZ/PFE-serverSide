package com.app.ServerSide.service;

import java.util.List;

import com.app.ServerSide.modal.entities.MesureCadran;

public interface IMesureCadranService extends IService<MesureCadran, Long>{
	
	public List<MesureCadran> getByReleve(Long id);

}
