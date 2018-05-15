package com.app.ServerSide.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ServerSide.modal.entities.Tournee;
import com.app.ServerSide.service.ITourneeService;



@RestController
@RequestMapping("/tournees")
public class TourneeController{

	@Autowired
	private ITourneeService tourneeService;
	
	
	@GetMapping("/nonaffecter")
	public List<Tournee> getNonAffecter(){
		return tourneeService.getNonAffecter();
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Tournee tournee) {
		tourneeService.save(tournee);
	}
	
	@GetMapping("/get/{id}")
	public Tournee getByID(@PathVariable("id")Long id) {
		return tourneeService.findById(id);
	}
	/*************************************planning*************************************/
	@GetMapping("/all")
	public List<Tournee>findAll(){
		return tourneeService.findAll();
	}
}
