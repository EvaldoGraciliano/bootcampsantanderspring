package com.graciliano.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graciliano.bootcamp.model.Localidade;

// PERSISTIR OS DADOS

@Repository
public interface LocalidadeRepository extends JpaRepository<Localidade, Long> {

	
}
