package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	@Test
	public void TestGoogle() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("HYR Tutorials",Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.quit();

	}
  
	@Test

	public void  OpenFaceBook() {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("8074963167");
		driver.findElement(By.id("pass")).sendKeys("venu1997@");
		driver.findElement(By.name("login")).click();
//		driver.quit();

	} 	

}

