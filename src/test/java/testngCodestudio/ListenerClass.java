package testngCodestudio;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("On Start Method invoked....");
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		System.out.println("Name of test method successfully executed :" + result.getName());

	} 

	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println("Name of test method failed:" + result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {

		System.out.println("Name of test method skipped:" + result.getName());

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("Name of test method timeout:" + result.getName());

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Name of test method started:" + context.getName());

	}

	@Override
	public void onFinish(ITestContext context) {

		System.out.println("On Finished Method invoked....");

	}

}
