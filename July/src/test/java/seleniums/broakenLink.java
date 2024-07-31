package seleniums;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broakenLink {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\tester\\July_24\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		int resCode = 200; //200 res code valid link
		int brokenlink = 0;
		
		System.out.println("Total Links :" + link.size());
		
		for(WebElement ele : link) {
			
			String url = ele.getAttribute("href");
			
			try {
				URL urlLink = new URL(url);
				HttpURLConnection huc = (HttpURLConnection)urlLink.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();
				
				resCode = huc.getResponseCode();
				
				if(resCode >= 400) {
					System.out.println("Broken Link :" + url);
					brokenlink++;
				}
				
			} catch (MalformedURLException e) {
				
			}
		}
		System.out.println("Broken Links : " +brokenlink);
	}
}
