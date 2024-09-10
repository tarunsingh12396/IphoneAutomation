package automationPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testday2 {
	
	
	
	@BeforeMethod
	public void runFirst() {
		System.out.println("RunFirst");
	}
	
	
	
	
	
	
	
	
	@Test
	public void validateCartIcon() {
		System.out.println("cart");
		
	}
	
	@Test(groups="smoke")
	public void validateSearch() {
		System.out.println("search");
	}
	
	@Test
	public void ValidatePersonIcon() {
		System.out.println("PersonIcon");
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("teardown");
	}
	
}
