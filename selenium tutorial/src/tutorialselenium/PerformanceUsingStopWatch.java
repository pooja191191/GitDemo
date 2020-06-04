package tutorialselenium;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.classes.SearchPageFactory2;
import utilities.Constants;
import performance.ExcelUtility;


public class PerformanceUsingStopWatch {
	private WebDriver driver;
	private String baseUrl;
	SearchPageFactory2 searchpage;
	static Logger log = Logger.getLogger(PerformanceUsingStopWatch.class);
	StopWatch watch = new StopWatch();
	
	@BeforeClass
	public void beforeClass() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
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
	public void searchFlight() throws Exception {
		watch.start();
		driver.get(baseUrl);
		searchpage.clickFlightsTab();
		searchpage.setOriginCity("New York");
		searchpage.setDestinationCity("San Francisco");
		searchpage.setDepartureDate("04/28/2020");
		searchpage.setReturnDate("04/30/2020");
		double seconds = (double)watch.getTime() / 1000.0;
		watch.reset();
		log.info("**********************************************");
		log.info("Time taken to exeute this method was: " + seconds + " seconds");
		ExcelUtility.setCellData("Flight Page", 1, 0);
		ExcelUtility.setCellData(seconds, 1, 1);
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}


}
