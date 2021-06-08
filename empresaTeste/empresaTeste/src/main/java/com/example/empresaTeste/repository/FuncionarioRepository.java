package com.example.empresaTeste.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.empresaTeste.model.Funcionario;

public interface FuncionarioRepository extends MongoRepository<Funcionario, String> {
	
	public List<Funcionario> findByNome(String nome);

}
