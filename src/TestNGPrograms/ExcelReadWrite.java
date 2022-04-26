package TestNGPrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class ExcelReadWrite {
  
	@Test
	public void Read() throws IOException, InterruptedException {
		
		FileInputStream fis = new FileInputStream("F:\\kite.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("Login");
		
		//Read data from Excel
		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		
		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		
		System.out.println(sheet.getRow(0).getCell(2).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(2).getStringCellValue());
		
		//Write data in Excel
		FileOutputStream fos = new FileOutputStream("F:\\kite.xlsx");
		Row row = sheet.createRow(6);
		Cell cell = row.createCell(6);
		cell.setCellValue("I Love My Kids");
		
		book.write(fos);
		fos.close();
		Thread.sleep(2000);
		System.out.println(sheet.getRow(6).getCell(6).getStringCellValue());
		
				
	}
}
