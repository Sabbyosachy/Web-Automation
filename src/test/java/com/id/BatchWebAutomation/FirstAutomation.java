package com.id.BatchWebAutomation;

import org.testng.annotations.Test;

public class FirstAutomation extends BaseDriver2 {

	String Url= "https://www.youtube.com/";
	
	@Test
	public void openUrl() throws InterruptedException {
		driver.get(Url);   //url open get use
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
}
