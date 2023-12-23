package Selenium;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener {

	@Override
	public void onStart(ITestContext context) {
		System.out.println("TestExcecution start");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("TestExceution Finish");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TestExcecution Falied");
	}

	
}
