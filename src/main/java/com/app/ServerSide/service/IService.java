package com.app.ServerSide.service;

import java.io.Serializable;
import java.util.List;

public interface IService <T,ID extends Serializable>{
	
	public void save(T t);
	
	public void update(T t);
	
	public void delete(ID id);
	
	public List<T> findAll();
	
	public T findById(ID id);

}
