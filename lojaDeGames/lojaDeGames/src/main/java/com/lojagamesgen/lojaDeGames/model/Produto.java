package com.lojagamesgen.lojaDeGames.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

/**
 * Classe espelho da tabela Categoria no banco loja_de_games.
 * 
 * @author Priscila
 * @since 1.0
 */
@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduto;

	@NotBlank
	private String nomeProduto;

	@NotBlank
	private String descricao;

	@NotBlank
	@Column(length = 10, precision = 2)
	private double preco;

	@NotBlank
	private boolean tema;

	@NotBlank
	private boolean subcategoria;

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isTema() {
		return tema;
	}

	public void setTema(boolean tema) {
		this.tema = tema;
	}

	public boolean isSubcategoria() {
		return subcategoria;
	}

	public void setSubcategoria(boolean subcategoria) {
		this.subcategoria = subcategoria;
	}
}
