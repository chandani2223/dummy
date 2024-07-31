package seleniums;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\tester\\July_24\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://myudyogaadhar.org/");

		//organization
		WebElement org = driver.findElement(By.xpath("//select[@id='organisation_type']"));
		Select sc = new Select(org);
		List<WebElement> drp = sc.getOptions();
		
		for(int i=0; i<drp.size(); i++) {
			String name_org = drp.get(i).getText();
			if(name_org.equalsIgnoreCase("Proprietorship Firm")) {
				
				drp.get(i).click();
				System.out.println("Name : " + name_org);
				break;
			}
		}
		Thread.sleep(2000);
		//state
		WebElement st = driver.findElement(By.xpath("//select[@id='office_state']"));
		Select scc = new Select(st);
		List<WebElement> sname = scc.getOptions();
		
		for(int i=0; i<sname.size(); i++) {
			String name = sname.get(i).getText();
			if(name.equalsIgnoreCase("ASSAM")) {
				sname.get(i).click();
				System.out.println("Name : "+name);
				break;
			}
		}
		
	}
}






