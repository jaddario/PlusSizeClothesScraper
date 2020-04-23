package br.com.addario.clothescraper.model;

import javax.annotation.PostConstruct;

import org.jsoup.nodes.Document;

public interface ScrapService {
	@PostConstruct
	public Document getConnection(String url);
}
