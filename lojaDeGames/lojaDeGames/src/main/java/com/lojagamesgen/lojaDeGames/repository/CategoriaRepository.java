package com.lojagamesgen.lojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.lojagamesgen.lojaDeGames.model.Categoria;

/**
 * @author Victor
 * @version 1.0
 */
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	/**
	 * Metodo utilizado para realizar pesquisa pela coluna nome_categoria da tabela
	 * categoria.
	 * 
	 * @author Victor
	 * @param nomeCategoria
	 * @return Lista com nomeCategoria(nome da categoria).
	 * @since 1.0
	 */
	public List<Categoria> findAllByNomeCategoriaContainingIgnoreCase(String nomeCategoria);
}