package extentReport;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;

import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BasicExtentReportClass {

	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;

	@BeforeTest
	public void statreport() {
		htmlReporter = new ExtentSparkReporter("extentReport.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);

		// add environment details
		reports.setSystemInfo("Machine", "testpc1");
		reports.setSystemInfo("OS", "window 11");

		reports.setSystemInfo("user", "Prachi");
		reports.setSystemInfo("Browser", "Chrome");

		// configuration to change look and feel
		htmlReporter.config().setDocumentTitle("extentReport");
		htmlReporter.config().setReportName("Test Report");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEEE,MMMM dd,yyyy,hh:mm a '('zzz')' ");

	}

	@Test
	public void launchbrowserandopenurl() {
		// create test

		test = reports.createTest("launch broswer and open url");
		Assert.assertTrue(true); // test passed

	}

	@Test
	public void VerifyTitle() {
		// create test

		test = reports.createTest("Verifytitle");
		Assert.assertTrue(false); // test failed
	}

	@Test
	public void VerifyLogo() {
		// create test

		test = reports.createTest("Verify Logo");
		Assert.assertTrue(true); // test pass
	}

	@Test
	public void VerifyEmail() {
		// create test

		test = reports.createTest("Verify Email");
		throw new SkipException("skipping this test case with exception..");

	}

	@Test
	public void Verifyusername() {
		// create test

		test = reports.createTest("Verify username");
		Assert.assertTrue(true); // test pass

	}

	@AfterMethod
	public void gettestresult(ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE) {

			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "FAILED", ExtentColor.RED));
            test.fail(result.getThrowable());
		}

		else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "PASSED", ExtentColor.GREEN));

		}

		else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "SKIPPED", ExtentColor.YELLOW));

		}
	}
	// mandatory method
	@AfterTest
	public void teardown() {
		reports.flush();
		
	}
	
	

}
