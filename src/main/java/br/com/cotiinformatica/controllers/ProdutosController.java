package br.com.cotiinformatica.controllers;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dtos.ProdutoGetDto;
import br.com.cotiinformatica.dtos.ProdutoPostDto;
import br.com.cotiinformatica.dtos.ProdutoPutDto;
import br.com.cotiinformatica.entities.Categoria;
import br.com.cotiinformatica.entities.Fornecedor;
import br.com.cotiinformatica.entities.Produto;
import br.com.cotiinformatica.repositories.CategoriaRepository;
import br.com.cotiinformatica.repositories.FornecedorRepository;
import br.com.cotiinformatica.repositories.ProdutoRepository;

@RestController
@RequestMapping(value = "/api/produtos")
public class ProdutosController {

	@Autowired
	ProdutoRepository produtoRepository;

	@Autowired
	CategoriaRepository categoriaRepository;

	@Autowired
	FornecedorRepository fornecedorRepository;

	@Autowired
	ModelMapper modelMapper;

	@PostMapping()
	public ProdutoGetDto post(@RequestBody ProdutoPostDto dto) {

		Produto produto = modelMapper.map(dto, Produto.class);

		produto.setIdProduto(UUID.randomUUID());

		Fornecedor fornecedor = fornecedorRepository.findById(dto.getIdFornecedor()).get();
		produto.setFornecedor(fornecedor);

		Categoria categoria = categoriaRepository.findById(dto.getIdCategoria()).get();
		produto.setCategoria(categoria);

		produtoRepository.save(produto);

		Produto resultado = produtoRepository.find(produto.getIdProduto());
		return modelMapper.map(resultado, ProdutoGetDto.class);
	}

	@PutMapping()
	public ProdutoGetDto put(@RequestBody ProdutoPutDto dto) {

		Produto produto = new Produto();

		produto.setIdProduto(dto.getIdProduto());
		produto.setNome(dto.getNome());
		produto.setPreco(new BigDecimal(dto.getPreco()));
		produto.setQuantidade(dto.getQuantidade());

		Fornecedor fornecedor = fornecedorRepository.findById(dto.getIdFornecedor()).get();
		produto.setFornecedor(fornecedor);

		Categoria categoria = categoriaRepository.findById(dto.getIdCategoria()).get();
		produto.setCategoria(categoria);

		produtoRepository.save(produto);

		Produto resultado = produtoRepository.find(produto.getIdProduto());
		return modelMapper.map(resultado, ProdutoGetDto.class);
	}

	@DeleteMapping("{idProduto}")

	public ProdutoGetDto delete(@PathVariable("idProduto") UUID idProduto) {

		Produto produto = produtoRepository.find(idProduto);

		produtoRepository.delete(produto);

		return modelMapper.map(produto, ProdutoGetDto.class);
	}

	@GetMapping()
	public List<ProdutoGetDto> get() {

		List<Produto> produtos = produtoRepository.findAll();

		List<ProdutoGetDto> result = modelMapper.map(produtos, new TypeToken<List<ProdutoGetDto>>() {
		}.getType());

		return result;
	}

	@GetMapping("{idProduto}")
	public ProdutoGetDto getById(@PathVariable("idProduto") UUID idProduto) {

		Produto produto = produtoRepository.find(idProduto);

		ProdutoGetDto dto = modelMapper.map(produto, ProdutoGetDto.class);

		return dto;
	}
}
