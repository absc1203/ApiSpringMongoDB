package com.example.empresaTeste.service;

import java.util.List;

import com.example.empresaTeste.model.Funcionario;

public interface FuncionarioService {
	
	public List<Funcionario> getAll();
	
	public Funcionario getFuncionarioById(String id);
	
	public Funcionario createFuncionario(Funcionario funcionario);

}
