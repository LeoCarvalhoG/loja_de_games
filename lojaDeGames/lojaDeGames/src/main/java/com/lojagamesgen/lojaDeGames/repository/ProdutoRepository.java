package com.lojagamesgen.lojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojagamesgen.lojaDeGames.model.Produto;

/**
 * @author Amanda
 * @version 1.0
 */
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	/**
	 * Pesquisa coluna 'nome_produto' da tabela 'produto'.
	 * 
	 * @author Amanda
	 * @param nomeProduto
	 * @return lista com os nomes dos produtos.
	 * @since 1.0
	 */
	public List<Produto> findByNomeProdutoContainingIgnoreCase(String nomeProduto);

	/**
	 * Pesquisa coluna 'tema' da tabela 'produto'.
	 * 
	 * @author Amanda
	 * @param nomeProduto
	 * @return lista com temas
	 * @since 1.0
	 */
	public List<Produto> findByTemaContainingIgnoreCase(String tema);
}
