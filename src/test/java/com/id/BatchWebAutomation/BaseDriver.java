package com.id.BatchWebAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {

	WebDriver driver;
	
	@BeforeSuite
	public void startBrowser() {
		String browswerName=System.getProperty("browser", "chrome");
		
		if(browswerName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if(browswerName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
		}
		
	}
	
	@AfterSuite
	public void close() {
		driver.close();  //close() oi particular tab ke close kore ar quit() joto gula tab thgakbe shobe close korbe
         
	
	}
}
