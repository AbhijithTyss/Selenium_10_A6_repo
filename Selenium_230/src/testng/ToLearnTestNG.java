package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestNG {// TestNG class
	
	@Test
	public void register() {
		Reporter.log("register testcase executed",true);
	}
	
	
	@Test
	public void login() {// test case
		// test steps
		Reporter.log("login testcase executed",true);
	}
	
	@Test
	public void addToCart() {
		Reporter.log("addToCart executed",true);
	}
}
