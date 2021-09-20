package com.graciliano.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graciliano.bootcamp.model.CategoriaUsuario;

// PERSISTIR OS DADOS

@Repository
public interface categoriaUsuarioRepository extends JpaRepository<CategoriaUsuario, Long> {

	
}
