package br.com.cotiinformatica.entities;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_fornecedor")
public class Fornecedor {
	@Id
	@Column(name = "idfornecedor")
	private UUID idFornecedor;

	@Column(name = "nome", length = 100, nullable = false)
	private String nome;

	@Column(name = "cnpj", length = 20, nullable = false, unique = true)
	private String cnpj;
	@OneToMany(mappedBy = "fornecedor")
	private List<Produto> produtos;

	public Fornecedor() {
		// TODO Auto-generated constructor stub
	}

	public Fornecedor(UUID idFornecedor, String nome, String cnpj, List<Produto> produtos) {
		super();
		this.idFornecedor = idFornecedor;
		this.nome = nome;
		this.cnpj = cnpj;
		this.produtos = produtos;
	}

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

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public String toString() {
		return "Fornecedor [idFornecedor=" + idFornecedor + ", nome=" + nome + ", cnpj=" + cnpj + ", produtos="
				+ produtos + "]";
	}
}
