package com.test;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement dropDown = driver.findElement(By.xpath("//div[@class=' css-1wa3eu0-placeholder']"));
		Select s = new Select(dropDown);
		
		
		s.selectByVisibleText("Haryana");
		s.selectByIndex(2);
		
		List<WebElement> options = s.getOptions();
		System.out.println(options.size());
		
		for(WebElement each : options)
		{
			System.out.println(each.getText());
		}
		
		driver.close();

	}

}
