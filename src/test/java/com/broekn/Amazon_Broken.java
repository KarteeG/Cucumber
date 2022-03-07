package com.broekn;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Broken {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		
		List<WebElement> all_links = driver.findElements(By.tagName("link"));
		for(WebElement links: all_links) {
			String attribute = links.getAttribute("href");
			URL u = new URL(attribute);
			HttpURLConnection ht = (HttpURLConnection) u.openConnection();
			int responseCode = ht.getResponseCode();
			if (responseCode>400) {
				System.out.println(attribute);
			}
		}driver.close();
	}

}
