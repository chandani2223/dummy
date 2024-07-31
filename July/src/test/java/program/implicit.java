package program;

import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicit {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		
		WebDriver d = new ChromeDriver(op);
		
		d.manage().deleteAllCookies();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://testautomationpractice.blogspot.com/");
		JavascriptExecutor js = (JavascriptExecutor)d;
		
		//WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(10));
		//WebElement g = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='datepicker']")));
		//g.click();	
		//d.switchTo().frame(0);
		WebElement dd=d.findElement(By.xpath("//input[@id='datepicker']"));
		dd.click();
		
		js.executeScript("arguments[0].style.border='5px solid red'", dd);
		
		String em = "October";
		String ey = "2024";
		String ed = "7";
		
		while(true) {
			
			String m = d.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String y = d.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(em.equals(m) && ey.equals(y)) {
				
				List<WebElement> day = d.findElements(By.xpath("//body/div[5]/table/tbody/tr/td"));
				
				for(WebElement din : day ) {
					
					String ssdin = din.getText();
					
					if(ed.equals(ssdin)) {
						
						din.click();
						System.out.println("Selected date :" + em +"/"+ ed +"/"+ey);
						break;
					}
				}
				break;
			}
			else {
				d.findElement(By.xpath("//*[text()='Next']")).click();
			}
		}
		
	}
}
