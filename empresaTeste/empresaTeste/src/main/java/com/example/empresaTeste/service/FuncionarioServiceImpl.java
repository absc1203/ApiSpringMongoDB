package com.example.empresaTeste.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.empresaTeste.model.Funcionario;
import com.example.empresaTeste.repository.FuncionarioRepository;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

	@Autowired
	private FuncionarioRepository funcionarioRepository;

	@Override
	public List<Funcionario> getAll() {
		return this.funcionarioRepository.findAll();
	}

	@Override
	public Funcionario getFuncionarioById(String id) {
		return this.funcionarioRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Funcionario não existe"));
	}

	@Override
	public Funcionario createFuncionario(Funcionario funcionario) {
		Funcionario chefe = this.funcionarioRepository.findById(funcionario.getChefe().getId())
				.orElseThrow(() -> new IllegalArgumentException("Chefe inexistente"));

		funcionario.setChefe(chefe);

		return this.funcionarioRepository.save(funcionario);
	}

	@Override
	public List<Funcionario> getAllByName(String nome) {
		return this.funcionarioRepository.findByNome(nome);
	}

}
