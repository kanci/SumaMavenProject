package com.test;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotExample {
	public static ChromeDriver driver;
	public static int i=0;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		//making new class ScreenshotExample
		ScreenshotExample orange=new ScreenshotExample();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		orange.snap();//calling methods from that class

		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		orange.snap();
		driver.findElement(By.id("btnLogin")).click();
		orange.snap();


	}
	public void snap() throws IOException
	
	{
		Random r = new Random();
		if(r.nextInt()!=0)
		{
			i=i+1;
		}
		  
		//TakeScreenshot object, Call getScreenshotAs method to create image file
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  File dest = new File(".//images//pic"+i+".png");
		  FileUtils.copyFile(src, dest);
		  
				
	}
		
	//always remember to refresh, right click project and click refresh, pics or something will update

}
