package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTwo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    
	    //driver.switchTo().frame(0);
	    driver.switchTo().frame("singleframe");
	    //xpath is when user clicks first button: single frame
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi Suma");
	    
	    //single frame
	   //input textbox
	    

	}

}
