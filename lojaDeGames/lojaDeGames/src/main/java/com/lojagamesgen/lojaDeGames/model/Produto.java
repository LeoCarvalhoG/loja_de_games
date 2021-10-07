package com.lojagamesgen.lojaDeGames.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Classe espelho da tabela Categoria no banco loja_de_games.
 * 
 * @author Priscila
 * @version 1.1
 */
@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduto;

	@NotBlank
	private String nomeProduto;

	@NotBlank
	@Size(min = 1, max = 300)
	private String descricao;

	@NotNull
	@Column(length = 10, precision = 3)
	private float preco;

	@NotBlank
	private String tema;

	@NotBlank
	private String subcategoria;

	@ManyToOne
	@JoinColumn(name = "fk_categoria")
	@JsonIgnoreProperties({ "produtos" })
	private Categoria categoriaRelacionada;

	@ManyToOne
	@JoinColumn(name = "fk_usuario")
	@JsonIgnoreProperties({ "produtos" })
	private Usuario usuarioRelacionado;

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

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getSubcategoria() {
		return subcategoria;
	}

	public void setSubcategoria(String subcategoria) {
		this.subcategoria = subcategoria;
	}

	public Categoria getCategoriaRelacionada() {
		return categoriaRelacionada;
	}

	public void setCategoriaRelacionada(Categoria categoriaRelacionada) {
		this.categoriaRelacionada = categoriaRelacionada;
	}

	public Usuario getUsuarioRelacionado() {
		return usuarioRelacionado;
	}

	public void setUsuarioRelacionado(Usuario usuarioRelacionado) {
		this.usuarioRelacionado = usuarioRelacionado;
	}

}