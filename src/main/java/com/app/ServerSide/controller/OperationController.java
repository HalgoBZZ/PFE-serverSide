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

import com.app.ServerSide.modal.entities.Operation;
import com.app.ServerSide.service.IOperationService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("operations")
public class OperationController {
	
	@Autowired
	private IOperationService operationService;
	
	
	/********************Historic*******************/
	
	@GetMapping("/all")
	public List<Operation>findAll(){
		return  operationService.findAll();
	}
	
	@GetMapping("/get/{id}")
	public Operation findById(@PathVariable("id") Long id) {
		return operationService.findById(id);
	}
	
	@PostMapping("/save")
	public void save(@RequestBody Operation operation) {
		operationService.save(operation);
	}
	
	@PutMapping("/update")
	public void update(@Valid @RequestBody Operation operation) {
		operationService.update(operation);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Long id) {
		operationService.delete(id);
	}
	
	@DeleteMapping("/delete/all")
	public void deleteAll() {
		operationService.deleteAll();
	}
}
