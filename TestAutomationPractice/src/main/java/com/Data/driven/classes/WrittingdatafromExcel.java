package com.Data.driven.classes;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrittingdatafromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file = new FileOutputStream("E:\\Selenium workspace\\TestAutomationPractice\\TestData\\DataCreated.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook();
		XSSFSheet sheet = workBook.createSheet("Employee");
		XSSFRow row = sheet.createRow(0);
		row.createCell(0).setCellValue("java");
		row.createCell(1).setCellValue("17");
		row.createCell(2).setCellValue("selenium");
		
		XSSFRow row1 = sheet.createRow(1);
		row1.createCell(0).setCellValue("java");
		row1.createCell(1).setCellValue(19);
		row1.createCell(2).setCellValue("selenium");
		
		XSSFRow row2 = sheet.createRow(2);
		row2.createCell(0).setCellValue("python");
		row2.createCell(1).setCellValue(3);
		row2.createCell(2).setCellValue("selenium");
		
		workBook.write(file);
		workBook.close();
		file.close();
		System.out.println("File created ....");
		

	}

}
