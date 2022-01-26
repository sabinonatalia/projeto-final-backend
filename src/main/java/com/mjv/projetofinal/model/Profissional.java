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
	
	@Column(nullable = false , length = 12)
	private String celular;
	
	@Column(nullable = false , length = 50)
	private String rua;
	
	@Column(nullable = false , length = 5)
	private Integer num;
	
	@Column(nullable = false , length = 50)
	private String bairro;
	
	@Column(nullable = false , length = 50)
	private String cidade;
	
	@Column(nullable = false , length = 30)
	private String estado;
	
	@Column(nullable = false , length = 30)
	private String genero;
	
	@Column(nullable = false , length = 30)
	private String perfilDiversidade;
	
	@Column
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataNascimento;
	
	
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

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPerfilDiversidade() {
		return perfilDiversidade;
	}

	public void setPerfilDiversidade(String perfilDiversidade) {
		this.perfilDiversidade = perfilDiversidade;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
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

	
}
