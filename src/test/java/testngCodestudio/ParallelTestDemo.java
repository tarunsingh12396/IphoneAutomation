package testngCodestudio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTestDemo {

	WebDriver driver;

	@Test
	public void verifyTitle() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--incognito");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");

		Assert.assertEquals(driver.getTitle(), "Swag Labs");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.quit();

	}

	@Test
	public void verifyLogo() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--incognito");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");

		// Assert.assertEquals(driver.getTitle(), "Swag Labs");

		WebElement logo = driver.findElement(By.xpath("//div[@class=\"login_logo\"]"));

		Assert.assertTrue(logo.isDisplayed());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.quit();

		// WebElement username = driver.findElement(By.xpath(""));
		// username.sendKeys("standard_user");

		// WebElement pass = driver.findElement(By.xpath(""));
		// pass.sendKeys("secret_sauce");

	}

}
