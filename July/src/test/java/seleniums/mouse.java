package seleniums;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\tester\\July_24\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		
		WebElement rc = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		WebElement cc = driver.findElement(By.xpath("//button[text()='Click Me']"));
		WebElement dd = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		Actions act = new Actions(driver);
		act.contextClick(rc).build().perform();
		Thread.sleep(2000);
		act.click(cc).perform();
		Thread.sleep(2000);
		act.doubleClick(dd).perform();
	}
}
