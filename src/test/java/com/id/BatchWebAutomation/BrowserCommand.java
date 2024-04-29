package com.id.BatchWebAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrowserCommand extends BaseDriver {

	String url="https://www.daraz.com.bd/";
	
	@Test
	public void OpenUrl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement newIteam=driver.findElement(By.className("bld-txt"));
		newIteam.click();
		Thread.sleep(3000);
		
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		String MyUrl=driver.getTitle();
		System.out.println(MyUrl);
		String expect="Daraz.com.bd: Online Shopping Bangladesh - Mobiles, Tablets, Home Appliances, TV, Audio &amp; More";
		
		if(MyUrl.equalsIgnoreCase(expect)) {
			System.out.println("Title Matched");
		}
		else {
			System.out.println("Title Is Not Matched");
		}
		
		
		
	}
	
}
