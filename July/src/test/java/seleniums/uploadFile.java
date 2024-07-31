package seleniums;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class uploadFile {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\tester\\July_24\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/upload-download");
		
		//driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\tester\\pranchi_gupta.txt");
	
		WebElement cc= driver.findElement(By.xpath("//input[@id='uploadFile']"));
		Actions act = new Actions(driver);
		act.moveToElement(cc).click().perform();
	
	}
}
