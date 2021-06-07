package com.example.empresaTeste.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

	@GetMapping
	public void getAll () {
		
	}
	
	@GetMapping("/{id}")
	public void getFuncionarioById(@PathVariable String id) {
		
	}
	
	@PostMapping
	public void createFuncionario(@RequestBody Object funcionario) {
		
	}
}
