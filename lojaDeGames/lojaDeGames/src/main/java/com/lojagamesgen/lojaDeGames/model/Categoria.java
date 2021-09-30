package com.lojagamesgen.lojaDeGames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategoria;
	
	@NotBlank
	private String nomeCategoria;
	
	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		idCategoria = idCategoria;
	}

	public String getCategoria() {
		return nomeCategoria;
	}

	public void setCategoria(String categoria) {
		nomeCategoria = nomeCategoria;
	}

	/**
	 * @author Leonardo
	 * @version 1.0
	 */
	
	
	
}
