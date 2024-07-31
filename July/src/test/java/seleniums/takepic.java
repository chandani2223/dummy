package seleniums;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class takepic {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\tester\\July_24\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		//TakesScreenshot ts = (TakesScreenshot)driver;
		WebElement ts =driver.findElement(By.xpath("//picture//img[@id='hplogo']"));
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\tester\\July_24\\pics\\pic2.png");
		
		FileUtils.copyFile(src, dest);
	}
}
