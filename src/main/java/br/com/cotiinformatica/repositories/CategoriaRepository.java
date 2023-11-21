package br.com.cotiinformatica.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.cotiinformatica.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, UUID> {

	@Query("select c from Categoria c order by c.nome")
	List<Categoria> findAll();

}
