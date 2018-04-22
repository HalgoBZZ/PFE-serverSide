package com.app.ServerSide.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ServerSide.modal.entities.Responsable;
import com.app.ServerSide.service.IResponsableService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/responsables")
public class ResponsableController {
	
	
	@Autowired
	private IResponsableService responsableService;
	
	/*@GetMapping("/authentification/{login}/{pwd}")
	public Responsable authentification(@PathVariable("login")String login, @PathVariable("pwd")String pwd) {
		return responsableDao.authentification(login, pwd);
	}*/
	
	@GetMapping("/all")
	public List<Responsable> findAll(){
		return responsableService.findAll();
	}
	
	@PostMapping("/save")
	public void save(@Valid @RequestBody Responsable responsable) {
		responsableService.save(responsable);
	}
	
	@PutMapping("/update")
	public void update(@Valid @RequestBody Responsable responsable) {
		responsableService.update(responsable);
	}
	
	@GetMapping("/get/{id}")
	public Responsable findById(@PathVariable("id") Long id) {
		return responsableService.findById(id);
	}
	
	/*public void deconnexion() {
		responsableDao.deconnexion();
	}*/

}
