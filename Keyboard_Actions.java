package selenium_Web;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Keyboard_Actions {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saran\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("user-data-dir=C:/Users/saran/AppData/Local/Google/Chrome/User Data");
		
		option.addArguments("--profile-directory=Default");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?tag=googhydrabk1-21&ref=nav_custrec_signin&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=11475444088331906443&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9148888&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
		//Actions act = (Actions) driver;
		
		
		
		
		
		
	
		
	
	
		
	
	}

}
