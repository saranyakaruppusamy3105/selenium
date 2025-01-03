package selenium_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Demo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saran\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		
		Actions act = (Actions) driver;
		
		WebElement doubleclick = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		act.doubleClick(doubleclick).build().perform();
		
		WebElement rightclick = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
		act.contextClick(rightclick).build().perform();
		
		WebElement click = driver.findElement(By.xpath("//button[text()='Click Me']"));
		act.click(click).build().perform();
		
		driver.navigate().to("https://www.flipkart.com/");
		
		WebElement movetoelement = driver.findElement(By.xpath("//span[text()='Fashion']"));
		act.moveToElement(movetoelement).build().perform();
		
		driver.navigate().to("https://demoqa.com/droppable/");
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		act.dragAndDrop(drag, drop).perform();
		
		
	
	}

}
