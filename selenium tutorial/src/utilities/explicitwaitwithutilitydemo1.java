package utilities;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.waittype1;


public class explicitwaitwithutilitydemo1 {
	private WebDriver driver;
	private String baseUrl;
	waittype1 wt;



	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://letskodeit.teachable.com/pages/practice";
		wt = new waittype1(driver);

		// Maximize the browser's window
		driver.manage().window().maximize();

	}
	
	@Test
	public void test() {
		driver.get(baseUrl);
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		loginLink.click();
		
		WebElement emailField = wt.waitForElement(By.id("user_email"), 3);
		emailField.sendKeys("test");
		
		wt.clickWhenReady(By.name("commit"), 3);	
	}


	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();

	}

	
}
