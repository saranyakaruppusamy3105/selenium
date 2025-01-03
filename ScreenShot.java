package selenium_Web;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saran\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		TakesScreenshot d = (TakesScreenshot) driver;     //typecasting narrowing = higerdatatype to lowerdatatype
		File screenshotAs = d.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\saran\\eclipse-workspace\\Selenium\\Screeshort\\dd.png");
		FileUtils.copyFile(screenshotAs, des);
	}

}
