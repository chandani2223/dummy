package seleniums;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class invocationCounts {

	@Test(invocationCount = 3)
	public void hello(ITestContext con) {
		
		int n = con.getAllTestMethods()[0].getCurrentInvocationCount();
		System.out.println("Number :" +n);
		System.out.println("ok");
	}
}
