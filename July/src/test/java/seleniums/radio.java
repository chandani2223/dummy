package seleniums;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\tester\\July_24\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		List<WebElement> rd = driver.findElements(By.xpath("//input[@type='radio']"));
		
		System.out.println("List of Radio Buttons : " + rd.size());
	}
}
