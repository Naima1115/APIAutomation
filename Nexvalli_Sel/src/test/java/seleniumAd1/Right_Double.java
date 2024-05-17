package seleniumAd1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Right_Double  {
	
	WebDriver driver;
	
	@Test
	public void right() throws Exception {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(5000);
		
		//perform right click
		WebElement ele = driver.findElement(By.xpath("//*[@class='context-menu-one btn btn-neutral']"));
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
		
		//click on the menu after right click
		driver.findElement(By.cssSelector(".context-menu-icon-copy")).click();
		
		//print the text of alert and accept alert
		System.out.println("Alert text is----->"+ driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	
		driver.close();
	}
	
	@Test
	public void doubleClick() throws Exception {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(5000);
		
		//double click by using action class
		WebElement el= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act = new Actions(driver);
		act.doubleClick(el).perform();
		
		//Accept alert
		System.out.println("Accept double click alertr------>"+ driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.quit();
		
	}

}
