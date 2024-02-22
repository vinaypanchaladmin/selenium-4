package comut2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Yourtry implements IRetryAnalyzer {

	int count = 0;
	int max = 3;
	
	public boolean retry(ITestResult result) {
		while(count<max) {
			count ++ ;
			return true ;
			}
		
	return false ;
	}

	
	
	
	
	
	
}
