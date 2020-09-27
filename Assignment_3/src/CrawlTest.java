import java.io.IOException;
import jxl.write.WriteException;
public class CrawlTest
{
    
    public static void main(String[] args) throws IOException
    {
    	System.out.println("Web Crawler running...");
    	
    	//Run Code for Crawler
		Crawler.mp.put("https://pec.ac.in/", true);
		Crawler.crawl("https://pec.ac.in/", 0);
		try {
			Crawler.workbook.write();
			Crawler.workbook.close();
		} catch (IOException | WriteException e) {
			e.printStackTrace();
		}
		//Run Code for FocusedCrawler
		FocusedCrawler.fcrawler("http://www.pec.ac.in/faculty-index");
		//Run Code for PdfCrawler
		PdfCrawler.visited.put("https://pec.ac.in/", true);
		PdfCrawler.crawl("https://pec.ac.in/",0);
		PdfCrawler.writer.close();
		
		System.out.println("Done!");
    }
}