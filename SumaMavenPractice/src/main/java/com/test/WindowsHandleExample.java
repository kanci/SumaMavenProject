package com.test;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandleExample {
	public static String parent, linkedIn, facebook, twitter;
	public static Set<String> all;
	public static Iterator<String> it;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    parent = driver.getWindowHandle();//Orange HRM Application
	    
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	    
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@id='social-icons']/a)[1]")).click();
	    all = driver.getWindowHandles();
	     
	    it = all.iterator();

	     while(it.hasNext()) { 
	    	 linkedIn=it.next();
	    	 if(!parent.equals(linkedIn)) {
	    		 Thread.sleep(3000);
	    		 driver.switchTo().window(linkedIn);
	    		 
	    	 }

	    }
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//input[@id='email-address']")).sendKeys("sumancherla88@gmail.com");
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("mytweet");
	     Thread.sleep(3000);
	     System.out.println(driver.getCurrentUrl());
	     Thread.sleep(3000);
	     System.out.println(driver.getTitle());
	     Thread.sleep(3000);
	     driver.switchTo().window(parent);

	     driver.findElement(By.xpath("(//div[@id='social-icons']/a)[2]")).click();
	     
	     all = driver.getWindowHandles();
		 it = all.iterator();

		 Thread.sleep(3000);
		 while(it.hasNext()) {
			 Thread.sleep(3000);
		    	 facebook=it.next();
		    	 if((!parent.equals(linkedIn))&&(!parent.equals(facebook))&&(!linkedIn.equals(facebook))) {
		    		 driver.switchTo().window(facebook);
		    	 }
		    }
		 Thread.sleep(3000);
		 System.out.println(driver.getCurrentUrl());
		 Thread.sleep(3000);
		 System.out.println(driver.getTitle());
		 Thread.sleep(10000);//after wait 5 seconds, element needs to be loaded first, its called troubleshooting skills
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sumancherla88@gmail.com");
		 
		 Thread.sleep(3000);
		 driver.switchTo().window(parent);
		     
		 Thread.sleep(3000);

		 driver.findElement(By.xpath("(//div[@id='social-icons']/a)[3]")).click();
		 Thread.sleep(3000);
		 all = driver.getWindowHandles();
		 it = all.iterator();
		 
		 while(it.hasNext()) { 
			 twitter=it.next();
			 if((!parent.equals(linkedIn))&&(!parent.equals(facebook))&&(!parent.equals(twitter))&&(!linkedIn.equals(facebook))&&(!linkedIn.equals(twitter))&&(!facebook.equals(twitter))) {
				 driver.switchTo().window(twitter);
				 Thread.sleep(3000);	 
			 }
			 
		 }
		 System.out.println(driver.getCurrentUrl());
		 Thread.sleep(2000);
		 System.out.println(driver.getTitle());
		 
		 Thread.sleep(3000);
		 driver.switchTo().window(facebook);
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("mypassword");
		 Thread.sleep(3000);
		 driver.close();//to note driver close means only it will close current window/tab, but not all windows
		 Thread.sleep(2000);
		 driver.quit();

	}

}
//i added more conditions in if statement to make it correct and valid, like comparing !window equals to other window