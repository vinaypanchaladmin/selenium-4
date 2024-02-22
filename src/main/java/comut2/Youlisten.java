package comut2;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import practice3.Base3;

public class Youlisten extends Base3 implements ITestListener {

	ExtentSparkReporter reporter ;
	ExtentReports report ;
	ExtentTest test ;
	
	
	public void repo() {
		reporter = new ExtentSparkReporter("myreport.html");
		report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("qa", "vinay");
		report.setSystemInfo("os", "window");
		reporter.config().setDocumentTitle("testreport");
		reporter.config().setTheme(Theme.STANDARD);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void onTestStart(ITestResult result) {
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	 String method = result.getName();
		try {
			scn(method);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		test =report.createTest(method);
	    test.log(Status.PASS, MarkupHelper.createLabel(method, ExtentColor.GREEN));
		String path =System.getProperty("user.dir")+"\\screenshots\\"+method+".jpg";
		test.addScreenCaptureFromPath(path, "capture screenshot above");
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {
		repo();
	}

	@Override
	public void onFinish(ITestContext context) {
	 report.flush();
	}

	
	
	
}
