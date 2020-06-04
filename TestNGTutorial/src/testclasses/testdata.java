package testclasses;

import org.testng.annotations.DataProvider;

public class testdata {
	@DataProvider(name="inputs")
	public Object[][] getData() {
		return new Object[][] {
			{"bmw", "m3", "car"},
			{"audi", "a6","sedan"},
			{"benz", "c300", "style"}
		};
	}
}
