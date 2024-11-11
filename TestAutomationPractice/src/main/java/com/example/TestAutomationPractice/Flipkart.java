package com.example.TestAutomationPractice;






import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {
	
	
	public static WebDriver driver;
	
	public void launchBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	}
	
	public void loginPage() throws InterruptedException {
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.linkText("My Profile")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("7780477180");
	}
	
	public void search() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("5g mobiles",Keys.ENTER);
		System.out.println("Url :"+driver.getCurrentUrl());
		//driver.findElement(By.linkText("Mobiles & Tablets")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Motorola g64 5G (Red Berry, 256 GB)')]")).click();
		Thread.sleep(5000);
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//WebElement phoneColor = driver.findElement(By.xpath("//div[contains(text(),'Mint Green')]"));
//
//	    Thread.sleep(3000);
//		driver.findElement(By.xpath("//li[@id='swatch-0-ram']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[@class='sBWZ-k']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@class='QqFHMw gtm1So']")).click();
//		driver.navigate().back();
//		
	}
	
	public void tearDown() {
		driver.close();
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Flipkart object = new Flipkart();
		object.launchBrowser();
		//object.loginPage();
		object.search();
		//object.tearDown();

	}

}
