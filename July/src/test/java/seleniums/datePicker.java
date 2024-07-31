package seleniums;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class datePicker {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\tester\\July\\drivers\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(op);

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		// Navigate to the URL
		driver.get("http://www.jqueryui.com/datepicker/");

		String  day = "23";
		String momth = "November";
		String year = "2024";

		// Switch to the frame containing the date picker
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));

		// Locate the date picker input field and click it
		WebElement date = driver.findElement(By.id("datepicker"));
		date.click();

		while(true) {

			String cmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String cyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if(cmonth.equals(momth) && cyear.equals(year)) {

				List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));

				for(WebElement cday : days) {

					String dd = cday.getText();
					if(dd.equals(day)) {
						cday.click();
						System.out.println("Selected date : "+cmonth+"/"+dd+"/"+cyear);
						break;
					}
				}
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
		}



	}
}
