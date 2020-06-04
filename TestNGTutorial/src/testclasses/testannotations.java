package testclasses;

import org.testng.annotations.Test;
import appcode.someclasstotest;


public class testannotations {
  @Test
  public void testMethod1() {
		someclasstotest obj = new someclasstotest();
		int result = obj.sumnumbers(1, 2);
		System.out.println("Running Test -> testMethod1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("Running Test -> testMethod2");
	}
	
	@Test
	public void testMethod3() {
		System.out.println("Running Test -> testMethod3");
	}

}
