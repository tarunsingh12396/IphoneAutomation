package extent_professional;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import extentreportbase.ExtentReportManager;

public class LogoutTest {
	


	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;

	@BeforeMethod
	public void initializelogout() {

		extent = ExtentReportManager.getreReports();

		test = extent.createTest("Logout Test");

	}

	@Test
	public void Logout() {
		test.log(Status.INFO, "Starting Logout Test Case");
		test.log(Status.INFO, "Validating presence of logout link");
		test.log(Status.INFO, "Clicking on Logout link");
		test.log(Status.PASS, "Logout Test Case Pass");

	}

	@AfterMethod
	public void finish() {
		extent.flush();

	}


}
