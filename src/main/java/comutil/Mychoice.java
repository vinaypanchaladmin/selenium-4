package comutil;

import java.io.File;
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

import practice1.Maven4.Base;

public class Mychoice extends Base implements ITestListener {
	
	ExtentSparkReporter reporter ;
	ExtentReports report ;
	ExtentTest test ;
	
	public void config() {
		reporter = new ExtentSparkReporter("Report.html");
		report = new ExtentReports();
		report.attachReporter(reporter);
		
		report.setSystemInfo("Name", "Abc");
		report.setSystemInfo("OS", "Window");
		report.setSystemInfo("designation", "QA");
		
		reporter.config().setDocumentTitle("Test Case Report");
		reporter.config().setTheme(Theme.DARK);
		
		
		
		
		
	}
	
	

	@Override
	public void onTestStart(ITestResult result) {

	}

	@Override
	public void onTestSuccess(ITestResult result){
		
		try {
			String method = result.getName();
			shot(method);
			test = report.createTest(method);
			test.log(Status.PASS, MarkupHelper.createLabel(method,ExtentColor.GREEN));
			
			String p =System.getProperty("user.dir")+"\\screenshots\\"+method+".png";
			File f = new File(p);
			if(f.exists()) {
				test.pass("pass :"+test.addScreenCaptureFromPath(p));
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
	config();
	}

	@Override
	public void onFinish(ITestContext context) {
    report.flush();
	}
	
	
}
