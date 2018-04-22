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

import com.app.ServerSide.modal.entities.Vocabulaire;
import com.app.ServerSide.service.IVocabulaireService;

@RestController
@RequestMapping("/api/vocabulaires")
public class VocabulaireController{
	
	@Autowired
	private IVocabulaireService vocabulaireService;
	
	
	@GetMapping("/all")
	public List<Vocabulaire>findAll(){
		return  vocabulaireService.findAll();
	}
	
	@GetMapping("/get/{id}")
	public Vocabulaire findById(@PathVariable("id") Long id) {
		return vocabulaireService.findById(id);
	}
	
	@PostMapping("/save")
	public void save(@RequestBody Vocabulaire vocabulaire) {
		vocabulaireService.save(vocabulaire);
	}
	
	@PutMapping("/update")
	public void update(@Valid @RequestBody Vocabulaire vocabulaire) {
		vocabulaireService.update(vocabulaire);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Long id) {
		vocabulaireService.delete(id);
	}

}
