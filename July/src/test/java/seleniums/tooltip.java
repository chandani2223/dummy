package seleniums;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.jayway.awaitility.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class tooltip {
	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(op);
		
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        // Navigate to the target web page
       driver.get("https://www.google.com/");
       
       String act = driver.findElement(By.xpath("//textarea[@name='q']")).getAttribute("title");
       String exp = "Search";
       
       if(act.equals(exp)) {
    	   System.out.print("pass");
       }else {
			System.out.print("fail");
       }
	}
}
