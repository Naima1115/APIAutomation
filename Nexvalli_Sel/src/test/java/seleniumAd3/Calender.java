package seleniumAd3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calender {

	WebDriver driver;
	
	@Test
	public void test1() throws Exception{
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://cheapoair.com");
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@id='fs_departDate_0']")).click();
		
		Thread.sleep(3000);
		List<WebElement> date = driver.findElements(By.xpath("//span[@data-month='0']"));
		
		for(int i =0; i<date.size(); i++) {
			
			WebElement el = date.get(i);
			String st = date.get(i).getText();
			
			if(st.equalsIgnoreCase("21")) {
				el.click();
				break;
			}
			
		}
	}
	
}
