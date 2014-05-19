package th.co.abctech.thailand.JavaWebScraping;

import java.io.IOException;

import org.jsoup.nodes.Document;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class JsoupWebScrapingTest extends TestCase {
	
	
	private static String webUrl = "http://www.rb.no"; 
	private JsoupWebScraping scraper = new JsoupWebScraping();
	
	public JsoupWebScrapingTest(String testName) {
		
		super(testName);
	}

	
	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(JsoupWebScrapingTest.class);
	}
	
	public void testIntitial(){
		assertNotNull(scraper);

	}
	
	
	
//	public void testWebScrapingByURL() throws IOException {
//		Document doc = scraper.scrapingFromUrl(webUrl);
//		assertNotNull(doc);
//		
//	}
//	
//	public void testGetTextContentFromDocument() throws IOException{
//		Document doc = scraper.scrapingFromUrl(webUrl);
//		assertNotNull(doc);
//		
//		String text = doc.body().text();
//		assertNotNull(text);
//		assertNotSame(0, text.length());
//		
//	}
	
	public void testShowMeTheLongestWord(){
		String textArrayFromBody = "Har du sett Frode? Jobb og karriere (29) Søk: Søk SAKSBEHANDLER/KONSULENT Sted KONGSVINGER";
		String theLongestWord = scraper.findMaxLenghtWord(textArrayFromBody);
		assertNotNull(theLongestWord);
	}
	
	public void testShowMeTheFristLongestWordInCaseThereAreMoreThanOneAreLonngest(){
		String textArrayFromBody = "karriere Jobb og  Søk ";
		String theLongestWord = scraper.findMaxLenghtWord(textArrayFromBody);
		assertEquals("karriere", theLongestWord);
		textArrayFromBody = textArrayFromBody.concat(" abcdefghi");
		assertNotSame("karriere", theLongestWord);
	}
	
	public void testTheLongestWithSpecialCalactor(){
		String textArrayFromBody = "karriere Jobb og  Søk ";
		String theLongestWord = scraper.findMaxLenghtWord(textArrayFromBody);
		assertEquals("karriere", theLongestWord);
		
		textArrayFromBody = textArrayFromBody.concat(" KONGSVIN:");
		theLongestWord = scraper.findMaxLenghtWord(textArrayFromBody);
		assertNotSame("KONGSVIN:", theLongestWord);		
		assertEquals("karriere", theLongestWord);
		
		textArrayFromBody = textArrayFromBody.concat(" abctechx?");
		theLongestWord = scraper.findMaxLenghtWord(textArrayFromBody);
		assertNotSame("abctechx?", theLongestWord);		
		assertEquals("karriere", theLongestWord);
		
		textArrayFromBody = textArrayFromBody.concat(" SAKSBEHANDLER/KONSULENT");
		theLongestWord = scraper.findMaxLenghtWord(textArrayFromBody);
		assertNotSame("SAKSBEHANDLER/KONSULENT", theLongestWord);		
		assertEquals("SAKSBEHANDLER", theLongestWord);
		
		
		
	}
	
	
	
	
	
	
}
