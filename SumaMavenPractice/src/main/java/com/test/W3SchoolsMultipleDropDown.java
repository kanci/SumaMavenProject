package com.test;

//import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class W3SchoolsMultipleDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		driver.switchTo().frame("iframeResult");//frame switch to focus
		
		 WebElement carsDropDown = driver.findElement(By.xpath("//select[@id='cars']"));
		
		Select s = new Select(carsDropDown);
		
		s.selectByVisibleText("Volvo");//select Volvo
		Thread.sleep(3000);
		
		s.selectByIndex(1);
		Thread.sleep(3000);
		
		s.selectByIndex(2);
		Thread.sleep(3000);
		
		s.selectByIndex(3);
		Thread.sleep(3000);
		
		s.deselectAll();
		

	}

}
