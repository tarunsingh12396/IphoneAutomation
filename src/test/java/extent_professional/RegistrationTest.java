package extent_professional;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import extentreportbase.ExtentReportManager;

public class RegistrationTest {

	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;

	@BeforeMethod
	public void initializeregister() {

		extent = ExtentReportManager.getreReports();

		test = extent.createTest("registration  Test");

	}

	@Test
	public void register() {
		test.log(Status.INFO, "Starting registration Test Case");
		test.log(Status.INFO, "Validating User Fields");
		test.log(Status.INFO, "enter user Fields");

		test.log(Status.INFO, "Clicking on Submit Button ");
		test.log(Status.PASS, "Registration Test Case Pass");

	}

	@AfterMethod
	public void finish() {
		extent.flush();

	}

}
