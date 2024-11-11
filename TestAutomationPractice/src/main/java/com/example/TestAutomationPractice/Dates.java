package com.example.TestAutomationPractice;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dates {
		
public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		System.out.println("Title name: "+driver.getTitle());
		System.out.println("Current url name: "+driver.getCurrentUrl());
	   
		driver.findElement(By.id("datepicker")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		String cMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		String cYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while (!(cMonth.equals("May") && cYear.equals("2029"))) {
			driver.findElement(By.xpath("//a[@data-handler='next']")).click();
			cMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			cYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		
		driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='17']")).click();

}
}
