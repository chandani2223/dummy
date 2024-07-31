package seleniums;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
    public static void main(String[] args) {
        // Set up the WebDriver (path to your chromedriver)
        System.setProperty("webdriver.chrome.driver", "C:\\tester\\July_24\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        // Configure the WebDriver
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        // Navigate to the target web page
        driver.get("https://testautomationpractice.blogspot.com/");
        
        // Locate the table element
        WebElement table = driver.findElement(By.xpath("//table[@name='BookTable']"));
        
        // Extract and print the headers
        List<WebElement> headers = table.findElements(By.xpath(".//tr[1]/th"));
        System.out.println("Headers:");
        for (int i = 0; i < headers.size(); i++) {
            System.out.print(headers.get(i).getText() + "\t");
        }
        System.out.println();
        
        // Extract and print the rows and columns
        List<WebElement> rows = table.findElements(By.xpath(".//tr[position()>1]"));
        for (int i = 0; i < rows.size(); i++) {
            List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
            for (int j = 0; j < columns.size(); j++) {
                System.out.print(columns.get(j).getText() + "\t");
            }
            System.out.println();
        }
        
    }
}
