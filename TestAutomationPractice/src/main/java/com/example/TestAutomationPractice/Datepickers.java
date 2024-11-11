package com.example.TestAutomationPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepickers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions option = new FirefoxOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new FirefoxDriver(option);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://devrpm.kavanant.com/");
		//login page
				WebElement username = driver.findElement(By.xpath("//input[@formcontrolname='username']"));
				username.clear();
				username.sendKeys("vsumup@gmail.com");
				
				WebElement password = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
				password.clear();
				password.sendKeys("Sandeep2@");
				
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				//close button popup
				//driver.findElement(By.xpath("//span[contains(text(),'CLOSE')]")).click();//when login into web close button
				
				//Date picker
				/*
				 * String year="2023"; String month="NOV"; String day ="21";
				 */
						
				  WebElement datepick =
				  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Open calendar']"))); datepick.click();
				  //select year and month
				  while(true) {
					  String currentMonth = driver.findElement(By.xpath("//span[@class='mat-custom-date-year-monthday']")).getText();
					  String currentYear = driver.findElement(By.xpath("//span[contains(text(),'2023')]")).getText();
					 if(currentMonth.equals("MAY")&& currentYear.equals("2023")){
						 break;
					 }
					 driver.findElement(By.xpath("//button[@aria-label='Previous month']")).click();
					//WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Previous month']")));
					//button.click();
				  }
				 
				
				   

				 
				 

	}

}
