package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromedriverwindows {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\microsoft\\eclipse-workspace\\libs\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "http://www.gmail.com";
		driver.get(baseURL);

	}

}
