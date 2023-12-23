package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task1 {


	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.partialLinkText("Digital downloads")).click();
		driver.findElement(By.linkText("Shopping cart")).click();
		//boolean temp = driver.findElement(By.xpath("(//a[text()='3rd Album'])[2]")).isDisplayed();
		
//		if(driver.findElement(By.xpath("(//a[text()='3rd Album'])[2]")).isDisplayed()) {
//			System.out.println("pass");
//		}
//		else {
//			System.out.println("fail");
//		}
////		try {
//			driver.findElement(By.className("cart-item-row")).isDisplayed()) {
//				System.out.println("Iteam added");
//		
////		}
////		catch(Exception e) {
//
//			System.out.println("Iteam is not added");
////		}
//
//	}

	//	 WebElement cart = driver.findElement(By.className("cart-item-row"));
		
	//	System.out.println(cart.getSize());
		
		List<WebElement> iteam = driver.findElements(By.className("cart-item-row"));
		
		if(iteam.size()>0) {
			System.out.println("Iteam added");
		}else {
			System.out.println("Iteam is not added");
		}
	}

}
