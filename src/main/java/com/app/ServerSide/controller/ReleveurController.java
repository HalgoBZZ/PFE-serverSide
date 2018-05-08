package com.app.ServerSide.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ServerSide.modal.entities.Compte;
import com.app.ServerSide.modal.entities.Releveur;
import com.app.ServerSide.service.ICompteService;
import com.app.ServerSide.service.IReleveurService;

@RestController
@RequestMapping(value="/releveurs")
public class ReleveurController {
	
	@Autowired
	private IReleveurService releveurService;
	
	@Autowired
	private ICompteService compteService;
	
	
	@GetMapping("/get/{id}")
	public Releveur findById(Long id) {
		return releveurService.findById(id);
	}
	
	@GetMapping("/all")
	public List<Releveur>findAll(){
		return releveurService.findAll();
	}
	
	@PostMapping("/save")
	public void save(@RequestBody Releveur releveur) {
		Compte cmpt=compteService.findUserByLogin(releveur.getCMPT_LOGIN());
		if(cmpt!=null)throw new RuntimeException("Cet utilisateur existe déja!!");
		releveurService.save(releveur);
		compteService.addRoleToUser(releveur.getCMPT_LOGIN(), "RELEVEUR");
	}
	
	@DeleteMapping("/delete/{releveur}")
	public void delete(@PathVariable("releveur") Long releveur) {
		releveurService.delete(releveur);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Releveur releveur) {
		
		releveurService.update(releveur);
	}
	
	@GetMapping("/byresponsable/{login}")
	public List<Releveur> findByResponsable(@PathVariable("login")String login){
		return releveurService.findByResponsable(login);
	}
	
	@GetMapping("/getbylogin/{login}")
	public Releveur findByLogin(@PathVariable("login") String login) {
		return releveurService.findByLogin(login);
	}
	
}
