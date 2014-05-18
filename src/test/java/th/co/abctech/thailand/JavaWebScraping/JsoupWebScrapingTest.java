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
	
	
	
	public void testWebScrapingByURL() throws IOException {
		Document doc = scraper.scrapingFromUrl(webUrl);
		assertNotNull(doc);
		
		
		
		
	}
}
