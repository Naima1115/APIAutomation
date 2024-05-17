package seleniumAd2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Helper {

	WebDriver driver;
	
	@Test
	public static void high(WebDriver driver, WebElement ele) throws Exception {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style', 'background : yellow; border : 2px solid red;');", ele);
		
		Thread.sleep(5000);
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white;');" ,ele);
	}
}
