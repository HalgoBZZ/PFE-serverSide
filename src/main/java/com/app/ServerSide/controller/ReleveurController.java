package com.app.ServerSide.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ServerSide.modal.entities.Releveur;
import com.app.ServerSide.modal.entities.Responsable;
import com.app.ServerSide.service.IReleveurService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(value="/releveurs")
public class ReleveurController {
	
	@Autowired
	private IReleveurService releveurService;
	
	/*@GetMapping("/getreleveur/{login}/{pwd}")
	public Releveur authentification(@PathVariable("login")String login, @PathVariable("pwd")String pwd) {
		return releveurDao.authentification(login, pwd);
	}*/
	
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
		releveurService.save(releveur);
	}
	
	@DeleteMapping("/delete/{releveur}")
	public void delete(@PathVariable("releveur") Long releveur) {
		releveurService.delete(releveur);
	}
	
	@PutMapping("/update")
	public void update(@Valid @RequestBody Releveur releveur) {
		releveurService.update(releveur);
	}
	
	@GetMapping("/byresponsable")
	public List<Releveur> findByResponsable(Responsable responsable){
		return releveurService.findByResponsable(responsable);
	}
	/*@PostMapping("/logout")
	public void deconnexion() {
		releveurDao.deconnexion();
	}*/

}
