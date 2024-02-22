package comutil;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Mytry implements IRetryAnalyzer {

	int count = 0 ;
	int max = 3 ;
	
	public boolean retry(ITestResult result) {
		if(count<max){
			count ++ ;
			return true ;
		}
		else {
			
		}
	return false ;
	}
	
	  
}
