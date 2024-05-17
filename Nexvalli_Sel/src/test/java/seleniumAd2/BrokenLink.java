package seleniumAd2;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*Collect all the links in the web page based on <a> tag.
*Send HTTP request for the link and read HTTP response code.
*Find out whether the link is valid or broken based on HTTP response code.
*Repeat this for all the links captured.*/

public class BrokenLink {
	
	WebDriver driver;
	
	@Test
	public void broken() throws Exception {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//1.collect url
		driver.get("https://www.facebook.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("number of links are-->"+ links.size());
		
		Thread.sleep(5000);

		  for(int i=0; i<links.size(); i++) {
			  
			  WebElement ele = links.get(i);
			  String url = ele.getAttribute("href");
			 // System.out.println(url);
			  
			  //2.send http request and get response
	          URL ln = new URL(url);
	          //create a connection using url object 'ln'
			  HttpURLConnection httpcon = (HttpURLConnection) ln.openConnection();
			  Thread.sleep(2000);
			  
			  //get response
			  httpcon.connect();
			  int rescode = httpcon.getResponseCode();
			  
			  //3.find the link is valid or broken
			  if(rescode>=400) {
				  
				  System.out.println(url +"-"+"is a broken link");
			  }
			  else {
				  System.out.println(url + "-"+ "is valid link");
			  }

		  }
		  
		  
	}

}
