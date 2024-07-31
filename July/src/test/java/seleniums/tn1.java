package seleniums;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tn1 {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        
        // Initialize WebDriver with ChromeOptions
        ChromeOptions op = new ChromeOptions();
        op.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(op);
    }

    @Test
    @Parameters("keyword")
    public void abc(String keyword) {
        // Open Google website
        driver.get("https://www.google.com/");
        
        // Find the search input element and enter the keyword
        WebElement dd = driver.findElement(By.name("q"));
        dd.sendKeys(keyword);
        // You can add assertions or other interactions as needed.
    }
    
    

    @AfterMethod
    public void teardown() {
        // Quit the WebDriver after the test completes
        if (driver != null) {
            //driver.quit();
        }
    }
}
