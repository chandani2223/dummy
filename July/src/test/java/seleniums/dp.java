package seleniums;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dp {

	WebDriver driver;
	
	@DataProvider(name ="jiya")
	public Object[][] datas() {
		
		Object arr[][] = new Object[3][2];
		
		arr[0][0] = "ahmedabad";
		arr[0][1] = "jalebi";
		
		arr[1][0] = "ahmedabad";
		arr[1][1] = "bhel";
		
		arr[2][0] = "ahmedabad";
		arr[2][1] = "pani puri";		
		
		return arr;
	}
	
	@Test(dataProvider = "jiya")
	public void sendData(String name, String dish) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(op);
		driver.get("http://www.google.com/");
		WebElement dd = driver.findElement(By.name("q"));
		
		dd.sendKeys(name +" "+dish);
		dd.submit();
		
	}
}
