package Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class fetch {

	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("TestData//pro.properties");
		
		Properties p = new Properties();
		
		p.load(fis);
		
		System.out.println(p.getProperty("url"));
		
	}
}
