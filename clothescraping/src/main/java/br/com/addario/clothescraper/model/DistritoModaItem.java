package br.com.addario.clothescraper.model;

import java.util.List;

import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DistritoModaItem implements Item {

	@Qualifier("distritoModaScrapService")
	private ScrapService scrapService;
	private Document document;
	private List<Categoria> categorias;
	private long idItem;
	private String nome;
	private String descricao;
	private double preco;
	private String link;
	private String tamanho;

	public DistritoModaItem() {
		this.setDocument(scrapService.getConnection("https://www.distritomoda.com.br/plus-size"));
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public ScrapService getScrapService() {
		return scrapService;
	}

	public void setScrapService(ScrapService scrapService) {
		this.scrapService = scrapService;
	}

	public long getIdItem() {
		return idItem;
	}

	public void setIdItem(long idItem) {
		this.idItem = idItem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

}
