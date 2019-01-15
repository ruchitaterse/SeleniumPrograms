package com.demo.webdriver.menuNavigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.demo.webdriver.implicitExplicitWait.BaseScript;

public class Test {
static WebDriver driver;
static BaseScript base;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url = "https://www.myntra.com/";
		base = new BaseScript();
		driver=base.launchDriverPara(url);
		submenu();
		
	}
	public static void submenu() throws InterruptedException {
		By women1 = By.linkText("Women");
		//WebElement women = driver.findElement(By.linkText("Women"));
		By dresses1 = By.xpath("//a[contains(text(), 'Dresses & Jumpsuits')]");
		//WebElement dresses = driver.findElement(By.xpath("//a[contains(text(), 'Dresses & Jumpsuits')]"));
		base.actionClick(women1, dresses1);
		
		By kids1 = By.linkText("Kids");
		//WebElement kid = driver.findElement(By.linkText("Kids"));
		By shoes1 = By.xpath("//a[contains(text(), 'Casual Shoes')]");
		//WebElement shoe = driver.findElement(By.xpath("//a[contains(text(), 'Casual Shoes')]"));
		base.actionClick(kids1, shoes1);
		
		By kids2 = By.linkText("Kids");
		//WebElement kid22 = driver.findElement(By.linkText("Kids"));
		By sportshoes1 = By.xpath("//a[contains(text(), 'Sports Shoes')]");
		//WebElement sportshoes = driver.findElement(By.xpath("//a[contains(text(), 'Sports Shoes')]"));
		base.actionClick(kids2, sportshoes1);
		
		
	
	}
}
