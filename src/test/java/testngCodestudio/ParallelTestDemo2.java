package testngCodestudio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTestDemo2 {

	WebDriver driver;

	@Test
	public void verifyLogin() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--incognito");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");

		WebElement username = driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		username.sendKeys("standard_user");

		WebElement pass = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		pass.sendKeys("secret_sauce");

		WebElement login = driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
		login.click();

		Assert.assertEquals(driver.getTitle(), "Swag Labs");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.quit();

	}

}
