package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		WebElement productsDropDown = driver.findElement(By.xpath("//select[@id='first']"));
		
		Select products = new Select(productsDropDown);
		products.selectByVisibleText("Yahoo");
		
		Thread.sleep(2000);
		
		products.selectByValue("Microsoft");
		
		List<WebElement> p = products.getOptions();
		
		for (WebElement each : p) {
			System.out.println(each.getText());
		}
		
		WebElement animalsDropDown = driver.findElement(By.xpath("//select[@id='animals']"));
		
		Select animals = new Select(animalsDropDown);
		animals.selectByIndex(2);
		
		List<WebElement> a = animals.getOptions();
		
		for (WebElement each : a) {
			System.out.println(each.getText());
		}
		
		WebElement foodsDropDown = driver.findElement(By.xpath("//select[@id='second']"));
		
		Select foods = new Select(foodsDropDown);
		foods.selectByIndex(2);
		Thread.sleep(2000);
		foods.selectByIndex(1);
		Thread.sleep(2000);
		foods.deselectByIndex(2);
		Thread.sleep(2000);
		foods.selectByIndex(0);
		Thread.sleep(2000);
		foods.selectByIndex(3);
		Thread.sleep(2000);
		foods.deselectAll();
		Thread.sleep(2000);
		foods.selectByVisibleText("Pizza");
		Thread.sleep(2000);
		foods.selectByValue("burger");
		Thread.sleep(2000);
		foods.deselectByValue("pizza");
		
		
	
		
		
		List<WebElement> t = foods.getOptions();
		System.out.println(t.size());
		System.out.println("Foods displayed are: ");
		for (WebElement each : t) {
			System.out.println(each.getText());
		}
		
		
		driver.close();
	}

}
