package automationPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testday1 {
	@Test(groups="smoke")
	@Parameters({"uname","pass"})
	public void loginWithValidDetails(String username,String password) { // iske andr webdrivermnget find elemnt wla code likhna h real mai abhi smjhne
											// k liye print krva rhe h bus

		System.out.println("Test user");
		System.out.println(username+password);
	}

	@Test
	public void loginWithInvalidDetails() {
		System.out.println("Test Invalid user");
	}
	@Test

	public void loginWithInvalidusernameAndInvalidPassword() {
		System.out.println("Test Invaliduser and Invalid Password");
		
	}
}
