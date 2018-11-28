package com.clc.util;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		getUserCredentails();
	}
	
	
	@DataProvider
	public static Object[][] getUserCredentails() throws IOException{
		
		Object[][] testData = new Object[6][3];
		
		XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\Yogesh\\Desktop\\UserCredentails.xlsx");
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		Iterator<Row> rows = sheet.rowIterator();
		rows.next(); // skip header row
		int rowCount = 0;
		int colnCount = 0;
		while(rows.hasNext()){
				System.out.println("-----------------------------------------------------------------------------");
				Row row = rows.next();
				Iterator<Cell> cells = row.cellIterator();
				while(cells.hasNext()){
					Cell cell = cells.next();
					//System.out.print(cell.getStringCellValue() +"  |  ");
					if(cell.getStringCellValue().equals("Blank"))
						testData[rowCount][colnCount] ="";
					else
						testData[rowCount][colnCount] = cell.getStringCellValue();
					colnCount++;
				}
				rowCount++;
				colnCount=0;
		}
		
		return testData;
	}
	
}
