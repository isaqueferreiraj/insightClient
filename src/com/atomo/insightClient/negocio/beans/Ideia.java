package com.atomo.insightClient.negocio.beans;

public class Ideia {
	private String texto;
	private String categoria;
	private Usuario autor;
	private Usuario empresa;
	private boolean insight;
	
	public Ideia(String texto, String categoria, Usuario autor, Usuario empresa){
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

	public Usuario getAutor() {
		return autor;
	}

	public Usuario getEmpresa() {
		return empresa;
	}
	
	public String toString(){
		StringBuffer sb = null;
		
		sb.append("Empresa: " + this.empresa.getNome());
		sb.append("\nCategoria: ");
		sb.append(getCategoria());
		sb.append("\n" + this.texto);
		sb.append("\n" + this.getAutor().getNome());
		
		if(this.insight == true)
			sb.append("\nSua ideia foi avaliada como um insight!!!");
		return string.toString();
	}
}
