package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Method {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement b;

	public Payment_Method(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getB() {
		return b;
	}
	
	

}
