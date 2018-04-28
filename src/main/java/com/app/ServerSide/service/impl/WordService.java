package com.app.ServerSide.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ServerSide.modal.entities.Word;
import com.app.ServerSide.repository.WordRepository;
import com.app.ServerSide.service.IWordService;

@Service
public class WordService  implements IWordService{
	
	@Autowired
	private WordRepository wordRepository;

	@Override
	public void save(Word t) {
		wordRepository.save(t);
	}

	@Override
	public void update(Word t) {
		wordRepository.save(t);
	}

	@Override
	public void delete(Long id) {
		wordRepository.deleteById(id);
	}

	@Override
	public List<Word> findAll() {
		return wordRepository.findAll();
	}

	@Override
	public Word findById(Long id) {
		return wordRepository.getOne(id);
	}

	
}
