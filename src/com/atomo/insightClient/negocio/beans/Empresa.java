package com.atomo.insightClient.negocio.beans;

import java.time.LocalDateTime;

public class Empresa extends Usuario{
	public static long proximoID;
	
	private String urlSite; 
	
	public Empresa(String nome, String email, String senha, Endereco endereco, String urlSite){
		super(email, senha, nome, endereco, Pessoa.proximoID);
		Pessoa.proximoID++;
		
	}
	
	public Empresa(String nome, String email, String senha, String urlSite){
		super(email, senha, nome, Pessoa.proximoID);
		Pessoa.proximoID++;
		this.urlSite = urlSite;
		
	}
}
