package br.com.cotiinformatica.controllers;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dtos.FornecedorGetDto;
import br.com.cotiinformatica.entities.Fornecedor;
import br.com.cotiinformatica.repositories.FornecedorRepository;

@RestController
@RequestMapping(value = "/api/fornecedores")
public class FornecedoresController {
	@Autowired
	FornecedorRepository fornecedorRepository;
	
	@Autowired
	ModelMapper modelMapper;

	@GetMapping()
	public List<FornecedorGetDto> get() {


		List<Fornecedor> fornecedores = fornecedorRepository.findAll();
		List<FornecedorGetDto> result = modelMapper.map(fornecedores, new TypeToken<List<FornecedorGetDto>>() {
		}.getType());

		return result;
	}
}
