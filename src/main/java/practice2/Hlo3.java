package practice2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Hlo3 {

	
	@Test(dataProvider  ="dt")
	public void signin(String username, String password) {
		System.out.println("username :"+ username+" ,"+"password :"+ password);
	}

	@DataProvider(name="dt")
	public Object [][] medata(){
		Object[][] data = {{"ajay","123"},{"rahul","789"}};
		return data ;
	}
}
