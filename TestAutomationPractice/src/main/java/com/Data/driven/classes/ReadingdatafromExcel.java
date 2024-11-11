package com.Data.driven.classes;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingdatafromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("E:\\Selenium workspace\\TestAutomationPractice\\TestData\\DataCreated.xlsx");
		 XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook .getSheet("Employee");
			int totalRows = sheet.getLastRowNum();
			int totalcells = sheet.getRow(2).getLastCellNum();
			System.out.println("total number of rows :"+totalRows);
			System.out.println("total number of cells :"+totalcells);
			
			for(int r=0;r<=totalRows;r++){
				
				XSSFRow Row = sheet.getRow(r);
				
				for(int c=0; c<totalcells; c++) {
					XSSFCell cell = Row.getCell(c);
					System.out.println(cell.toString()+"\t");
				}
				System.out.println();
			}
		
		workbook.close();
		file.close();
	}

}
