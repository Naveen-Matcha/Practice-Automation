package com.example.TestAutomationPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ThreeBrowsers {
	
	public static WebDriver driver;
	
	public void openChrome() {
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
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
		driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-button mat-button-base']")).click();
		//search patient
	   driver.findElement(By.xpath("//button[@mattooltip='Search Patient']")).click();
	   driver.findElement(By.name("search")).sendKeys("naveen");
	   driver.findElement(By.xpath("//h4[contains(text(),' Kumar, Naveen ')]")).click();
		//user menu button
		//driver.findElement(By.xpath("//div[contains(text(),'V Sum')]")).click();
		//log out button
		//driver.findElement(By.linkText("Logout")).click();
		//driver.close();
		
	}
	public void openEdge() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://devapp.atria.healthcare/");
		driver.close();
	}
	public void openfirefox() {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions option = new FirefoxOptions();
		option.addArguments("--disable-notifications");
		driver = new FirefoxDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
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
		driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-button mat-button-base']")).click();
		//user menu button
		driver.findElement(By.xpath("//div[contains(text(),'V Sum')]")).click();
		//search patient
		driver.findElement(By.xpath("//button[@mattooltip='Search Patient']")).click();
		driver.findElement(By.name("search")).sendKeys("naveen");
		driver.findElement(By.xpath("//h4[contains(text(),' Kumar, Naveen ')]")).click();
		//log out button
		//driver.findElement(By.linkText("Logout")).click();
		//driver.close();
	}
	
	
	public static void main(String[] args) {
		ThreeBrowsers dv = new ThreeBrowsers();
		//dv.openEdge();
		dv.openChrome();
		//dv.openfirefox();
	}
		
	
	
}
