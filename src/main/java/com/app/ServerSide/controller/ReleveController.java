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

import com.app.ServerSide.modal.entities.Releve;
import com.app.ServerSide.service.IReleveService;


@RestController
@RequestMapping("/releves")
public class ReleveController{
	
	@Autowired
	private IReleveService releveService; 
	

	
	@GetMapping("/all")
	public List<Releve>findAll(){
		return  releveService.findAll();
	}
	
	@GetMapping("/get/{id}")
	public Releve findById(@PathVariable("id") Long id) {
		return releveService.findById(id);
	}
	
	@PostMapping("/save")
	public void save(@RequestBody Releve releve) {
		releveService.save(releve);
	}
	
	@PutMapping("/update")
	public void update(@Valid @RequestBody Releve releve) {
		releveService.update(releve);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Long id) {
		releveService.delete(id);
	}
	
	@GetMapping("/bypdl/{id}")
	public List<Releve>getByPdl(@PathVariable("id") Long id){
		return releveService.getByPdl(id);
	}
	
	
}
