package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelTextBoxes {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		Thread.sleep(5000);

		WebElement usernameTxt = driver.findElement(By.id("login_field"));

		if(usernameTxt.isDisplayed()) {

			if(usernameTxt.isEnabled()) {

				usernameTxt.sendKeys("VENU REDDDY");
				String enteredtext = usernameTxt.getAttribute("values");
				System.out.println("enteredtext");
				Thread.sleep(5000);

				usernameTxt.clear();


			}

			else

				System.err.println("username  textbox  is not enabled ");


		}
		else

			System.err.println("username  textbox  is not displayed");


		Thread.sleep(5000);

		driver.close();

	}

}
