package com.example.empresaTeste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.empresaTeste.model.Funcionario;
import com.example.empresaTeste.service.FuncionarioService;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

	@Autowired
	private FuncionarioService funcionarioService;

	@GetMapping
	public List<Funcionario> getAll() {
		return this.funcionarioService.getAll();
	}

	@GetMapping("/{id}")
	public Funcionario getFuncionarioById(@PathVariable String id) {
		return this.funcionarioService.getFuncionarioById(id);

	}
	
	@GetMapping("/search")
	public List<Funcionario> getAllByName(@RequestParam("nome") String nome){
		return this.funcionarioService.getAllByName(nome);
	}

	@PostMapping
	public Funcionario createFuncionario(@RequestBody Funcionario funcionario) {
		return this.funcionarioService.createFuncionario(funcionario);
	}
}
