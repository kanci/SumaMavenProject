package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQAAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		//alert.accept();
		
		
		//Alert alert2 = driver.switchTo().alert();
		
		//alert2.dismiss();//somehow it's not working, same with .accept, made by developer..
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		//Alert alert3 = driver.switchTo().alert();
		//alert3.accept();
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(2000);
		alert.sendKeys("Suma");//sendKeys doesn't display on screen, but only shows on console after user types it
		Thread.sleep(2000);
		alert.accept();
		

	}

}
