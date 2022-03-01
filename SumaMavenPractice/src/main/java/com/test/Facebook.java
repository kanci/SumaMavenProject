package com.test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(4000);
		
		WebElement monthDropDown = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select month = new Select(monthDropDown);
		//month.selectByIndex(5);
		month.selectByVisibleText("Mar");
		
		Thread.sleep(2000);
		
		WebElement dayDropDown = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select day = new Select(dayDropDown);
		day.selectByVisibleText("7");
		
		Thread.sleep(2000);
		
		WebElement yearDropDown = driver.findElement(By.xpath("//select[@id='year']"));

		Select year = new Select(yearDropDown);
		year.selectByVisibleText("1993");
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
