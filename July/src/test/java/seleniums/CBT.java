package seleniums;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CBT {

	WebDriver driver;	
	
	@BeforeMethod
	@Parameters("browser")
	public void test1(String browser) {
		
		switch(browser.toLowerCase()) {
		
		case  "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\tester\\July\\drivers\\chromedriver.exe");
			ChromeOptions op = new ChromeOptions();
			op.addArguments("--remote-allow-origins=*");		
			driver = new ChromeDriver(op);
			break;
			
		case  "firefox":
			System.setProperty("webdriver.firefox.driver", "C:\\tester\\July\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;	
			
			default :
				System.out.println("Not Open");
		}		
	}
	
	@Test
	public void br() {
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
}
