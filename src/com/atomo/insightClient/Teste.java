package com.atomo.insightClient;

import java.time.LocalDate;

import com.atomo.insightClient.negocio.beans.*;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario pessoa = new Usuario("Isaque", "isaque@gmail.com", "12345");
		
		Endereco endereco1 = new Endereco("Rua da Conciliação", 32, "", "Recife", "PE", "Brasil");
		
		Usuario empresa = new Usuario("Coca-cola", "cocacola@cocacola.com", "12345",  endereco1, LocalDate.of(2000, 06, 14), true);
		
		Ideia ideia = new Ideia("Vocês deveriam fazer uma bebida de cor rosa", "Produto", pessoa, empresa);
		
		ideia.toString();
	}

}
