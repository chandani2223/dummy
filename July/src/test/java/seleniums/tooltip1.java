package seleniums;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tooltip1 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\tester\\July\\drivers\\chromedriver.exe");
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(op);
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/tooltip/");
		driver.switchTo().frame(0);
		String act = driver.findElement(By.id("age")).getAttribute("title");
		String exp = "We ask for your age only for statistical purposes.";
		
		if(act.equals(exp)) {
			System.out.println("pass");
			
		}else {
			System.out.println("fail");
		}

	}

}
