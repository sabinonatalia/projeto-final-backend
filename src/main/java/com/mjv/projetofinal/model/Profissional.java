package com.mjv.projetofinal.model;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "tab_profissional")
public class Profissional {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 100)
	private String nomeCompleto;
	
	@Column(nullable = false, length = 30)
	private String areaProf;

	@Column(nullable = false, length = 30)
	private String email;
	
	@Column(nullable = false, length = 12)
	private String telefone;
	
	@Column
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataNascimento;
	
	@Column(nullable = false , length = 12)
	private String celular;
	
	@Column(nullable = false, length = 50)
	private String linkedin;
	
	@Column(nullable = false, length = 50)
	private String github;
	
	@Column(nullable = false, length = 30)
	private String perfilDiversi;
	
	@Column(nullable = false, length = 300)
	private String biografia;

	@Column(nullable = false, length = 100)
	private String foto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getAreaProf() {
		return areaProf;
	}

	public void setAreaProf(String areaProf) {
		this.areaProf = areaProf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

	public String getPerfilDiversi() {
		return perfilDiversi;
	}

	public void setPerfilDiversi(String perfilDiversi) {
		this.perfilDiversi = perfilDiversi;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	/*@Column
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dataNascimento;*/
	
	//List<Profissional> profissional = new ArrayList<Profissional>();


	
	/*public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}*/
	
	
}
