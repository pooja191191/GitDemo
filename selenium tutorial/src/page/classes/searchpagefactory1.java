package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchpagefactory1 {
WebDriver driver;
	
	//@FindBy(id="header-history")
	//WebElement headerHistory;
	
	@FindBy(id="tab-flight-tab-hp")
	WebElement flightTab;
	
	@FindBy(id="flight-origin-hp-flight")
	WebElement originCity;
	
	@FindBy(id="flight-destination-hp-flight")
	WebElement destinationCity;
	
	@FindBy(id="flight-departing-hp-flight")
	WebElement departureDate;
	
	@FindBy(id="flight-returning-hp-flight")
	WebElement returnDate;
	
	public searchpagefactory1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickflightTab() {
	//	headerHistory.click();
		flightTab.click();
	}
	
	public void setOriginCity(String origin) {
		originCity.sendKeys(origin);
	}
	
	public void setDestinationCity(String destination) {
		destinationCity.sendKeys(destination);
	}
	
	public void setdepartureDate(String departure) {
		departureDate.sendKeys(departure);
	}
	
	public void setreturnDate(String return1) {
		returnDate.sendKeys(return1);
	}
	
}
