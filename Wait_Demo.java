package selenium_Web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saran\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("abcd@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("sar123");
		
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		
		driver.navigate().to("https://letcode.in/signin");
		
		WebElement email1 = driver.findElement(By.xpath("//input[@name='email']"));
		email1.sendKeys("ab@gmail.com");
		
		WebElement pass1 = driver.findElement(By.xpath("//input[@name='password']"));
		pass1.sendKeys("sa234");
		
		WebElement login1 = driver.findElement(By.xpath("//button[text()='LOGIN']"));
		login1.click();
		
		WebElement toast = driver.findElement(By.xpath("//div[@id='toast-container']"));
		String text = toast.getText();
		System.out.println(text);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOf(toast));
		
		WebElement signup = driver.findElement(By.xpath("//a[text()='Sign up']"));
		signup.click();
		
		
		
		
		
	}

}
