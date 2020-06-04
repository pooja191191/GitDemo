package tutorialselenium;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import page.classes.searchpage2;


public class TestNG_TestCase  {
	private WebDriver driver;
	private String baseUrl;
	static Logger log = Logger.getLogger(TestNG_TestCase.class);

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		baseUrl = "https://www.expedia.com/";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PropertyConfigurator.configure("log4j.properties");
	}

	@Test
	public void testMethod() {
		driver.get(baseUrl);
		searchpage2.navigateToFlightsTab(driver);
		searchpage2.fillOriginTextBox(driver, "New York");
		searchpage2.destinationTextBox(driver, "Chicago");
		searchpage2.departureDateTextBox(driver, "04/30/2020");
		searchpage2.returnDateTextBox(driver, "05/05/2020");
	}

	@AfterMethod
	public void afterMethod() {
	}


}
