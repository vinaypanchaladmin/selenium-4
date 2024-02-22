package comut2;

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

import practice2.Base2;

public class Uslisten extends Base2 implements ITestListener {
	
	
	
	ExtentSparkReporter reporter ;
    ExtentReports report ;
    ExtentTest test ;
    
    public void config() {
    	 reporter = new ExtentSparkReporter("Reporttest.html");
    	 report = new ExtentReports();
    	report.attachReporter(reporter);
    	report.setSystemInfo("Name", "QA");
    	report.setSystemInfo("OS", "Window");
    	
        reporter.config().setDocumentTitle("QA Report");
        reporter.config().setTheme(Theme.STANDARD);
    	
    	
    	
    }
	

	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	
		try {
			
			String method =result.getName();
			screen(method);
			
			test =report.createTest(method);
		     test.log(Status.PASS, MarkupHelper.createLabel(method, ExtentColor.GREEN));
			String p = System.getProperty("user.dir")+"\\screenshots\\"+method+".png";
			File f = new File(p);
			if(f.exists()) {
			test.pass("screenshot above :"+test.addScreenCaptureFromPath(p));
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
		System.out.println("methos start");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("method finish");
	    report.flush();
	}

	
}
