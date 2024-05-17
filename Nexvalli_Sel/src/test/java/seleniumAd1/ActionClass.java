package seleniumAd1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass {
	
	WebDriver driver;
	
  @Test
  public void action() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.facebook.com");
	  
	  Actions act = new Actions(driver);
	  act.click().build().perform();
	  
  }
}
