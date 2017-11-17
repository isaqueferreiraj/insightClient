package com.atomo.insightClient.negocio.beans;

import java.time.LocalDateTime;

public class Pessoa extends Usuario{
	public static long proximoID;
	
	private LocalDateTime dataNascimento;	
	
	public Pessoa(String nome, String email, String senha, Endereco endereco, LocalDateTime dataNascimento){
		super(email, senha, nome, endereco, Pessoa.proximoID);
		
		this.dataNascimento = dataNascimento;
		Pessoa.proximoID++;
		
	}
	
	public Pessoa(String nome, String email, String senha){
		super(email, senha, nome, Pessoa.proximoID);
		Pessoa.proximoID++;
	}

	public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDateTime dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public static long getProximoID() {
		return proximoID;
	}
}
