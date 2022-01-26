package com.mjv.projetofinal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjv.projetofinal.model.Usuario;
import com.mjv.projetofinal.model.UsuarioLogin;
import com.mjv.projetofinal.repositories.UsuarioRepository;
import com.mjv.projetofinal.service.UsuarioService;

@RestController
@RequestMapping("/easyjob")
@CrossOrigin(origins = "*", allowedHeaders = "*") 
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
			
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> GetAll(){
		return ResponseEntity.ok(usuarioRepository.findAll());
	}
	
	@PostMapping("/logar")
	public ResponseEntity<UsuarioLogin> logar(@RequestBody Optional<UsuarioLogin> usuario){
		return usuarioService.logar(usuario).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Usuario> Post(@RequestBody Usuario usuario){
	return ResponseEntity.status(HttpStatus.CREATED)
			.body(usuarioService.CadastrarUsuario(usuario));
	}
	
}
