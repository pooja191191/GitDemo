package tutorialselenium;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendarselection1 {
	private WebDriver driver;
	private String baseUrl;


	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "http://www.expedia.com/";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void test() throws Exception {
			driver.get(baseUrl);
			driver.findElement(By.id("tab-flight-tab-hp")).click();
			WebElement departingField = driver.findElement(By.id("flight-departing-hp-flight"));
			departingField.click();
			WebElement calMonth = driver.findElement(By.xpath("//*[@id=\"flight-departing-wrapper-hp-flight\"]/div/div/div[2]"));
			
			List<WebElement> allValidDates = calMonth.findElements(By.tagName("a"));
			
			Thread.sleep(3000);
			
			for (WebElement date : allValidDates) {
				if (date.getText().equals("30")) {
					date.click();
					break;
				}
			}

		
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	}

	

}
