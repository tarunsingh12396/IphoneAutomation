package testngCodestudio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



// @Listeners(testngCodestudio.ListenerClass.class)
public class ListenerDemo {
	@Test
	public void login() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--incognito");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");

		WebElement username = driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		username.sendKeys("standard_user");

		WebElement pss = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		pss.sendKeys("secret_sauce");

		WebElement login = driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
		login.click();

		Assert.assertEquals(driver.getTitle(), "Swag Labs");

	}
	
	@Test
	public void testFail() {
		System.out.println("Failed test case");
		Assert.assertTrue(false);
	}
	
	@Test
	public void testSkipped() {
		System.out.println("Skipped test case");
		throw new SkipException("Skip exception thrown....");
	}
	
	
	
	

}
