package com.atomo.insightClient.negocio.beans;

import java.time.LocalDate;

public class Usuario {
	private String email;
	private String senha;
	private String nome;
	private long id;
	private Endereco endereco;
	private LocalDate dataNascimento;
	private int qtdInsights;
	private int qtdIdeias;
	private boolean empresa;
	
	private static long empresaProximoID;
	private static long pessoaProximoID;
	
	public Usuario(String email, String senha, String nome, Endereco endereco,
			LocalDate dataNascimento, boolean empresa){
		this.email = email;
		this.senha = senha;
		this.nome = nome;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		if(empresa == true){
			this.id = empresaProximoID;
			Usuario.empresaProximoID++;
		}
		else{
			this.id = pessoaProximoID;
			Usuario.pessoaProximoID++;
		}
	}
	
	public Usuario(String nome, String email, String senha){
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.id = pessoaProximoID;
		Usuario.pessoaProximoID++;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public long getId() {
		return id;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public int getQtdIdeias(){
		return this.qtdIdeias;
	}
	
	public int getQtdInsights() {
		return qtdInsights;
	}

	public void setQtdInsights(int qtdInsights) {
		this.qtdInsights = qtdInsights;
	}
	
	public LocalDate getDataNascimento(){
		return this.dataNascimento;
	}
	
	public void setDataNascimento(LocalDate dataNascimento){
		this.dataNascimento = dataNascimento;
	}
	
}
