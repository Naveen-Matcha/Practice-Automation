package com.Data.driven.classes;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDcalculator {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		driver.manage().window().maximize();
		driver.findElement(By.id("wzrk-cancel")).click();
		String filePath = System.getProperty("user.dir")+"\\TestData\\datadriven.xlsx";
		int rows = ExcelUtils.getRowCount(filePath, "Sheet1");
		
		for(int i=1;i<=rows;i++) {
			//read data from excel
			String prin = ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
			String rateOfInterest = ExcelUtils.getCellData(filePath, "Sheet1", i, 1);
			String period1 = ExcelUtils.getCellData(filePath, "Sheet1", i, 2);
			String period2 = ExcelUtils.getCellData(filePath, "Sheet1", i, 3);
			String freQuency = ExcelUtils.getCellData(filePath, "Sheet1", i, 4);
			String exp_matu = ExcelUtils.getCellData(filePath, "Sheet1", i, 5);
			//pass data in to application
			driver.findElement(By.id("principal")).sendKeys(prin);
			driver.findElement(By.id("interest")).sendKeys(rateOfInterest);
			driver.findElement(By.id("tenure")).sendKeys(period1);
			Select perDropdown = new Select(driver.findElement(By.id("tenurePeriod")));
			perDropdown.selectByVisibleText(period2);
			Select fre = new Select(driver.findElement(By.id("frequency")));
			fre.selectByVisibleText(freQuency);
			driver.findElement(By.xpath("//div[@class='CTR PT15']//a[1]")).click();
			//validation
			String act_mvalue = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			if(Double.parseDouble(exp_matu)== Double.parseDouble(act_mvalue)) {
				System.out.println("Test passed");
				ExcelUtils.setCellData(filePath, "Sheet1", i, 7,"passed");
			}else {
				System.out.println("Test failed");
				ExcelUtils.setCellData(filePath, "Sheet1", i, 7,"failed");
			}
			driver.findElement(By.xpath("//div[@class='CTR PT15']//a[2]")).click();
			
		}
		driver.quit();
	}

}
