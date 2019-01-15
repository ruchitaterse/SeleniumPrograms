package com.demo.testNG.Random;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	@BeforeTest
	public void LaunchBrowser() {
		System.out.println("Launch Browser");
	}
	@BeforeMethod
	public void Beforemethod() {
		System.out.println("Executing before method");
	}
	@Test
	public void method1() {
		System.out.println("This is a test method");
		Reporter.log("This is a first test case");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("Executing after method");
	}
	@AfterTest
	public void CloseBrowser() {
		System.out.println("Close Browser");
	}
}
