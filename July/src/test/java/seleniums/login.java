package seleniums;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\tester\\July_24\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		String win = driver.getWindowHandle();
		driver.switchTo().window(win);
		driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Bolt")).click();
		
		driver.navigate().back();
		List<WebElement> str = driver.findElements(By.partialLinkText("Sauce1"));
		System.out.println("Total Links :" + str.size());
		
		Thread.sleep(2000);
		
		driver.close();
	}
}
