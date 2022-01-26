package com.mjv.projetofinal.model;

public enum Genero {
	MC("Mulher Cisgênero"), HC("Homem Cisgênero"), MT("Mulher Transgênero"),
	HT("Homem Transgênero"), NB("Não Binário"), T("Travesti"), OUT("Outro");

	private String nome;
	
	private Genero(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
}
