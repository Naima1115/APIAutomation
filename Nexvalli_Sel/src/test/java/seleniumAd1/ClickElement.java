package seleniumAd1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickElement {

	public static void clickById(WebDriver driver, String lid) {
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.id(lid))).click().build().perform();
	}
}
