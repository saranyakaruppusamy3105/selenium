package selenium_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saran\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement creatnpage = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		creatnpage.click();
		
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		Select s = new Select(day);
		s.selectByIndex(5);
		
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select s1=new Select(month);
		s1.selectByVisibleText("Jan");
		
		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select s2=new Select(year);
		s2.selectByValue("2020");
		
		
		
		
	}

}
