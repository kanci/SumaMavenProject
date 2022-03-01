package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		
		driver.findElement(By.xpath("//input[@name='alert']")).click();
		

		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
		
		driver.findElement(By.xpath("//input[@name='confirmation']")).click();
		
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(3000);
		alert2.dismiss();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='prompt']")).click();
		
		Alert alert3 = driver.switchTo().alert();
		Thread.sleep(3000);
		alert3.sendKeys("Suma");//not typing sendkeys...
		Thread.sleep(3000);
		alert3.accept();
		
		
		//dont know yet what method for double click
		//driver.findElement(By.xpath("//input[@id='double-click']")).click();
		//Alert alert4 = driver.switchTo().alert();
		//alert4.accept();
	
	}

}
