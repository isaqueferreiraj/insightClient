package com.atomo.insightClient;

import com.atomo.insightClient.negocio.beans.*;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa("Isaque", "isaque@gmail.com", "12345");
		Empresa empresa = new Empresa("Coca-cola", "cocacola@cocacola.com", "12345", "www.cocacola.com");
		
		Ideia ideia = new Ideia("Vocês deveriam fazer uma bebida de cor rosa", "Produto", pessoa, empresa);
		
		pessoa.setIdeia(ideia);
		pessoa.getIdeia(0).toString();
	}

}
