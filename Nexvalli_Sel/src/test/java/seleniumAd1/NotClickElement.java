package seleniumAd1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NotClickElement {
	
	WebDriver driver;
	
	@Test
	public void notClick() throws Exception{
		
		driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		Thread.sleep(5000);
		
		WebElement ele = driver.findElement(By.id("persistent"));
		
		//Actions act = new Actions(driver);
		//act.moveToElement(ele).click().build().perform();
		
		//we can also use a general class method if we need to run multiple notclickable element
		
		ClickElement.clickById(driver, "persistent");
	}

}
