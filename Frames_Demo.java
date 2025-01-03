package selenium_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saran\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");

		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		WebElement text1 = driver.findElement(By.xpath("(//input[@name='mytext1'])[1]"));
		text1.sendKeys("Dinesh");

		driver.switchTo().defaultContent();

		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		WebElement text2 = driver.findElement(By.xpath("//input[@name='mytext2']"));
		text2.sendKeys("Saranya");
		
		driver.switchTo().defaultContent();
		
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		WebElement text3 = driver.findElement(By.name("mytext3"));
		text3.sendKeys("Abinandhana");
		
		driver.switchTo().defaultContent();
	
		
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		WebElement text4 = driver.findElement(By.xpath("//input[@name='mytext4']"));
		text4.sendKeys("Gowtham");
		
		driver.switchTo().defaultContent();
		
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		WebElement text5 = driver.findElement(By.xpath("//input[@name='mytext5']"));
		text5.sendKeys("Saranyad");
		
		driver.switchTo().parentFrame();

}}
