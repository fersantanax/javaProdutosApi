package br.com.cotiinformatica.entities;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_produto")
public class Produto {
	@Id
	@Column(name = "idproduto")
	private UUID idProduto;
	@Column(name = "nome", length = 100, nullable = false)
	private String nome;
	@Column(name = "preco", precision = 10, scale = 2, nullable = false)
	private BigDecimal preco;
	@Column(name = "quantidade", nullable = false)
	private Integer quantidade;
	@ManyToOne
	@JoinColumn(name = "idcategoria", nullable = false)
	private Categoria categoria;
	@ManyToOne
	@JoinColumn(name = "idfornecedor", nullable = false)
	private Fornecedor fornecedor;

	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public Produto(UUID idProduto, String nome, BigDecimal preco, Integer quantidade, Categoria categoria,
			Fornecedor fornecedor) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.categoria = categoria;
		this.fornecedor = fornecedor;
	}

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

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade
				+ ", categoria=" + categoria + ", fornecedor=" + fornecedor + "]";
	}
}
