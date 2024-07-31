package seleniums;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\tester\\July_24\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		WebElement ss = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		ss.sendKeys("java");
		ss.submit();
		driver.close();
		
		
	}
}
