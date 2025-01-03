package selenium_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Xpath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saran\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("abcd@gmail.com");
		element.clear();
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
		
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
		
		String attribute2 = element.getAttribute("name");
		System.out.println(attribute2);
		
		
		WebElement element2 = driver.findElement(By.name("pass"));
		element2.sendKeys("ardfsddf");
		element2.clear();
		
		boolean enabled = element2.isEnabled();
		System.out.println(enabled);
		
		
		WebElement login = driver.findElement(By.name("login"));
		
		boolean selected = login.isSelected();
		System.out.println(selected);
	    login.click();
	    
	    
		
	}

}
