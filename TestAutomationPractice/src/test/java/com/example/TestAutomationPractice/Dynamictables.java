package com.example.TestAutomationPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamictables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7000));
		driver.get("https://devrpm.kavanant.com/");
		driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys("vsumup@gmail.com");
		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Sandeep2@");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.switchTo().alert().accept();
		//WebElement profilebtn = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//div[@class='mat-ripple flex items-center rounded cursor-pointer relative trans-ease-out select-none py-1 pr-1 pl-3 hover:bg-hover']"))));
		//profilebtn.click();
		driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-button mat-button-base']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'V Sum')]")).click();
		driver.findElement(By.linkText("Document")).click();
		String text = driver.findElement(By.xpath("//div[contains(text(),' 1 – 10 of 72 ')]")).getText();
	    int total_pages = Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("pages")-1));
	    //repeating pages
	    for(int p=0; p<=total_pages; p++) {
	    	if(p>1) {
	    		WebElement active_page = driver.findElement(By.xpath("/button[@aria-label='Next page']//*[text()="+p+"]"));
	    		active_page.click();
	    	}
	    	//reading data from pages
	    	
	    }

	}

}
