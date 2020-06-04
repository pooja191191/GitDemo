package javascriptexecution;



import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptclick1 {
	private WebDriver driver;
	private JavascriptExecutor js;


	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.retailmenot.com/");
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/button[2]")).click();
		Thread.sleep(3000);
		
		WebElement checkBoxElement = driver.findElement(By.id("subscribe"));
		System.out.println("Displayed: " + checkBoxElement.isDisplayed());
		System.out.println("Selected: " + checkBoxElement.isSelected());
		
		//checkBoxElement.click();
		js.executeScript("arguments[0].click();", checkBoxElement);
	}
	
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	

}
