package seleniumAd2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hidden {
	//if dont understant this code then watch mukesh video from portal

@Test
public void hiddenElement() throws Exception{
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	driver.get("https://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
	List<WebElement> radio = driver.findElements(By.id("male"));
	
	int num = radio.size();
	System.out.println("number of element-->"+ num);
	
	for(int i=0; i<num; i++) {
		
		int x = radio.get(i).getLocation().getX();
		if(x!=0) {
			
			radio.get(i).click();
			break;
		}
	}
}
}
