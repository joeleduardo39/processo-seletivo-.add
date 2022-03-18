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

import com.processoseletivo.apirest.models.Endereco;
import com.processoseletivo.apirest.repository.EnderecoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Produtos")
@CrossOrigin(origins = "*")
public class EnderecoController {

	@Autowired
	EnderecoRepository enderecoRepository;

	@GetMapping("/enderecos")
	@ApiOperation(value = "Retorna uma lista de enderecos")
	public List<Endereco> listaEnderecos() {
		return enderecoRepository.findAll();

	}

	@GetMapping("/endereco/{id}")
	@ApiOperation(value = "Retorna um endereco unico")
	public Endereco listaEnderecoUnica(@PathVariable(value = "id") long id) {
		return enderecoRepository.findById(id);

	}

	@PostMapping("/endereco")
	@ApiOperation(value = "Salva um endereco")
	public Endereco salvaEndereco(@RequestBody Endereco endereco) {
		return enderecoRepository.save(endereco);
	}

	@DeleteMapping("/endereco")
	@ApiOperation(value = "Deleta um endereco")
	public void deletaEndereco(@RequestBody Endereco endereco) {
		enderecoRepository.delete(endereco);
	}

	@PutMapping("/endereco")
	@ApiOperation(value = "Atualiza um endereco")
	public Endereco atualizaEndereco(@RequestBody Endereco endereco) {
		return enderecoRepository.save(endereco);
	}

}
