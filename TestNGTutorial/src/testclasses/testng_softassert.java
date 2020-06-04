package testclasses;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import appcode.someclasstotest;



public class testng_softassert {
  @Test
  public void testSum() {
		SoftAssert sa = new SoftAssert();
		System.out.println("\nRunning Test -> testSum");
		someclasstotest obj = new someclasstotest();
		int result = obj.sumnumbers(1, 2);
		sa.assertEquals(result, 2);
		System.out.println("\nLine after assert 1");
		sa.assertEquals(result, 3);
		System.out.println("\nLine after assert 2");
		sa.assertAll();
	}

}
