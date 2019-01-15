package com.demo.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Grid\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();;
		WebElement button2 = driver.findElement(By.xpath("//*[@id='content']/p[3]/button"));
		button2.click();
		WebElement button1 = driver.findElement(By.id("button1"));
		button1.click();
		WebElement button3 = driver.findElement(By.xpath("//*[@id='content']/p[3]/button"));
		button3.click();
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		for (String handle : handles) {
			driver.switchTo().window(handle);
			if (driver.getTitle().contains("QA Automation Tools Tutorial")) {
				break;
			}
		}
		System.out.println(driver.getTitle());
		driver.close();
		driver.quit();
	}

}
