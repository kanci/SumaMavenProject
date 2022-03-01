package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {
	
	public static String name="";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/table");
		System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    
	    WebElement table = driver.findElement(By.xpath("//table[@id='webtable']"));
	    
	    List<WebElement> rows = driver.findElements(By.tagName("tr"));
	    
	    //iterate the loop
	    for(int i=1;i<rows.size(); i++ ) {//i=1; 1<=5
	    	                              //i=2; 2<=5
	    	                              //i=6; 6<=5
	    	List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
	    	
	    	for(int j=0; j<cells.size(); j++) {
	    		name = cells.get(j).getText();
	    		if(name.equals("Selenium Webdriver")) {
	    			System.out.println(cells.get(2).getText());
	    		}
	    	}
	    }

	}

}
