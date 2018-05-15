package com.app.ServerSide.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ServerSide.modal.entities.Pdl;
import com.app.ServerSide.service.IPdlService;

@RestController
@RequestMapping("/pdls")
public class PdlController{
	
	@Autowired
	private IPdlService pdlService;
	
	@GetMapping("/save")
	public void save(@RequestBody Pdl pdl) {
		pdlService.save(pdl);
	}
	
	
	@PutMapping("/update")
	public void update(@RequestBody Pdl pdl) {
		pdlService.save(pdl);
		
	}
	
	@DeleteMapping("/delete")
	public void delete(@PathVariable("id")Long id) {
		pdlService.delete(id);
		
	}
	
	
	@GetMapping("/all")
	public List<Pdl> findAll(){
		return pdlService.findAll();
	}

	@GetMapping("/get/{id}")
	public Pdl findById(@PathVariable("id") Long id) {
		return pdlService.findById(id);
	}
	
	@GetMapping("/nonaffecter")
	public List<Pdl>getNonAffecter(){
		return pdlService.getNonAffecter();
	}
	
	@GetMapping("/bytournee/{id}")
	public List<Pdl>getByTournee(@PathVariable("id")Long id){
		return pdlService.ByTournee(id);
	}
}
