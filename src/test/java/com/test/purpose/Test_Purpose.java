package com.test.purpose;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Purpose {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
//		WebDriver  driver1 = new ChromeDriver();
//		WebDriver  driver2 = new ChromeDriver();
//		WebDriver  driver3 = new ChromeDriver();
//		WebDriver  driver4 = new ChromeDriver();
//		WebDriver  driver5 = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.quit();
		
	}

}
