package com.id.BatchWebAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class yourone extends myone {

String url="https://demo.nopcommerce.com";
	//String url="https://www.shohoz.com/";
	
	@Test
	public void openUrl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		String Actualtitle=driver.getTitle();
		System.out.println(Actualtitle);
		String ExpectedTitle ="nopCommerce demo store";
		if(Actualtitle.equalsIgnoreCase(ExpectedTitle )) {
			System.out.println("Title is matched");
		}
		else {
			System.out.println("Did not matched");
		}
		
		//variable 1 by id
		
		WebElement becomeAsearch=driver.findElement(By.id("small-searchterms"));
		
		becomeAsearch.click();
		becomeAsearch.sendKeys("new andriod phone");
		System.out.println(becomeAsearch.getAttribute("placeholder"));
		Thread.sleep(5000);
		
		//veriable 2 via xpath
		
		WebElement LoginButton=driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
		LoginButton.click();
		Thread.sleep(5000);
		
		
		//By name
		WebElement Email=driver.findElement(By.name("Email"));
		Email.clear();
		Email.sendKeys("Susan@gmail.com");
		System.out.println(Email.getAttribute("data-val-required"));
		Thread.sleep(5000);
		
		//text check
		WebElement TextCheck=driver.findElement(By.xpath("//div[contains(text(),'By creating an account on our website, you will be')]"));
		System.out.println(TextCheck.getText());
		String Fonts=TextCheck.getCssValue("font-size");
		System.out.println("Font size is : " +Fonts);
		
		String Color=TextCheck.getCssValue("background-color");
		System.out.println("color is : "+Color);
		
		//By className
//		WebElement Email=driver.findElement(By.className("email"));
//		Email.sendKeys("sus@gmail,com");
//		Thread.sleep(5000);
//		//Link text
//		WebElement LinkText=driver.findElement(By.linkText("Forgot password?"));  //link text je name ache oi name dite hobe
//		LinkText.click();
//		Thread.sleep(5000);
		
		//Partial LinkText Ektu mil thakle check korbe
//		WebElement ParticalLink=driver.findElement(By.partialLinkText("Forgot"));
//		ParticalLink.click();
//		Thread.sleep(5000);
//		
		//Tagname check Xpath=//tagname[@attribute='value'],  //*[@type="button" or/and @class="button-1 register-button"]
		//*[contains(text(),'value')]  , //*, img[contains(text(),'Register') and @class="button-1 register-button"]
		// starts-with //*[starts-with(text(),'value')] 
	}
	
	
}
