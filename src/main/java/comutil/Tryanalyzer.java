package comutil;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Tryanalyzer implements IAnnotationTransformer{

	public void transform(ITestAnnotation annotation) {
		annotation.setRetryAnalyzer(Mytry.class);
	}
}
