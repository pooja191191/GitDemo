package demo;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xx {
	public static void main(String[] args) {
		//
		//http://chromedriver.storage.googleapis.com/index.html
			String baseURL = "http://www.google.com";
			//WebDriver driver;
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\microsoft\\eclipse-workspace\\libs\\chromedriver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				
				ChromeOptions option = new ChromeOptions();
				option.addExtensions(new File("C:\\Users\\microsoft\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\\aapocclcgogkmnckokdopfmhonfmgoek\\0.10_0.crx"));
				
				driver = new ChromeDriver(option);
				
				
				driver.get(baseURL);

	}
}
