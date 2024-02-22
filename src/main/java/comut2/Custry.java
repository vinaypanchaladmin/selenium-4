package comut2;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Custry implements IAnnotationTransformer{

	
	public void transformer(ITestAnnotation annotation) {
		annotation.setRetryAnalyzer(Yourtry.class);
	}
}
