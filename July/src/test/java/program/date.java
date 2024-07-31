package program;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class date {
	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		
		WebDriver d = new ChromeDriver(op);
		
		d.manage().deleteAllCookies();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://testautomationpractice.blogspot.com/");
		
		WebElement dd = d.findElement(By.xpath("//input[@id='datepicker']"));
		dd.click();
		
		String em = "November";
		String ed = "2";
		String ey = "2025";
		
		while(true) {
		
			String m = d.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String y = d.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(em.equals(m) && ey.equals(y)) {
				
				List<WebElement> din = d.findElements(By.xpath("//body/div[5]/table/tbody/tr/td"));
				
				for(WebElement dins : din) {
					
					String dino = dins.getText();
					
					if(ed.equals(dino)) {
						dins.click();
						System.out.println("Selected Date : " + em +"/"+ ed +"/"+ ey);
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
