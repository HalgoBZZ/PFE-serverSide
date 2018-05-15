package com.app.ServerSide.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ServerSide.modal.entities.Planification;
import com.app.ServerSide.modal.types.PlanificationState;
import com.app.ServerSide.service.IPlanificationService;

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
		planification.setPLANIF_STATE(PlanificationState.ACTIF);
		planificationService.save(planification);
	}
	
	@PostMapping("/update")
	public void update(@Valid @RequestBody Planification planification) {
		planificationService.update(planification);
	}
	
	@GetMapping("/get/{id}")
	public Planification findOne(@PathVariable("id")Long id) {
		return planificationService.findById(id);
	}

}
