package com.demo.testNG.DP;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSimple {
	WebElement userName;
	WebElement password;
	WebElement submit;
	
	@DataProvider(name = "Authentication")
	public static Object[][] credentials() {

		// The number of times data is repeated, test will be executed the same no. of times

		// Here it will execute two times

		return new Object[][] { { "Admin", "admin@123" }, { "Admin", "admin" }};

	}

	// Here we are calling the Data Provider object with its Name

	
	@Test(dataProvider = "Authentication",groups={"TestNG","demo","TC007","dataProviderSimple"})
	public void test(String sUsername, String sPassword) {

		System.setProperty("webdriver.gecko.driver","G:\\Selenium Grid\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://newtours.demoaut.com/mercurywelcome.php";
		driver.get(baseUrl);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		userName= driver.findElement(By.name("userName"));//By id 
		password= driver.findElement(By.name("password"));//By name 
		submit= driver.findElement(By.name("login"));//By name 

		userName.sendKeys(sUsername);
		password.sendKeys(sPassword);
		submit.click();

		driver.quit();

	}

}


