package com.app.ServerSide.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ServerSide.modal.entities.Tournee;
import com.app.ServerSide.service.ITourneeService;



@RestController
@RequestMapping("/tournees")
public class TourneeController{

	@Autowired
	private ITourneeService tourneeService;
	
	/*public List<Tournee>findNonAffectee(){
		return tourneeDao.findNonAffectee();
	}
	
	public List<Tournee>findAvalider(){
		return tourneeDao.findAvalider();
	}
	
	public void affecter(Tournee tournee, Releveur releveur) {
		tourneeDao.affecter(tournee, releveur);
	}
	
	public void charger() {
		tourneeDao.charger();
	}
	
	public void decharger(List<Tournee> tournees) {
		tourneeDao.decharger(tournees);
	}
	
	public void valider(List<Tournee>tournees) {
		tourneeDao.valider(tournees);
	}
	
	public void decomposer(Tournee tournee) {
		tourneeDao.decomposer(tournee);
	}*/
	
	/*************************************planning*************************************/
	@GetMapping("/all")
	public List<Tournee>findAll(){
		return tourneeService.findAll();
	}
}
