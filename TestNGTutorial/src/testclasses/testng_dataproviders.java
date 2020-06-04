package testclasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testng_dataproviders {
	@DataProvider(name="inputs")
	public Object[][] getData() {
		return new Object[][] {
			{"bmw", "m3", "car"},
			{"audi", "a6","sedan"},
			{"benz", "c300", "style"}
		};
	}
	
	@Test(dataProvider="inputs")
	public void testMethod1(String input1, String input2, String input3) {
		System.out.println("Input 1: " + input1);
		System.out.println("Input 2: " + input2);
		System.out.println("Input 3: " + input3);
	}

}
