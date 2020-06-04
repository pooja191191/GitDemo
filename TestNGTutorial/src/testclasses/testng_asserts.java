package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import appcode.someclasstotest;


public class testng_asserts {
  @Test
  public void testSum() {
		System.out.println("\nRunning Test -> testSum");
		someclasstotest obj = new someclasstotest();
		int result = obj.sumnumbers(1, 2);
		Assert.assertEquals(result, 3);
	}
	
	@Test
	public void testStrings() {
		System.out.println("\nRunning Test -> testStrings");
		String expectedString = "Hello World";
		someclasstotest obj = new someclasstotest();
		String result = obj.addStrings("Hello", "World");
		Assert.assertEquals(result, expectedString);
	}
	
	@Test
	public void testArrays() {
		System.out.println("\nRunning Test -> testArrays");
		int[] expectedArray = {1, 2, 3};
		someclasstotest obj = new someclasstotest();
		int[] result = obj.getArray();
		Assert.assertEquals(result, expectedArray);
	
	}

  
}
