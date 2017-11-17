package com.atomo.insightClient.negocio.beans;

public abstract class Usuario {
	private String email;
	private String senha;
	private String nome;
	private long id;
	private Endereco endereco;
	private Ideia[] repositorioIdeias;
	private int qtdInsights;
	private int qtdIdeias = 0;
	
	public Usuario(String email, String senha, String nome, Endereco endereco, long id){
		this.email = email;
		this.senha = senha;
		this.nome = nome;
		this.endereco = endereco;
		this.id = id;
		this.repositorioIdeias = new Ideia[10];
	}
	
	public Usuario(String nome, String email, String senha, long id){
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.id = id;
		this.repositorioIdeias = new Ideia[10];
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

	public void setId(long id) {
		this.id = id;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public void setIdeia(Ideia ideia){
		if(this.qtdIdeias < 10){
				this.repositorioIdeias[qtdIdeias] = ideia;
		}
		
			/*else if(i == repositorioIdeias.length-1){
				//Aumentar array
			}*/		
	}
	
	public Ideia getIdeia(int i){
		return repositorioIdeias[i];
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
	
	/*int i = 0;
		while(repositorioIdeias[i] != null && i < repositorioIdeias.length)
			i++;
		return i;*/
}
