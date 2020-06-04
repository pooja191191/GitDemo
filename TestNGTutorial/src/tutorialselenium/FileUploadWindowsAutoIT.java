package tutorialselenium;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
//import tutorialselenium.EnterPassword;


public class FileUploadWindowsAutoIT {
	private WebDriver driver;
	private String baseUrl;

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		baseUrl = "https://www.gmail.com/";
		driver = new ChromeDriver();;

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	
	@Test
	public void fileUpload() throws AWTException, InterruptedException, IOException {
		driver.findElement(By.id("identifierId")).sendKeys("gaudpooja19");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("gfestival"); // Enter your password
		//EnterPassword.enterPassword(driver); // Comment this
		driver.findElement(By.id("//*[@id=\"passwordNext\"]/span/span")).click();
		driver.findElement(By.xpath("//*[@id=\":lf\"]/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\":qz\"]")).sendKeys("letskodeit@gmail.com");
		driver.findElement(By.xpath("//*[@id=\":qh\"]")).sendKeys("Test File Upload");
		WebElement fileInput = driver.findElement(By.xpath("//*[@id=\":rz\"]"));
		fileInput.click();
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("C:\\Users\\microsoft\\eclipse-workspace\\selenium tutorial\\script\\fileupload.exe");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\":q7\"]")).click();
	}

	@AfterClass
	public void afterClass() {
	}

}
