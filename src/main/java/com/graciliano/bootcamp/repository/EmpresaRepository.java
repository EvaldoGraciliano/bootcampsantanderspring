package com.graciliano.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graciliano.bootcamp.model.Empresa;

// PERSISTIR OS DADOS

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

	
}
