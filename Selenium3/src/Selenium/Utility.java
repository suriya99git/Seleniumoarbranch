package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility extends BaseClass {

	
	public static void ScreenShot() throws IOException {
		
		TakesScreenshot t = (TakesScreenshot) driver;
		
		File from = t.getScreenshotAs(OutputType.FILE);
		
		File f = new File("./ScreenShot/photo.png");
		
		FileHandler.copy(from, f);
		
	}
}
