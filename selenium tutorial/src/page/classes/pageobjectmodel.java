package page.classes;



import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.classes.searchpage;

public class pageobjectmodel {
	private WebDriver driver;
	private String baseUrl;


	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://www.expedia.com/";
		
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		driver.get(baseUrl);
		searchpage.navigateToFlightsTab(driver);
		searchpage.fillOriginTextBox(driver, "New York");
		searchpage.destinationTextBox(driver).sendKeys("Chicago");
		
		searchpage.departureDateTextBox(driver).sendKeys("04/30/2020");
		// Added a line to clear the return date text box
		// before entering the return date, because Expedia by default
		// enters the return date same as the departure date
		searchpage.returnDateTextBox(driver).clear();
		searchpage.returnDateTextBox(driver).sendKeys("05/03/2020");
		
		searchpage.clickOnSearchButton(driver);
	}
	
	
	@After
	public void tearDown() throws Exception {
		
		

	}

	

}
