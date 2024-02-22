package practice2;

import org.testng.annotations.DataProvider;

public class Hlo2 {

	

	@DataProvider(name="dt")
	public Object [][] medata(){
		Object[][] data = {{"ajay","123"},{"rahul","789"}};
		return data ;
	}
}
