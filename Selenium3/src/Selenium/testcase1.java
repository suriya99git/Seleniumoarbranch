package Selenium;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(TestngImplementation.class)
public class testcase1 extends BaseClass {

	@Test(dataProvider = "data")
	public void userCrediatial(String username,String password) throws InterruptedException {
	
		driver.findElement(By.id("Email")).sendKeys(username);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		//driver.findElement(By.linkText("Log out")).isDisplayed();
//		Assert.assertEquals(driver.findElement(By.linkText("Log out")).isDisplayed(),true);
//		
//		SoftAssert s = new SoftAssert();
//		
//		s.assertEquals(username, password);
		
	
	}
	
	@DataProvider(name = "data")
	public Object[][] Excel() throws EncryptedDocumentException, IOException{
		
		return ExcelPractice.excelData();
	}
	
}
