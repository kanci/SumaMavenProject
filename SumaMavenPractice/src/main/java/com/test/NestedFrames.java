package com.test;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class NestedFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    
	    
	    driver.switchTo().frame("frame1").switchTo().frame("frame3");
	    
	    //driver.switchTo().frame("frame3");
	    
	    driver.findElement(By.xpath("//input[@id='a']")).click();
	    
	    
	}

}
