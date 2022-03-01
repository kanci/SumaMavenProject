package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMJavaScriptExecutor {
	public static String url="";
	public static String title="";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Dimension dm = new Dimension(450,630);
		driver.manage().window().setSize(dm);
		//driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);

		

		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		
		WebElement user = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		js.executeScript("arguments[0].value='Admin';", user);
		
		Thread.sleep(3000);
		WebElement passwd = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		js.executeScript("arguments[0].value='admin123';", passwd);//note that arguments[1] has javascriptexception..

		Thread.sleep(3000);
		
		WebElement button = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		js.executeScript("arguments[0].click();", button);
		
		//to get full URL of webpage
		url=js.executeScript("return document.URL;").toString();
		System.out.println(url);
		
		
		Thread.sleep(4000);
		
		//scroll to find element
		WebElement maintenance = driver.findElement(By.linkText("Maintenance"));
		js.executeScript("arguments[0].scrollIntoView();", maintenance);
		
		Thread.sleep(3000);
		
		//scroll horizontally all way, using coordinates
		js.executeScript("window.scrollTo(5000,0)");
		
		Thread.sleep(3000);
		
		//go back horizontally left
		js.executeScript("window.scrollTo(0,0)");
		
		
		Thread.sleep(3000);
		
		//to scroll vertically down, all the way to bottom
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(3000);
		
		
		
		//to scroll vertically up
		js.executeScript("window.scrollTo(0,0)");
		
		Thread.sleep(3000);
		
		//scroll down
		js.executeScript("window.scrollTo(0,300)");
		
		Thread.sleep(3000);
		
		//scroll right
		js.executeScript("window.scrollTo(300,300)");
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
