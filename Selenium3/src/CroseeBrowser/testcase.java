package CroseeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testcase extends Base {

	
	@Test
	public void testCase() {
		
		driver.findElement(By.linkText("Register")).click();
	
	}
}
