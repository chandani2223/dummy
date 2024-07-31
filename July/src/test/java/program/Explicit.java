package program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\tester\\July\\drivers\\chromedriver.exe");
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(op);
		
		driver.get("https://www.google.com/");
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement ww = w.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		ww.click();
	}
}
