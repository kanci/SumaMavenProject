package com.test;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMApplication {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.id("btnLogin")).click();
		
		driver.close();
	}

}
