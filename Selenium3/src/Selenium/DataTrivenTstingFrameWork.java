package Selenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestngImplementation.class)
public class DataTrivenTstingFrameWork {

	@DataProvider(name ="Excel")
	public Object[][]excelData(){
		
		Object[][] data = new Object[2][3];
		
		data[0][0] = "Java";
		data[0][1] = "manikandan";
		data[1][0] = "SQL";
		data[1][1] = "Bharath";
		
		return data;
	}
	
	@Test(dataProvider = "Excel")
	public void m1(String username,String subject) {
		
		System.out.println(username+" : "+subject);
	}
}
