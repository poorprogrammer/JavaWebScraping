package th.co.abctech.thailand.JavaWebScraping;

import java.io.IOException;
import java.text.Normalizer;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Hello world!
 * 
 */
public class JsoupWebScraping {
	public static void main(String[] args) {

		String textFromScraping = "";

		System.out.println("the longest word here, is ");

	}

	public Document scrapingFromUrl(String Url) throws IOException {
		Document doc = Jsoup.connect("http://www.rb.no").get();
		return doc;
	}

	public String findMaxLenghtWord(String textArrayFromBody) {
		String[] words = textArrayFromBody.split(" ");
		String theLongestWord = "";
		int max = 0;
		for (int index = 0; index < words.length; index++) {
			String word = words[index];
			System.out.println(word) ;
			word = word.replaceAll(":", "");
			word = word.replaceAll("\\?", "");
			System.out.println(word) ;
			if (word.length() > max) {
				max = word.length();
				theLongestWord = word;
			}
		}		
		return theLongestWord;
	}

}
