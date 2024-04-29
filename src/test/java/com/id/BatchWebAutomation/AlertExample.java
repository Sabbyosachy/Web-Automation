package com.id.BatchWebAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertExample extends BaseDriver {

	String url="https://demoqa.com/alerts";
	@Test
	public void openUrl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement newIteam=driver.findElement(By.id("alertButton"));
		newIteam.click();
		Thread.sleep(2000);
//		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		
		WebElement Alert2=driver.findElement(By.id("confirmButton"));
		Alert2.click();
		Thread.sleep(2000);
		alert.dismiss();
		Thread.sleep(2000);
		
		
		
		WebElement Alert3=driver.findElement(By.id("promtButton"));
		Alert3.click();
		Thread.sleep(2000);
		Alert3.sendKeys("Hello");
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
	}
	
	
}
