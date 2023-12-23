
package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {

	public static WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void openBrowser(@Optional("chrome")String browserName) {
		if(browserName.equalsIgnoreCase("chrome"))
		{
		 driver = new ChromeDriver()  ;
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Invalid browser name");
		}
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://demowebshop.tricentis.com/");
	}
	
	@BeforeMethod
	public void Login() {
		driver.findElement(By.linkText("Log in")).click();
	}
	
	
	
	@AfterMethod
	public void Logout() {
		
		driver.findElement(By.linkText("Log out")).click();
	}
	
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
