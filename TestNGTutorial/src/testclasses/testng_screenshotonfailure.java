package testclasses;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class testng_screenshotonfailure {
	WebDriver driver;
	String baseURL;
	
	@BeforeMethod
	public void setUp() {
		baseURL = "https://www.facebook.com";
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get(baseURL);
		System.out.println(" before test");
	}
	
	@Test
	public void testLogin() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("test");
		driver.findElement(By.id("pass")).sendKeys("test");
		driver.findElement(By.id("loginbutton")).click();
		System.out.println("during test");
		
	}
	
	@AfterMethod
	
	public void cleanUp(ITestResult testResult) throws IOException {
		System.out.println(" after test");
		System.out.println("testResult get status :" + testResult.getStatus());
		System.out.println(" ITestResult.FAILURE : " + ITestResult.FAILURE);
		if (testResult.getStatus() == ITestResult.FAILURE) {
			System.out.println("Failed: " + testResult.getMethod().getMethodName());
			String filename = getRandomString(10) + ".png";
			String directory = System.getProperty("user.dir") + "//screenshots//";
			System.out.println(directory);
			File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(sourceFile, new File(directory + filename));
		}
		else
		{
			System.out.println("else madhio ala ");
		}
		
		driver.quit();
	}
	
	public static String getRandomString(int length) {
		StringBuilder sb = new StringBuilder();
		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		for (int i = 0; i < length; i++) {
			int index = (int)(Math.random() * characters.length());
			sb.append(characters.charAt(index));
		}
		return sb.toString();
	}

}
