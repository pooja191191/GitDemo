package performance;
import org.testng.annotations.Test;

import page.classes.SearchPageFactory2;
import utilities.Constants;
import performance.ExcelUtility;

import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import java.lang.reflect.Method;

public class PerformanceTesting {
	long startTime;
	long endTime;
	long duration;
	double seconds;
	
	private WebDriver driver;
	private String baseUrl;
	SearchPageFactory2 searchpage;
	static Logger log = Logger.getLogger(PerformanceTesting.class);

	@BeforeClass
	public void beforeClass() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		//System.setProperty("webdriver.gecko.driver", 
				//"/Users/atomar/Documents/workspace_personal/selenium/geckodriver");
		driver = new ChromeDriver();
		baseUrl = "https://www.expedia.com/";
		searchpage = new SearchPageFactory2(driver);

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Tell the code about the location of Excel file
		ExcelUtility.setExcelFile(Constants.File_Path + Constants.File_Name, "Sheet1");
	}

	@Test
	public void searchFlight(Method name) throws Exception {
		startTime = System.nanoTime();
		driver.get(baseUrl);
		searchpage.clickFlightsTab();
		searchpage.setOriginCity("New York");
		searchpage.setDestinationCity("San Francisco");
		searchpage.setDepartureDate("04/27/2020");
		searchpage.setReturnDate("04/30/2020");
		endTime = System.nanoTime();
		duration = endTime - startTime;
		seconds = (double)duration / 1000000000.0;
		log.info("*****************************************");
		log.info("Time taken to execute this method: " + seconds + " seconds");
		// When you create the excel file, you should create row and type Flights Page in the row you are trying to write
		// If there is nothing in the row, the code will fail
		ExcelUtility.setCellData("Flights Page", 1, 0);
		ExcelUtility.setCellData(seconds, 1, 1);
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
