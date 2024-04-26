package com.id.BatchWebAutomation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newprcatice{
	
	@Test (priority=1)
	public void testCheck() {
		System.out.println("Test1 ----");
	}
	@Test (priority=0)
	public void testCheck1() {
		System.out.println("Test2 ----");
	}
	
	@BeforeSuite
	
	public void beforeSuite() {
		System.out.println("Before suite------");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite--------");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test----");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After test----");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class----");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class----");
	}
	@BeforeMethod   //@Test joto bar thakbe tar age @BeforeMethod run hobe
	public void beforeMethod() {
		System.out.println("Before Method----");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method----"); //proti ta test er por ekbar kore run hobe
	}
	
}




// Run be like
//Before suite------
//Before test----
//Before Class----
//Before Method----
//Test ----
//After Class----
//After test----
//After suite--------
