package seleniums;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class headless {

	WebDriver driver;
	@Test
	public void hedless() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op = new ChromeOptions();
		//op.setHeadless(true);
		op.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(op);
		
		driver.get("https://www.google.com/");
		
	}
}
