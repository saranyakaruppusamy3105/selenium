package selenium_Web;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_DropDown {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saran\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		
		WebElement element = driver.findElement(By.xpath("(//select)[2]"));
		Select s =new Select(element);
		
		s.selectByIndex(0);
		s.selectByValue("bt");
		s.selectByVisibleText("Aquaman");
		
		List<WebElement> options = s.getOptions();
		for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
			
		}
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
		
		s.deselectByIndex(0);
		s.deselectByValue("bt");
		
		
}}
