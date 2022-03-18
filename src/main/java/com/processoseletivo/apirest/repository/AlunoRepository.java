package com.processoseletivo.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.processoseletivo.apirest.models.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

	Aluno findById(long id);

}
