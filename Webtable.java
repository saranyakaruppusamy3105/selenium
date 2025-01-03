package selenium_Web;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saran\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement data : alldata) {
			System.out.println(data.getText());
		}
		
		List<WebElement> allrow = driver.findElements(By.xpath("//table/tbody/tr[5]/td"));
		for(int i=0; i<allrow.size(); i++)
		{
			System.out.println(allrow.get(i).getText());
		}
		
		List<WebElement> elements = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		for (WebElement allcolumn : elements) {
			System.out.println(allcolumn.getText());
			
		}
List<WebElement> header = driver.findElements(By.tagName("th"));
for (WebElement head : header) {
	System.out.println(head.getText());
	
	
}

header.clear();
	}

}
