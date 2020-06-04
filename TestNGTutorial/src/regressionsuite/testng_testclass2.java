package regressionsuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.basetestsuite;


public class testng_testclass2 extends basetestsuite{
	@BeforeClass
	public void setUp() {
		System.out.println("TestNG_TestClass2 -> before class");
	}
	
	@AfterClass
	public void cleanUp() {
		System.out.println("TestNG_TestClass2 -> after class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("TestNG_TestClass2 -> before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("TestNG_TestClass2 -> after method");
	}
	
	@Test
	public void testMethod1() {
		System.out.println("TestNG_TestClass2 -> testMethod1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("\nTestNG_TestClass2 -> testMethod2");
	}


}
