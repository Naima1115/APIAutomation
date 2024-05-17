package seleniumAd3;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowser {

	@Test
	public void facebook() {
		
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.getTitle());
	}
}
