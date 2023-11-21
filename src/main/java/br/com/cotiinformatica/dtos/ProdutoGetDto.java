package br.com.cotiinformatica.dtos;

import java.util.UUID;

public class ProdutoGetDto {
	private UUID idProduto;
	private String nome;
	private Double preco;
	private Integer quantidade;
	private FornecedorGetDto fornecedor;
	private CategoriaGetDto categoria;

	public UUID getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(UUID idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public FornecedorGetDto getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(FornecedorGetDto fornecedor) {
		this.fornecedor = fornecedor;
	}

	public CategoriaGetDto getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaGetDto categoria) {
		this.categoria = categoria;
	}
}
