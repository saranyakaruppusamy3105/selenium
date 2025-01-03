package selenium_Web;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saran\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		
		//login
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("saranya3dk");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Saranya@31");
		
		WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
		login.click();
		
		WebElement location = driver.findElement(By.xpath("//Select[@name='location']"));
		Select loc = new Select(location);
		loc.selectByIndex(5);
		
		WebElement hotel = driver.findElement(By.xpath("//Select[@name='hotels']"));
		Select ho = new Select(hotel);
		ho.selectByValue("Hotel Sunshine");
		
		WebElement room = driver.findElement(By.xpath("//Select[@name='room_type']"));
		Select ro = new Select(room);
		ro.selectByVisibleText("Double");
		
		WebElement search = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select se = new Select(search);
		se.selectByIndex(2);
		
		WebElement cid = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		cid.sendKeys("12/12/2024");
		
		WebElement cod = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		cod.sendKeys("12/16/2024");
		
		WebElement Adults = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select ad = new Select(Adults);
		ad.selectByIndex(2);
		
		WebElement children = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select ch = new Select(children);
		ch.selectByIndex(2);
		
		WebElement search1 = driver.findElement(By.xpath("//input[@type='submit']"));
		search1.click();
		
		
		WebElement option = driver.findElement(By.xpath("//input[@type='radio']"));
		option.click();
		
	 WebElement continu = driver.findElement(By.xpath("//input[@name='continue']"));
		continu.click();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));	
		firstname.sendKeys("Saranya");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		lastname.sendKeys("Dinesh");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
		address.sendKeys("2/105E Ganapathy Managar, papampatti, cbe-641616");
		
		WebElement cardnumber = driver.findElement(By.xpath("(//input[@class='reg_input'])[3]"));
		cardnumber.sendKeys("6164554536557654");
		
		WebElement type = driver.findElement(By.xpath("//select[@class='select_combobox']"));
		Select ty = new Select(type);
		ty.selectByIndex(1);
		
		WebElement expmonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select exp = new Select(expmonth);
		exp.selectByIndex(1);
		
		WebElement expyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select eyear = new Select(expyear);
		eyear.selectByIndex(16);
		
		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		cvv.sendKeys("455");
		
		WebElement book = driver.findElement(By.xpath("//input[@name='book_now']"));
		book.click();
		
		
		
		
		
		
		
	}

	
}
