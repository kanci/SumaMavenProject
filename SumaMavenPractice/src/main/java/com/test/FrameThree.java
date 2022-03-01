package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameThree {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    
	    
	    driver.switchTo().frame("frame2");
	    WebElement animalDropDown = driver.findElement(By.xpath("//select[@id='animals']"));
	    Select s = new Select(animalDropDown);
	    
	    s.selectByIndex(3);
	    driver.switchTo().defaultContent();//coming out from frame
	    
	    Thread.sleep(3000);
	    
	    driver.switchTo().frame("frame1");
	    
	    
	    driver.findElement(By.xpath("//b[@id='topic']/following::input")).sendKeys("A Friendly Topic");
	    
	}

}
