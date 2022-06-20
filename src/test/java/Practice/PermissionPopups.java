package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PermissionPopups {

	public static void main(String[] args) {
 
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("diseble-notifications");
		options.addArguments("diseble-geolocation");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://mictests.com/");
		
	
	
	
	}

}
