package seleniums;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class tab {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\tester\\July\\drivers\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(op);

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.google.com");
		System.out.println("First Title : "+driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("http://www.google.com");
		System.out.println("Second Title : "+driver.getTitle());
		
		Set<String> win = driver.getWindowHandles();
		List<String> han = new ArrayList<String>();
		han.addAll(win);
		
		System.out.println("First Title : " + driver.switchTo().window(han.get(0)).getTitle());
		System.out.println("Second Title : " + driver.switchTo().window(han.get(1)).getTitle());
	
		



	}
}
