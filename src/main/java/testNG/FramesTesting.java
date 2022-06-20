package testNG;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesTesting {

	public static void main(String[] args) throws Exception {
 
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,800)");
		
		driver.findElement(By.id("name")).sendKeys("text1 venu");
		Thread.sleep(3000);
		driver.switchTo().frame("frm1");
		
		Select courseName__dd = new Select(driver.findElement(By.id("course")));
		courseName__dd.selectByVisibleText("Java");
		driver.switchTo().defaultContent();

		driver.switchTo().frame("frm2");
		driver.findElement(By.id("firstName")).sendKeys("Leela");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("venu Reddy");
		
		driver.switchTo().frame("frm1");
		courseName__dd.selectByVisibleText("Dot Net");
		Thread.sleep(3000);

		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("VENUGOPAL REDDY");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./Screenshots/Image1.png"));
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.close();


		






		
		
	}

}
