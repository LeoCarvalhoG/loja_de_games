package com.lojagamesgen.lojaDeGames.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lojagamesgen.lojaDeGames.model.Produto;
import com.lojagamesgen.lojaDeGames.repository.ProdutoRepository;

/**
 * @author Amanda
 * @version 1.0
 */
@RestController
@RequestMapping("/produtos")
@CrossOrigin("*")
public class ProdutoController {

	private @Autowired ProdutoRepository repository;

	@GetMapping
	public ResponseEntity<List<Produto>> GetAll() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/{id}") // vai usar o valor de "id"
	public ResponseEntity<Produto> GetById(@PathVariable(value = "id") long idProduto) {
		return repository.findById(idProduto).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/nomeProduto/{nomeProduto}")
	public ResponseEntity<List<Produto>> GetByNomeProduto(@PathVariable(value = "nomeProduto") String nomeProduto) {
		return ResponseEntity.ok(repository.findByNomeProdutoContainingIgnoreCase(nomeProduto));
	}

	@GetMapping("/tema/{tema}")
	public ResponseEntity<List<Produto>> GetByTema(@PathVariable(value = "tema") String tema) {
		return ResponseEntity.ok(repository.findByTemaContainingIgnoreCase(tema));
	}

	@PostMapping
	public ResponseEntity<Produto> Post(@Valid @RequestBody Produto novoProduto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(novoProduto));
	}

	@PutMapping
	public ResponseEntity<Produto> Put(@Valid @RequestBody Produto novoProduto) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(novoProduto));
	}

	@DeleteMapping("/{id}")
	public void Delete(@PathVariable(value = "id") long idProduto) {
		repository.deleteById(idProduto);
	}
}