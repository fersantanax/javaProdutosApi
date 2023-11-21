package br.com.cotiinformatica.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.cotiinformatica.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, UUID> {

	@Query("select p from Produto p " + "join fetch p.categoria c " + "join fetch p.fornecedor f " + "order by p.nome")
	List<Produto> findAll();

	@Query("select p from Produto p " + "join fetch p.categoria c " + "join fetch p.fornecedor f "
			+ "where idProduto = :param")
	Produto find(@Param("param") UUID idProduto);
}
