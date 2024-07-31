package seleniums;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallel {

	WebDriver driver;
	
	@Test
	public void title() {		
		// Setup ChromeDriver using WebDriverManager
		WebDriverManager.chromedriver().setup();
		// Initialize WebDriver with ChromeOptions
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(op);
		// Open Google website
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}
	@Test
	public void url() {		
		// Setup ChromeDriver using WebDriverManager
		WebDriverManager.chromedriver().setup();
		// Initialize WebDriver with ChromeOptions
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(op);
		// Open Google website
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
	}
}
