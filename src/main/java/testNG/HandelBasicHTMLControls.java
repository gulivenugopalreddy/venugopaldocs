package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelBasicHTMLControls {

	public static void main(String[] args)throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,800)");
		Thread.sleep(2000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("spanishchbx")).click();
		Thread.sleep(5000);
		WebElement frenchchbx= driver.findElement(By.id("frenchchbx"));
		frenchchbx.click();
		Thread.sleep(3000);
		if(frenchchbx.isSelected())
			frenchchbx.click();
		Thread.sleep(3000);
		driver.findElement(By.id("registerbtn")).click();
		System.out.println(driver.findElement(By.id("msg")).getText());
		Thread.sleep(3000);
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();
 		Thread.sleep(3000);
		driver.close();











	}

}
