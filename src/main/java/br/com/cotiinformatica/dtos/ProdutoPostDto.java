package br.com.cotiinformatica.dtos;

import java.util.UUID;

public class ProdutoPostDto {

	private String nome;
	private Double preco;
	private Integer quantidade;
	private UUID idFornecedor;
	private UUID idCategoria;

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

	public UUID getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(UUID idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public UUID getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(UUID idCategoria) {
		this.idCategoria = idCategoria;
	}

}
