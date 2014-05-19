package th.co.abctech.thailand.JavaWebScraping;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Hello world!
 * 
 */
public class JsoupWebScraping {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

	public Document scrapingFromUrl(String Url) throws IOException {
		Document doc = Jsoup.connect("http://www.rb.no").get();
		
		return doc;
	}

	public String findMaxLenghtWord(String textArrayFromBody) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
