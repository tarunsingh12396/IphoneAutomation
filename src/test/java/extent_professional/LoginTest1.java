package extent_professional;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import extentreportbase.ExtentReportManager;

public class LoginTest1 {
	
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static  ExtentTest test;

	@BeforeMethod
	public void initialize() {
		
		extent = ExtentReportManager.getreReports();

		    test =  extent.createTest("Login Test");
 
	}

	@Test
	public void login1() {
		test.log(Status.INFO, "Starting Login Test Case");
		  test.log(Status.INFO, "Opening Browser");
		  test.log(Status.INFO, "Validating presence of signin link");
		  test.log(Status.FAIL, "502 server error");
		  Assert.assertTrue(false);
		  test.log(Status.INFO, "Entering Credentials");
		  test.log(Status.PASS, "Login Test Case Pass"); 

	}

	@AfterMethod
	public void finish() {
		extent.flush(); 

	}

}
