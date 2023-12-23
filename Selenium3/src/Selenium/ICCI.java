package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICCI {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		
		List<WebElement> country = driver.findElements(By.xpath("//td[@class='table-body__cell table-body__cell--position u-text-right']/following-sibling::td[1]"));
		
		List<WebElement> matches = driver.findElements(By.xpath("//td[@class='table-body__cell table-body__cell--position u-text-right']/following-sibling::td[2]"));
		
		 List<WebElement> points = driver.findElements(By.xpath("//td[@class='table-body__cell table-body__cell--position u-text-right']/following-sibling::td[3]"));
		 
		List<WebElement> rating = driver.findElements(By.xpath("//td[@class='table-body__cell table-body__cell--position u-text-right']/following-sibling::td[4]"));
		for (int i = 0; i < country.size(); i++) {
			
			System.out.println(country.get(i).getText()+"------>"+" Matches : "+ matches.get(i).getText()+" Points : "+points.get(i).getText()+" rating : "+rating.get(i).getText());
		}

	}
}
