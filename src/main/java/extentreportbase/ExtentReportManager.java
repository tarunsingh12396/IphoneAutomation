package extentreportbase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {

	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;

	public static ExtentReports getreReports() {
		if (extent == null) {
			extent = new ExtentReports();
			spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/extentreports");
			spark.config().setReportName("Youtube Hindi Testng Playlist Testing");
			spark.config().setDocumentTitle("ProjectName_Jirastory_QA/UAT/PROD/");
			spark.config().setTheme(Theme.DARK);
			spark.config().setEncoding("utf-8");
			extent.attachReporter(spark);

		}

		return extent;
	}

}
