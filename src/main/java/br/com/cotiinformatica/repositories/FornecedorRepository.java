package br.com.cotiinformatica.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.cotiinformatica.entities.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, UUID> {

	@Query("select f from Fornecedor f order by f.nome")
	List<Fornecedor> findAll();

}
