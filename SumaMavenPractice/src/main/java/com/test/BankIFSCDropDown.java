package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BankIFSCDropDown {
	
	public static String parent;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.veethi.com/places/india_banks-ifsc-codes.html");
		System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    
	    parent=driver.getWindowHandle();
	    System.out.println(parent+"is parent String guid");
	    
	    WebElement bankNameDropDown = driver.findElement(By.xpath("//select[@id='selBank']"));
	    Select bankName = new Select(bankNameDropDown);
	    
	    
	    Thread.sleep(5000);
	    bankName.selectByVisibleText("State Bank of India");
	    
	    WebElement bankStateDropDown = driver.findElement(By.xpath("//select[@id='selState']"));
	    
	    Thread.sleep(5000);
	    Select bankState = new Select(bankStateDropDown);
	    
	    
	    Thread.sleep(25000);
	    bankState.selectByVisibleText("Andhra Pradesh");
	   // Thread.sleep(3000);
	    
	    WebElement bankCityDropDown = driver.findElement(By.xpath("//select[@id='selCity']"));
	    
	    Select bankCity = new Select(bankCityDropDown);
	    
	    
	    Thread.sleep(25000);
	    bankCity.selectByVisibleText("Hyderabad");
	    Thread.sleep(3000);
	    
	    WebElement bankBranchDropDown = driver.findElement(By.xpath("//select[@id='selBranch']"));
	    
	    Select bankBranch = new Select(bankBranchDropDown);
	    
	    
	    Thread.sleep(25000);
	    bankBranch.selectByVisibleText("Musheerabad");
	    Thread.sleep(7000);
	    
	    driver.findElement(By.xpath("(//input[@class='btn_grey'])[1]")).click();
	    
	    
	    Thread.sleep(5000);
	    
	    //there's something trouble....
	    //WebElement code = driver.findElement(By.xpath("//a[text()='SBIN0012989']"));
	    
	    //String codeStr=code.toString();
	    
	    //Thread.sleep(3000);
	    driver.switchTo().window(parent);
	    
	    //Thread.sleep(3000);
	    //driver.findElement(By.xpath("//input[@id='txtifsccode']")).sendKeys(codeStr);
	    
	    //Thread.sleep(3000);
	    driver.close();
	    driver.quit();

	}

}
