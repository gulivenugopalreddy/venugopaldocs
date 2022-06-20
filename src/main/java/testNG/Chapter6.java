package testNG;

import java.awt.Desktop;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chapter6 {

	static WebDriver driver;
	public static void main(String[] args)throws Exception {
		
		ExtentReports extentReports = new ExtentReports();
		File file = new File("repots.html");
		ExtentSparkReporter SporkReporter = new ExtentSparkReporter(file);
		extentReports.attachReporter(SporkReporter);
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String base64Code = captureScreenshot(null);
		String path = captureScreenshot("Google.jpg");
		extentReports
		.createTest("Screenshot Test 1","This is for Attaching the Screenshot to test at the test level")
		.info(" This is a info message")
		.addScreenCaptureFromBase64String(base64Code);
		extentReports
		.createTest("Screenshot Test1 ","this is the screenshot attaching the extentReports")
		.info("This is a info msg")
		.addScreenCaptureFromBase64String(base64Code,"Google homepage");
		
		
		
		
		extentReports.flush();
		Desktop.getDesktop().browse(new File("repots.html").toURI());
		
 
		
	}

  

	private static String captureScreenshot(String string) {
		// TODO Auto-generated method stub
		return null;
	}



	public static void CaptureScreenshot( ) {
	
		TakesScreenshot takesScreenshout = (TakesScreenshot) driver;
		String sourceFile = takesScreenshout.getScreenshotAs(OutputType.BASE64);
		System.out.println("Screenshot saved Successfully");
		 
		

		
		
	}
}
