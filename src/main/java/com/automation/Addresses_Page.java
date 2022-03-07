package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addresses_Page {
	
	private WebDriver driver;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement ptc;

	public Addresses_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getPtc() {
		return ptc;
	}
	
	
	

}
