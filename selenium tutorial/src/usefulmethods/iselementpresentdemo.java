package usefulmethods;



import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import usefulmethods.genericmethods2;


public class iselementpresentdemo {
	private WebDriver driver;
	private String baseUrl;
	private genericmethods2 gm;


	@Before
	public void setUp() throws Exception {
			driver = new ChromeDriver();
			baseUrl = "https://letskodeit.teachable.com/pages/practice";
			gm = new genericmethods2(driver);

			// Maximize the browser's window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	

	@Test
	public void test() {
driver.get(baseUrl);
		
		boolean result1 = gm.isElementPresent("name", "id");
		System.out.println("Is Element Present: " + result1);
		
		boolean result2 = gm.isElementPresent("name-not-present", "id");
		System.out.println("Is Element Present: " + result2);
	}
		
	
	
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	

}
