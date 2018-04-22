package com.app.ServerSide.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ServerSide.modal.entities.MesureCadran;
import com.app.ServerSide.service.IMesureCadranService;


@RestController
@RequestMapping("/mesurecadrans")
public class MesureCadranController{
	
	@Autowired
	private IMesureCadranService mesureCadranService;
	
	@GetMapping("/all")
	public List<MesureCadran> findAll() {
		return  mesureCadranService.findAll();
	}
	
	
	@GetMapping("/get/{id}")
	public MesureCadran findById(@PathVariable("id") Long id) {
		return mesureCadranService.findById(id);
	}
	
	
	@PostMapping("/save")
	public void Save(@RequestBody MesureCadran mc) {
		mesureCadranService.save(mc);	
	}
	
	@PutMapping("/update")
	public void update(@RequestBody MesureCadran mc) {
		mesureCadranService.update(mc);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Long id) {
		mesureCadranService.delete(id);
	}

}
