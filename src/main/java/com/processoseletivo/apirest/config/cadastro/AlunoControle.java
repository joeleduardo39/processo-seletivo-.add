package com.processoseletivo.apirest.config.cadastro;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.processoseletivo.apirest.repository.AlunoRepository;

@Controller
public class AlunoControle {

	public AlunoRepository alunoRepository;
	
	public AlunoControle(AlunoRepository alunoRepository) {
		this.alunoRepository = alunoRepository;
	}
	
	@GetMapping("/cadastro/alunos")
	public String alunos(Model model) {
		model.addAttribute("listaAlunos", alunoRepository.findAll());
		return "cadastro/alunos/index";
	}
}
