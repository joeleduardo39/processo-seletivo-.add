package com.processoseletivo.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.processoseletivo.apirest.models.Escola;

public interface EscolaRepository extends JpaRepository<Escola, Long> {

	Escola findById(long id);

}
