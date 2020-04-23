package br.com.addario.clothescraper.model;

public class Categoria {
	private long idCategoria;
	private String nomeCategoria;
	private String linkCategoria;

	public Categoria() {}
	
	public Categoria(long idCategoria, String nomeCategoria, String linkCategoria) {
		this.idCategoria = idCategoria;
		this.nomeCategoria = nomeCategoria;
		this.linkCategoria = linkCategoria;

	}

	public long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public String getLinkCategoria() {
		return linkCategoria;
	}

	public void setLinkCategoria(String linkCategoria) {
		this.linkCategoria = linkCategoria;
	}

}
