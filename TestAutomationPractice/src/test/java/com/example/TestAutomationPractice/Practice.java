package com.example.TestAutomationPractice;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("selenium", Keys.ENTER);
		//List<WebElement>  links = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']"));
//		List<WebElement> links = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy
//		(By.xpath("//div[@id='wikipedia-search-result-link']//a")));
//	    links.size();
//	    System.out.println("Total number of links :"+links.size());
//	    for(int i=0; i< links.size();i++) {
//	    	String openTab = Keys.chord(Keys.CONTROL ,Keys.ENTER);
//	    	links.get(i).sendKeys(openTab);
//	    }
//	    Set<String> window = driver.getWindowHandles();
//	    for(String windowId : window) {
//	    	String title = driver.switchTo().window(windowId).getTitle();
//	    	System.out.println(title);
//	    	if(title.equals("Selenium - Wikipedia")|| title.equals("Selenium dioxide - Wikipedia")) {
//	    		driver.close();
//	    	}
//	    }
		driver.findElement(By.id("alertBtn")).click();
		//driver.switchTo().alert().accept();
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();

		 

		/*
		 * System.out.println(driver.getTitle());//Automation Testing Practice
		 * System.out.println(driver.getCurrentUrl());//https://testautomationpractice.
		 * blogspot.com/ //System.out.println(driver.getPageSource());
		 * driver.findElement(By.id("name")).sendKeys("Naveen");
		 * driver.findElement(By.id("email")).sendKeys("naveen@gmail.com");
		 * Thread.sleep(2000); driver.findElement(By.id("male")).click();
		 * driver.findElement(By.id("tuesday")).click(); Thread.sleep(2000);
		 * driver.close();
		 */

	}

}
