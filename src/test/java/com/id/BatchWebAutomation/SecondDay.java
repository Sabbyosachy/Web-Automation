package com.id.BatchWebAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SecondDay extends BaseDriver {
	
String url="https://www.daraz.com.bd/";

@Test
public void OpenUrl() throws InterruptedException {
	driver.manage().window().maximize();
	driver.get(url);
	
	
	WebElement loginButton= driver.findElement(By.className("bld-txt"));
	loginButton.click();
	Thread.sleep(3000);
	
	//navigate use to another page back and forward
	driver.navigate().back();
	Thread.sleep(3000);
	
	driver.navigate().forward();
	Thread.sleep(3000);
	
	//Refresh
	driver.navigate().refresh();
	Thread.sleep(3000);
	
	//Another link
	driver.navigate().to("https://www.google.com");
	Thread.sleep(3000);
	
}

}
