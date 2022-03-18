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

import com.processoseletivo.apirest.models.Escola;
import com.processoseletivo.apirest.repository.EscolaRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Produtos")
@CrossOrigin(origins = "*")
public class EscolaController {

	@Autowired
	EscolaRepository escolaRepository;

	@GetMapping("/escolas")
	@ApiOperation(value = "Retorna uma lista de escolas")
	public List<Escola> listaEscolas() {
		return escolaRepository.findAll();

	}

	@GetMapping("/escola/{id}")
	@ApiOperation(value = "Retorna uma escola unica")
	public Escola listaEscolaUnica(@PathVariable(value = "id") long id) {
		return escolaRepository.findById(id);

	}

	@PostMapping("/escola")
	@ApiOperation(value = "Salva uma escola")
	public Escola salvaEscola(@RequestBody Escola escola) {
		return escolaRepository.save(escola);
	}

	@DeleteMapping("/escola")
	@ApiOperation(value = "Deleta uma escola")
	public void deletaEscola(@RequestBody Escola escola) {
		escolaRepository.delete(escola);
	}

	@PutMapping("/escola")
	@ApiOperation(value = "Atualiza uma escola")
	public Escola atualizaEscola(@RequestBody Escola escola) {
		return escolaRepository.save(escola);
	}

}
