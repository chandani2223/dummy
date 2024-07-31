package seleniums;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testautomationpractice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\tester\\July\\drivers\\chromedriver.exe");

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(op);

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.expedia.co.in/");

		driver.switchTo().frame(0);

		driver.findElement(By.xpath("//button[@data-testid='uitk-date-selector-input1-default']")).click();

		String day = "15";
		String month = "August";
		String year = "2025";

	}
}
