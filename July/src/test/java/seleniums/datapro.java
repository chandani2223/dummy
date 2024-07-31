package seleniums;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datapro {
	
	WebDriver driver;
	
	@DataProvider(name = "set")
	public Object[][] data(){
		
		Object a[][] = new Object[3][2];
		
		a[0][0] = "jiya";
		a[0][1] = "piya";		

		a[1][0] = "miya";
		a[1][1] = "riya";

		a[2][0] = "diya";
		a[2][1] = "siya";				
		
		return a;
	}
	
	@Test(dataProvider = "set")
	public void passdata(String name , String name1) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(op);
		
		driver.get("https://www.google.com/");
		
		WebElement dd=driver.findElement(By.name("q"));
		dd.sendKeys(name +" "+name1);
		dd.submit();
	}

}
