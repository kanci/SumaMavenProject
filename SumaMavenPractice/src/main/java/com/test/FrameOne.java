package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameOne {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    driver.switchTo().frame("iframeResult");
	    driver.findElement(By.xpath("//button[text()='Try it']")).click();

	    Thread.sleep(3000);
	    Alert alert = driver.switchTo().alert();
	    alert.sendKeys("Suma is a good person");
	    Thread.sleep(3000);
	    alert.accept();
	    Thread.sleep(3000);
	    

	}

}
