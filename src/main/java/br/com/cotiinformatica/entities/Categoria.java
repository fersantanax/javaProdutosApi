package br.com.cotiinformatica.entities;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_categoria")
public class Categoria {

	@Id
	@Column (name = "idcategoria")
	private UUID idCategoria;
	
	@Column (name = "nome", length = 50, nullable = false, unique = true)
	private String nome;
	@OneToMany(mappedBy = "categoria")
	private List<Produto> produtos;

	public Categoria() {
		// TODO Auto-generated constructor stub
	}

	public Categoria(UUID idCategoria, String nome, List<Produto> produtos) {
		super();
		this.idCategoria = idCategoria;
		this.nome = nome;
		this.produtos = produtos;
	}

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

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", nome=" + nome + ", produtos=" + produtos + "]";
	}
}
