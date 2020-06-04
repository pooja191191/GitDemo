package interviewquestions;



import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class elementnoclickabledemo {

	


	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Element is loaded in DOM, but it is overlapped by another element		
		// Element is not visible because of another element
		driver.get("https://www.freecrm.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("testing");
		WebDriverWait wait = new WebDriverWait(driver, 3);
		//boolean invisible = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("preloader")));
		//if (invisible) {
			//WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
			//loginButton.click();
		//}
		WebElement loginButtonJS = driver.findElement(By.xpath("//input[@value='Login']"));
		js.executeScript("arguments[0].click();", loginButtonJS);
	}

}
