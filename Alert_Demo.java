package selenium_Web;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saran\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");

		WebElement simplealert = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		simplealert.click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		WebElement alertmsg = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		alertmsg.click();
		
		WebElement confirmalert = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		confirmalert.click();
		
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.accept();
		
		WebElement alretmsg1 = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		alretmsg1.click();
		
		WebElement promprtalert = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		promprtalert.click();
		
		Alert alert3 = driver.switchTo().alert();
		System.out.println(alert3.getText());
		alert3.sendKeys("Dinesh");
		
		alert3.accept();
		
	}

}
