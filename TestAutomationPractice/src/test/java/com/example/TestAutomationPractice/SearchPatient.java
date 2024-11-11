package com.example.TestAutomationPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchPatient {
	
	
	public static WebDriver driver;
	
	public void  browserLaunch() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://devrpm.kavanant.com/");
		
	}
	
	public void Loginpage() {
		//login page
				WebElement username = driver.findElement(By.xpath("//input[@formcontrolname='username']"));
				username.clear();
				username.sendKeys("vsumup@gmail.com");
				
				WebElement password = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
				password.clear();
				password.sendKeys("Sandeep2@");
				
				driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	public void addPatient() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 driver.findElement(By.xpath("//button[@mattooltip='Search Patient']")).click();
		   //click on add patient
		   driver.findElement(By.linkText("Add New Patient")).click();
		   driver.findElement(By.xpath("//input[@formcontrolname='firstName']")).sendKeys("Naresh");
		   driver.findElement(By.xpath("//input[@formcontrolname='lastName']")).sendKeys("Test");
		   driver.findElement(By.xpath("//input[@formcontrolname='address1']")).sendKeys("california");
		   driver.findElement(By.xpath("//input[@formcontrolname='zip']")).sendKeys("524301");
		   driver.findElement(By.xpath("//input[@formcontrolname='city']")).sendKeys("hyderabad");
		   //country dropdown
		  driver.findElement(By.xpath("//mat-select[@formcontrolname='countryId']")).click();
		  driver.findElement(By.xpath("//span[@class='mat-option-text']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//mat-select[@formcontrolname='stateId']")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'American Samoa')]")).click();
		   driver.findElement(By.xpath("//input[@formcontrolname='mobile']")).sendKeys("7466746584");
		   driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("naveen.m@kavanant.com");
		   //Date picker
//		   driver.findElement(By.xpath("//input[@formcontrolname='dob']")).click();
//		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("mat-calendar-table")));
//		   
//		   String cMonth = driver.findElement(By.className("mat-custom-date-year-monthday")).getText();
//		   String cYear = driver.findElement(By.xpath("(//button[@aria-label='Change to years view'])[1]")).getText();
//		   
//		   while (!(cMonth.equals("Jun")&& cYear.equals("2023"))) {
//			driver.findElement(By.xpath("//button[@aria-label='Previous month']")).click();
//			cMonth = driver.findElement(By.className("mat-custom-date-year-monthday")).getText();
//			cYear = driver.findElement(By.xpath("(//button[@aria-label='Change to years view'])[1]")).getText();
//		}
//		   driver.findElement(By.xpath("//div[contains(text(),'16')]")).click();
		   
		 driver.findElement(By.xpath("//mat-select[@formcontrolname='gender']")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'Female')]")).click();
		 driver.findElement(By.xpath("//textarea[@formcontrolname='notes']")).sendKeys("patient details add");
		  
	}
	
	public void searchPatient() {
		  driver.findElement(By.xpath("//button[@mattooltip='Search Patient']")).click();
		   driver.findElement(By.name("search")).sendKeys("naveen");
		   driver.findElement(By.xpath("//h4[contains(text(),' Kumar, Naveen ')]")).click();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SearchPatient object = new SearchPatient();
		object.browserLaunch();
		object.Loginpage();
		object.addPatient();
		//object.searchPatient();
		//close button popup
		//driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-button mat-button-base']")).click();
		//search patient
	  
	}

}
