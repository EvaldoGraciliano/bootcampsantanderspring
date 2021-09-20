package com.graciliano.bootcamp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graciliano.bootcamp.model.Calendario;
import com.graciliano.bootcamp.repository.CalendarioRepository;

// REGRA DE NEG�CIO

@Service
public class CalendarioService {

	@Autowired
	CalendarioRepository calendarioRepository;

	public Calendario saveCalendario(Calendario calendario) {
		return calendarioRepository.save(calendario);

	}

	public Calendario updateCalendario(Calendario calendario) {
		return calendarioRepository.save(calendario);

	}
	
	public List<Calendario> findAll() {
		return calendarioRepository.findAll();
	}

	public Optional<Calendario> findByID(Long id) {
		return calendarioRepository.findById(id);
	}
	
	public void DeleteByID(Long id) {
		calendarioRepository.deleteById(id);
	}
}
