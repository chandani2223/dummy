package seleniums;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\tester\\July\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement r = driver.findElement(By.id("box2"));
		WebElement l = driver.findElement(By.id("box102"));
		
		WebElement r1 = driver.findElement(By.id("box5"));
		WebElement l1 = driver.findElement(By.id("box105"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(r, l).perform();
		act.dragAndDrop(r1, l1).perform();
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.google.com/");
		WebElement hvr = driver.findElement(By.xpath("//*[@class='Gdd5U'][1]"));
		
		act.moveToElement(hvr).perform();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		driver.close();
		
		
	}
}
