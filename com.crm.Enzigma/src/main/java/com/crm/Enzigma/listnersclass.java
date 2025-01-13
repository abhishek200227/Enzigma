package com.crm.Enzigma;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listnersclass extends Baseclass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("on test start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("on test success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("on test failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("on test skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("on test failed but with success percetage");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("on test failed with timeout");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("on start");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("on finish");
	}

}
