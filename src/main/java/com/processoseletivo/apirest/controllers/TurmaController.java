package com.processoseletivo.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.processoseletivo.apirest.models.Turma;
import com.processoseletivo.apirest.repository.TurmaRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Produtos")
@CrossOrigin(origins = "*")
public class TurmaController {

	@Autowired
	TurmaRepository turmaRepository;

	@GetMapping("/turmas")
	@ApiOperation(value = "Retorna uma lista de turmas")
	public List<Turma> listaTurmas() {
		return turmaRepository.findAll();

	}

	@GetMapping("/turma/{id}")
	@ApiOperation(value = "Retorna uma turma unica")
	public Turma listaTurmaUnica(@PathVariable(value = "id") long id) {
		return turmaRepository.findById(id);

	}

	@PostMapping("/turma")
	@ApiOperation(value = "Salva uma turma")
	public Turma salvaTurma(@RequestBody Turma turma) {
		return turmaRepository.save(turma);
	}

	@DeleteMapping("/turma")
	@ApiOperation(value = "Deleta uma turma")
	public void deletaTurma(@RequestBody Turma turma) {
		turmaRepository.delete(turma);
	}

	@PutMapping("/turma")
	@ApiOperation(value = "Atualiza uma turma")
	public Turma atualizaTurma(@RequestBody Turma turma) {
		return turmaRepository.save(turma);
	}

}
