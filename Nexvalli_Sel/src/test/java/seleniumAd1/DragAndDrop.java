package seleniumAd1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	WebDriver driver;

	@Test
	public void DragDrop() throws Exception {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(5000);
		
		//Element which needs to drag
		WebElement source = driver.findElement(By.xpath("//*[@id='credit2']/a"));
		
		//Element which needs to Drop
		WebElement target = driver.findElement(By.xpath("//*[@id='bank']/li"));
		
		//use action class to perform drag and drop
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
		driver.close();
	}
	
}
