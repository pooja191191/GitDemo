package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findbylinktext {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://learn.letskodeit.com/p/practice";
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//String baseURL = "https://letskodeit.teachable.com/";
		driver.get(baseURL);
		
		driver.findElement(By.linkText("Login")).click();
		//Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Pract")).click();
	}

}
