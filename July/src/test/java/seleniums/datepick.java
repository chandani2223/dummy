package seleniums;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class datepick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\tester\\July\\drivers\\chromedriver.exe");
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(op);
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("datepicker")).click();
		
		String day = "15";
		String month = "August";
		String year = "2025";
		
		while(true) {
			
			String cmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String cyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(cmonth.equals(month) && cyear.equals(year)) {
				
				List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
				
				for(WebElement dt : days) {
					String dd = dt.getText();
					if(dd.equals(day)) {
						
						dt.click();
						System.out.println("Selected Date : " + month +"/"+ day +"/"+ year);
						break;
					}
				}
				break;
			}
			else {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
		}
		
		
		
		
		
		
	}
}
