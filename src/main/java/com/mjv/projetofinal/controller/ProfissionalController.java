package com.mjv.projetofinal.controller;

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

import com.mjv.projetofinal.model.Profissional;
import com.mjv.projetofinal.repositories.ProfissionalRepository;

@RestController
@RequestMapping("/easy-diversitech") 
@CrossOrigin(origins = "*", allowedHeaders = "*") 
public class ProfissionalController {

	@Autowired
	private ProfissionalRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Profissional>> getAll (){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Profissional> getById(@PathVariable Long id) {
		return repository.findById(id)
			.map(resposta -> ResponseEntity.ok(resposta))
			.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Profissional> postProfissional (@Valid @RequestBody Profissional profissional){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(profissional));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Profissional> putProfissional(@PathVariable("id") Long id, @RequestBody Profissional profissional) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(profissional));
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteProfissional(@PathVariable Long id) {
		
		return repository.findById(id)
				.map(resposta -> {
					repository.deleteById(id);
					return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
				})
				.orElse(ResponseEntity.notFound().build());
	}
}
