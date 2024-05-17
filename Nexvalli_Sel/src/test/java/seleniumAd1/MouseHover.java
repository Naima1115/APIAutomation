package seleniumAd1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {

	WebDriver driver;
	
	@Test
	public void hover() throws Exception{
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://stqatools.com/demo/MouseHover.php");
		
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//button[text()='Mouse Hover DropDown']"));
		
		//perform mouse hover
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
		//select link after hovering
		//driver.findElement(By.xpath("//a[text()='Link 1']")).click();
		
		Thread.sleep(5000);
		List<WebElement> links = driver.findElements(By.xpath("//a[@type='button']"));
		int size = links.size();
		for(int i =0; i<size; i++) {
			
			WebElement el= links.get(i);
			String text = el.getAttribute("innerHTML");
			System.out.println("Link name is--->"+text);
			
			if(text.equalsIgnoreCase("Link 2")) {
				
				el.click();
			}
		}
		 
		
		}	
	}

