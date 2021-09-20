package com.graciliano.bootcamp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graciliano.bootcamp.model.JornadaTrabalho;
import com.graciliano.bootcamp.repository.jornadaTrabalhoRepository;

// REGRA DE NEG�CIO

@Service
public class jornadaTrabalhoService {

	@Autowired
	jornadaTrabalhoRepository jornadaRepository;

	public JornadaTrabalho saveJornada(JornadaTrabalho jornada) {
		return jornadaRepository.save(jornada);

	}

	public JornadaTrabalho updateJornada(JornadaTrabalho jornada) {
		return jornadaRepository.save(jornada);

	}
	
	public List<JornadaTrabalho> findAll() {
		return jornadaRepository.findAll();
	}

	public Optional<JornadaTrabalho> findByID(Long id) {
		return jornadaRepository.findById(id);
	}
	
	public void DeleteByID(Long id) {
		jornadaRepository.deleteById(id);
	}
}
