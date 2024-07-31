package seleniums;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class paramtr {
	
	WebDriver driver;
	
	@Test
	@Parameters({"i","j"})
	public void para(int i, int j) {
		System.out.println("Addition : "+ (i+j));
	}
	
	@Test
	@Parameters({"i","j"})
	public void para1(int i, int j) {
		System.out.println("Subtraction : "+ (i-j));
	}
}
