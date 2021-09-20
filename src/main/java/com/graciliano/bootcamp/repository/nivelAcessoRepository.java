package com.graciliano.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graciliano.bootcamp.model.NivelAcesso;

// PERSISTIR OS DADOS

@Repository
public interface nivelAcessoRepository extends JpaRepository<NivelAcesso, Long> {

	
}
