package com.app.ServerSide.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ServerSide.modal.entities.Compte;
import com.app.ServerSide.service.ICompteService;

@RestController
@RequestMapping(value="/comptes")
public class CompteController{
	
	@Autowired
	ICompteService compteService;
	
/*	public Compte authentification(String login, String pwd) {
		return compteDao.authentification(login, pwd);
	}
	
	public void deconnxion() {
		compteDao.deconnexion();
	}*/
	
	@PostMapping("/save")
	public void save(@RequestBody Compte compte) {
		compteService.save(compte);
	}
	
	@GetMapping("/all")
	public List <Compte>findAll(){
		return compteService.findAll();
	}
	
	@GetMapping("/get/{id}")
	public Compte findById(@PathVariable("id") Long id) {
		return compteService.findById(id);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Compte compte) {
		compteService.update(compte);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		compteService.delete(id);
	}

}
