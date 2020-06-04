package com.expedia.flightsbooking;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import page.classes.searchpage;

public class TestNG_TestSuite  {
	private WebDriver driver;
	private String baseUrl;
	static Logger log = Logger.getLogger(TestNG_TestSuite.class);

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		baseUrl = "https://www.expedia.com/";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PropertyConfigurator.configure("log4j.properties");
		driver.get(baseUrl);
	}

	@Test
	public void fillBasicInfo() throws Exception {
		searchpage.navigateToFlightsTab(driver);
		searchpage.fillOriginTextBox(driver, "New York");
		searchpage.fillDestinationTextBox(driver, "Chicago");
		searchpage.fillDepartureDateTextBox(driver, "04/27/2020");
		searchpage.fillReturnDateTextBox(driver, "04/30/2020");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
