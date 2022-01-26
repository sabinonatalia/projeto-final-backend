package com.mjv.projetofinal.model;

public enum Racial {

	PB("Pessoa branca"), PN("Pessoa negra"), PI("Pessoa Indígena"), PA("Pessoa amarela");
	
	private String nome;
	private Racial(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
}
