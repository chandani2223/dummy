package seleniums;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class manager {
    public static void main(String[] args) {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        
        // Initialize WebDriver
        ChromeOptions op = new ChromeOptions();
        op.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(op);
        
        // Open Google website
        driver.get("https://www.google.com/");
     
    }
}
