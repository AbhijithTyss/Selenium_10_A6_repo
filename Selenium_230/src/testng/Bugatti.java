package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bugatti {
	@Test(groups = "system")
	public void launch() {
		WebDriver driver=new ChromeDriver();
		
		driver.get("www.bugatti.com/");
		Reporter.log("Bugatti launched",true);
	}
}
