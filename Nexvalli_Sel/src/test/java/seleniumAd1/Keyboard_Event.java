package seleniumAd1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Keyboard_Event {

	WebDriver driver;
	
	@Test
	public void keyboard() throws Exception {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.get("https://www.facebook.com");
		
		Actions act = new Actions(driver);
		//act.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.id("email")).sendKeys("rozana@gmail.com");
		act.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(1))
		.sendKeys("112224")
		.build().perform();
	}
}
