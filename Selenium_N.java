package selenium_Web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_N {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saran\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage(). window(). maximize();

		driver.get("https://in.linkedin.com/");

		String title = driver.getTitle();
		System.out.println(title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		driver.navigate() .to("https://www.instagram.com/");

		driver.navigate() .back();
		driver.navigate() .forward();

		driver.close();
		driver.quit();

	}

}
