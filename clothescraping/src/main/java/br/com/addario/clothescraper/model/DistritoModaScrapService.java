package br.com.addario.clothescraper.model;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class DistritoModaScrapService implements ScrapService {

	@Override
	public Document getConnection(String url) {
		try {
			Document document = Jsoup.connect(url).get();
			return document;
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

}
