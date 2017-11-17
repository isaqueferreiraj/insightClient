package com.atomo.insightClient.negocio.beans;

public class Ideia {
	private String texto;
	private String categoria;
	private Pessoa autor;
	private Empresa empresa;
	private boolean insight;
	
	public Ideia(String texto, String categoria, Pessoa autor, Empresa empresa){
		this.texto = texto;
		this.categoria = categoria;
		this.autor = autor;
		this.empresa = empresa;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public boolean isInsight() {
		return insight;
	}

	public void setInsight(boolean insight) {
		this.insight = insight;
	}

	public Pessoa getAutor() {
		return autor;
	}

	public Empresa getEmpresa() {
		return empresa;
	}
	
	public String toString(){
		StringBuffer string = null;
		
		string.append("\n" + this.empresa.getNome() + "\nCategoria:\n " + this.categoria + this.texto + this.autor.getNome());
		if(this.insight == true)
			string.append("\nSua ideia foi avaliada como um insight!!!");
		return string.toString();
	}
}
