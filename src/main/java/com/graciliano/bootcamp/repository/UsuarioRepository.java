package com.graciliano.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graciliano.bootcamp.model.Usuario;

// PERSISTIR OS DADOS

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	
}
