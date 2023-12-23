package Selenium;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("TestData//data.xlsx");
		
		XSSFWorkbook xlsx = new XSSFWorkbook(fis);
		
		Workbook w = new XSSFWorkbook(fis);
		
		 Sheet s = w.getSheet("sheet1");
		 
		 
		 Row r = s.getRow(0);
		 
		Cell c = r.getCell(0);
		
		System.out.println(c.getStringCellValue());
	
		String value = xlsx.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		
	}
}
