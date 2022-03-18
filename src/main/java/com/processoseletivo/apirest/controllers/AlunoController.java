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

import com.processoseletivo.apirest.models.Aluno;
import com.processoseletivo.apirest.repository.AlunoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Produtos")
@CrossOrigin(origins = "*")
public class AlunoController {

	@Autowired
	AlunoRepository alunoRepository;

	@GetMapping("/alunos")
	@ApiOperation(value = "Retorna uma lista de alunos")
	public List<Aluno> listaAlunos() {
		return alunoRepository.findAll();

	}

	@GetMapping("/aluno/{id}")
	@ApiOperation(value = "Retorna um aluno unico")
	public Aluno listaAlunoUnica(@PathVariable(value = "id") long id) {
		return alunoRepository.findById(id);

	}

	@PostMapping("/aluno")
	@ApiOperation(value = "Salva um aluno")
	public Aluno salvaAluno(@RequestBody Aluno aluno) {
		return alunoRepository.save(aluno);
	}

	@DeleteMapping("/aluno")
	@ApiOperation(value = "Deleta um aluno")
	public void deletaAluno(@RequestBody Aluno aluno) {
		alunoRepository.delete(aluno);
	}

	@PutMapping("/aluno")
	@ApiOperation(value = "Atualiza um aluno")
	public Aluno atualizaAluno(@RequestBody Aluno aluno) {
		return alunoRepository.save(aluno);
	}

}
