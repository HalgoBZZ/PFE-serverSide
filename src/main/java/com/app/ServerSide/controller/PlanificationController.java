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

import com.app.ServerSide.modal.entities.Planification;
import com.app.ServerSide.service.IPlanificationService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/planifications")
public class PlanificationController{

	@Autowired
	private IPlanificationService planificationService;
	
	@GetMapping("/all")
	public List<Planification> findAll(){
		return planificationService.findAll();
	}
	
	@DeleteMapping("/delete/{planification}")
	public void delete(@PathVariable("planification")Long planification) {
		planificationService.delete(planification);
	}
	
	@PostMapping("/save")
	public void save(@Valid @RequestBody Planification planification) {
		planificationService.save(planification);
	}
	
	@PutMapping("/update")
	public void update(@Valid @RequestBody Planification planification) {
		planificationService.update(planification);
	}
	
	@GetMapping("/get/{id}")
	public Planification findOne(@PathVariable("id")Long id) {
		return planificationService.findById(id);
	}

}
