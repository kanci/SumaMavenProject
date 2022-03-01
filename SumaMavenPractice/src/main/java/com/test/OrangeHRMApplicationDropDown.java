package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRMApplicationDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
		
		WebElement jobTitleDropDown = driver.findElement(By.xpath("//select[@id='candidateSearch_jobTitle']"));
		
		Select selectJobTitle = new Select(jobTitleDropDown);
		//s.selectByIndex(15);
		selectJobTitle.selectByVisibleText("IT Manager");
		
		Thread.sleep(3000);
		
		selectJobTitle.selectByIndex(0);
		
		Thread.sleep(3000);
		
		//selectJobTitle.selectByValue("3");//this should display Engineer
		
		List<WebElement> j = selectJobTitle.getOptions();
		
		for (WebElement each : j) {
			System.out.println(each.getText());
		}
		
		System.out.println();
		
		WebElement jobVacancyDropDown = driver.findElement(By.xpath("//select[@id='candidateSearch_jobVacancy']"));
		
		Select selectJobVacancy = new Select(jobVacancyDropDown);
		
		selectJobVacancy.selectByIndex(3);//if all selected on first dropdown, then it will select Payroll Administrator
		
		Thread.sleep(5000);
		
		List<WebElement> v = selectJobVacancy.getOptions();
		
		for (WebElement each : v) {
			System.out.println(each.getText());
		}
		
		System.out.println();
		
		Thread.sleep(2000);
		
		WebElement hiringManagerDropDown = driver.findElement(By.xpath("//select[@id='candidateSearch_hiringManager']"));
		
		Select selectHiringManager = new Select(hiringManagerDropDown);
		selectHiringManager.selectByIndex(1);
		
		
		List<WebElement> h = selectHiringManager.getOptions();
		
		for (WebElement each : h) {
			System.out.println(each.getText());
		}
		
		System.out.println();
		
		
		
		Thread.sleep(5000);
		
		WebElement statusDropDown = driver.findElement(By.xpath("//select[@id='candidateSearch_status']"));
		
		Select selectStatus = new Select(statusDropDown);
		selectStatus.selectByIndex(4);
		
		
		List<WebElement> s = selectStatus.getOptions();
		
		for (WebElement each : s) {
			System.out.println(each.getText());
		}
		
		System.out.println();
		
		
		Thread.sleep(3000);
		
		WebElement methodApplDropDown = driver.findElement(By.xpath("//select[@id='candidateSearch_modeOfApplication']"));
		
		Select selectApplication = new Select(methodApplDropDown);
		selectApplication.selectByIndex(2);
		
		//List<WebElement> a = selectApplication.getOptions();
		
		//for (WebElement each : a) {
	//		System.out.println(each.getText());
		//}
		
		System.out.println();
		
		
		//to note getFirstSelectedOption, if not user has selected index, first automatic option, otherwise when user already select index, then that will be displayed
		WebElement firstOptAppl = selectApplication.getFirstSelectedOption();
		System.out.println("First selected option for selecting Application is " + firstOptAppl.getText());
		
		
		
		driver.findElement(By.xpath("//input[@id='btnSrch']")).click();
		
		Thread.sleep(2000);
		
		//driver.findElement(By.id("btnRst")).click();
		
		//Thread.sleep(2000);
		driver.close();

	}

}
