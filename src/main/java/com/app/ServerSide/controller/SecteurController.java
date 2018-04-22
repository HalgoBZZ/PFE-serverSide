package com.app.ServerSide.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ServerSide.modal.entities.Secteur;
import com.app.ServerSide.service.ISecteurService;

@RestController
@RequestMapping("/secteurs")
public class SecteurController {
	
	@Autowired
	private ISecteurService secteurService; 
	
	@GetMapping("/all")
	public List<Secteur>findAll(){
		return  secteurService.findAll();
	}
	
	@GetMapping("/get/{id}")
	public Secteur findById(@PathVariable("id") Long id) {
		return secteurService.findById(id);
	}
	
	@PostMapping("/save")
	public void save(@RequestBody Secteur secteur) {
		secteurService.save(secteur);
	}
	
	@PutMapping("/update")
	public void update(@Valid @RequestBody Secteur secteur) {
		secteurService.update(secteur);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Long id) {
		secteurService.delete(id);
	}
	

}
