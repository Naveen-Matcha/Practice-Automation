package com.example.TestAutomationPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EHRDatepicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//div[@class='labelCalendarContainer']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='DatePicker__MainBlock-sc-1kf43k8-1 hHKFiR']")));
		driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[3]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'29')]")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//li[@data-text='Account']")).click();
//		driver.findElement(By.id("user_sign_in_sign_up")).click();
//		Thread.sleep(4000);
//		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
//		driver.switchTo().frame(iframe);
//		driver.findElement(By.id("mobileNoInp")).sendKeys("7634736877");
//		driver.switchTo().defaultContent(); 
//        driver.findElement(By.xpath("(//div[@title='close'])[2]")).click();
//        Thread.sleep(4000);
		driver.findElement(By.id("src")).sendKeys("kava");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//text[contains(text(),'Kavali')])[1]")).click();
		driver.findElement(By.id("dest")).sendKeys("hydera");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//text[contains(text(),'Hyderabad')])[1]")).click();
		driver.findElement(By.id("search_button")).click();
		Thread.sleep(4000);
		List<WebElement> BUSTYPES = driver.findElements(By.xpath("(//ul[@class='list-chkbox'])[1]//label[@class='custom-checkbox']"));
		for(int i=0; i<BUSTYPES.size(); i++){
			BUSTYPES.get(i).click();
		}
		
		List<WebElement> arrivalTIME = driver.findElements(By.xpath("(//ul[@class='dept-time at-time-filter'])[1]//li[@class='checkbox']"));
		
		for(WebElement checkbox : arrivalTIME) {
			checkbox.click();
		}
		//bus selection
		driver.findElement(By.xpath("(//i[@class='p-left-10 icon icon-down'])[1]")).click();
		Thread.sleep(2000);
		//seat selection
		driver.findElement(By.xpath("(//div[@class='button view-seats fr'])[1]")).click();
		Thread.sleep(2000);
		//select BOARDING POINT
		driver.findElement(By.xpath("(//div[@class='radio-unchecked'])[1]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath(""))
		//select DROPPING POINT
		driver.findElement(By.xpath("(//div[@class='radio-unchecked'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gotoseat_btn")).click();
		
		
		

	}

}
