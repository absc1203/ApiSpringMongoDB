package com.example.empresaTeste.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.empresaTeste.model.Funcionario;

public interface FuncionarioRepository extends MongoRepository<Funcionario, String> {

}
