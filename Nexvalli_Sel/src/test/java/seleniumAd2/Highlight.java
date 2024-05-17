package seleniumAd2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Highlight {
	
	WebDriver driver;
	
	@Test
	public void highLight() throws Exception{
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		
		WebElement email = driver.findElement(By.id("email"));
		Helper.high(driver,email);
		email.sendKeys("rozana112@gmail.com");
		Thread.sleep(2000);
		
		WebElement pass = driver.findElement(By.id("passContainer"));
		Helper.high(driver, pass);
		pass.sendKeys("1234567890n");
	}

}
