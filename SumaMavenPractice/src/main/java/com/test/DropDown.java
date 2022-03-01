package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='country']"));
		
		

		Select s = new Select(dropDown);
		s.selectByIndex(15);
		s.selectByVisibleText("United Kingdom");
		//s.selectByValue("AF");
		List<WebElement> options = s.getOptions();
		System.out.println(options.size());
		
		for(WebElement each : options)
		{
			System.out.println(each.getText());
		}
		
	}

}
