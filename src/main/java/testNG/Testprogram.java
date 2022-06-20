package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testprogram {

	@Test
	public static void main(String[] args)throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("hyr tutorials.com");
		driver.findElement(By.name("btnK")).click();
		System.out.println(driver.getTitle()); 
		driver.quit();
		 
 	}
	
	@Test
	
	public void Test2() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("www.facebook.com"); 
		System.out.println(driver.getTitle()); 

		driver.close();
		
		
	}
	

}
