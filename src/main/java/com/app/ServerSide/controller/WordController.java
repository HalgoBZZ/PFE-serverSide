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

import com.app.ServerSide.modal.entities.Word;
import com.app.ServerSide.service.IWordService;



@RestController
@RequestMapping("/api/words")
public class WordController {
	
	@Autowired
	private IWordService wordService;

	
	@GetMapping("/all")
	public List<Word>findAll(){
		return  wordService.findAll();
	}
	
	@GetMapping("/get/{id}")
	public Word findById(@PathVariable("id") Long id) {
		return wordService.findById(id);
	}
	
	@PostMapping("/save")
	public void save(@RequestBody Word word) {
		wordService.save(word);
	}
	
	@PutMapping("/update")
	public void update(@Valid @RequestBody Word word) {
		wordService.update(word);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Long id) {
		wordService.delete(id);
	}
	
}
