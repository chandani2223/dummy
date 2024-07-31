package seleniums;

import org.junit.Assert;
import org.testng.annotations.Test;

public class failtc {

	@Test
	public void abc() {
		Assert.assertTrue(true);
	}	
	
	@Test
	public void abc1() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void abc2() {
		Assert.assertTrue(false);
	}
}
