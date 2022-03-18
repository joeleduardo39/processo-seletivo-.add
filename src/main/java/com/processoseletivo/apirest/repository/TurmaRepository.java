package com.processoseletivo.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.processoseletivo.apirest.models.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Long> {
	
	Turma findById(long id);

}
