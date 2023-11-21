package br.com.cotiinformatica.dtos;

import java.util.UUID;

public class CategoriaGetDto {

	private UUID idCategoria;
	private String nome;

	public UUID getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(UUID idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
