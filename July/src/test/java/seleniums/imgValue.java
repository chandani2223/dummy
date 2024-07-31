package seleniums;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class imgValue {
	WebDriver driver;
	@Test
	public void abc() {
	WebDriverManager.chromedriver().setup();
	ChromeOptions op = new ChromeOptions();
	op.addArguments("--remote-allow-origins=*");
	
	driver = new ChromeDriver(op);
	
	driver.get("https://www.google.com/");
	
	WebElement imgs = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
	
	System.out.println("Image src : "+imgs.getAttribute("src"));
	}
}
