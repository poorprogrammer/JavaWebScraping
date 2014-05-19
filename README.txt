Java Web Scraping 0.1

    This project uses to evaluate for Senior Java Developer at ABCTech Thailand. It is built  by using Jsoup API for scpraping web content by url 
  and developed under Test Driven Development (TDD) concept. 
    Main purpose of this app is to find the longest word (Norwegian) which scraped from www.rb.no.

Technology list: 
- JDK 1.7
- Java Maven project
- Junit 3.8
- Jsoup API (detail about Jsoup http://jsoup.org/ )
- Git


Method description:
    This project contains just 2 files, one is for unit testing (JsoupWebScrapingTest.java) and 
  the other is for main program (JsoupWebScraping.java).
    
    JsoupWebScraping method list:
    - main method uses to execute main program.
    - scrapingFromUrl method uses to scrap content from the URL and return text body of the content. 
      Jsoup provides a very convenient API for extracting and manipulating data, using the best of DOM, CSS, and jquery-like methods
      which you can see in the source code.
    - findMaxLenghtWord method uses to find the longest word. In this version uses linear search algorithm.
    
