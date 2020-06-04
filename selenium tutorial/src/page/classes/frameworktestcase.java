package page.classes;



import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.classes.searchpagefactory1;


public class frameworktestcase {
	private WebDriver driver;
	private String baseUrl;
	searchpagefactory1 searchPage;


	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://www.expedia.com/";
		
		searchPage = new searchpagefactory1(driver);

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);

	}
	
	@Test
	public void test() {
		searchPage.clickflightTab();
		searchPage.setOriginCity("New York");
		searchPage.setDestinationCity("San Francisco");
		searchPage.setdepartureDate("10/28/2015");
		searchPage.setreturnDate("10/31/2015");
		
	}
	
	@After
	public void tearDown() throws Exception {
	}

	

}
