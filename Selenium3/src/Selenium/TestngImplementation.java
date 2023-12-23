package Selenium;

import java.io.IOException;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngImplementation extends BaseClass implements ITestListener {
	

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("TestCase Started");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("TestCase Failure");
		
		try {
			Utility.ScreenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("TestCase Finish");
	}
	
	

}
