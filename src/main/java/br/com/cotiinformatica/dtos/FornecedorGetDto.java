package br.com.cotiinformatica.dtos;

import java.util.UUID;

public class FornecedorGetDto {

	private UUID idFornecedor;
	private String nome;
	private String cnpj;

	public UUID getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(UUID idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
