package com.test;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		Thread.sleep(5000);
       List<WebElement> dropDown = driver.findElementsByXPath("//ul[@class='dropdown-menu']/li/a");
       
       for (WebElement each : dropDown) {
    	   Thread.sleep(5000);
    	   
    	   String innerhtml=each.getAttribute("innerHTML");
    	   
    	   System.out.println("values from dropdown is " + innerhtml);
    	   
    	   if(innerhtml.contentEquals("JavaScript")) {
    		   each.click();
    	   
    	       //driver.close();
    	   }
       }
       
	}

}
